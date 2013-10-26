/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servisportvalencia.tienda.datos;
import com.servisportvalencia.tienda.usuarios.Usuario;

import java.util.List;

/**
 *
 * @author KiKe
 */
public interface UsuarioDAO extends GenericDAO <Usuario, Integer>{
    public List<Usuario> findByCodigo(String Codigo);
    public List<Usuario> findByNombre(String letraNombre);
}
