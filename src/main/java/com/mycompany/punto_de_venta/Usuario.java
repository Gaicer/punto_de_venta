/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto_de_venta;

/**
 *
 * @author isaim
 */
 class Usuario {
    private String nombre;
    private String Contrasena;

    public Usuario(String nombre, String Contrasena) {
        this.nombre = nombre;
        this.Contrasena = Contrasena;
    }
    
     public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return Contrasena;
    }
}
