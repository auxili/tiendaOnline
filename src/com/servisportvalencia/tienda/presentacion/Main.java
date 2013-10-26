/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servisportvalencia.tienda.presentacion;

import com.servisportvalencia.tienda.datos.UsuarioDAOImpHibernate;
import com.servisportvalencia.tienda.datos.UsuarioDAO;
import com.servisportvalencia.tienda.usuarios.Usuario;
import com.servisportvalencia.tienda.usuarios.TipoUsuario;
import com.servisportvalencia.tienda.usuarios.MetodoPago;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();
        
        UsuarioDAO usuarioDAO = new UsuarioDAOImpHibernate(sessionFactory);
        usuarioDAO.findAll();
        sessionFactory.close();
    }
}
