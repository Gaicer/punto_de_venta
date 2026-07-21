/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto_de_venta;

import java.util.ArrayList;

/**
 *
 * @author isaim
 */
public class Login{
    

        private ArrayList<Usuario> usuarios = new ArrayList<>();

        public Login(){
            usuarios.add(new Usuario("isai","9135"));
            
        }
        
        boolean validarUsuario(String nombre, String contrasena) {

        for ( Usuario u: usuarios) {

        if (u.getNombre().equals(nombre) &&
            u.getContrasena().equals(contrasena)) {

            return true; 
            }
        }

        return false; 
    }
        

}
