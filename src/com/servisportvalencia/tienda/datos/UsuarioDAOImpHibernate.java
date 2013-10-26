/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servisportvalencia.tienda.datos;

import com.servisportvalencia.tienda.usuarios.Usuario;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author KiKe
 */
public class UsuarioDAOImpHibernate implements UsuarioDAO {

    private SessionFactory sessionFactory;

    public UsuarioDAOImpHibernate(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    //READ

    @Override
    public Usuario read(Integer idUsuario) {
        Session session = sessionFactory.openSession();
        Usuario usuario;

        try {
            session.beginTransaction();
            usuario = (Usuario) session.get(Usuario.class, idUsuario);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw new RuntimeException(ex);
        } finally {
            if ((session != null) && (session.isConnected() == true)) {
                session.close();
            }
        }
        return usuario;
    }

    //UPDATE
    @Override
    public void update(Usuario usuario) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.update(usuario);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw new RuntimeException(ex);
        } finally {
            if ((session != null) && (session.isConnected() == true)) {
                session.close();
            }
        }
    }

    //DELETE
    @Override
    public void delete(Integer idUsuario) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.delete(idUsuario);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw new RuntimeException(ex);
        } finally {
            if ((session != null) && (session.isConnected() == true)) {
                session.close();
            }
        }
    }

    //INSERT
    @Override
    public void insert(Usuario usuario) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(usuario);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw new RuntimeException(ex);
        } finally {
            if ((session != null) && (session.isConnected() == true)) {
                session.close();
            }
        }
    }

    @Override
    public List<Usuario> findByCodigo(String Codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> findByNombre(String letraNombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> findAll() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT usuario FROM Usuario usuario");
        List list = query.list();
        session.close();
        return list;
    }
}
