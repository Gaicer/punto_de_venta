/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto_de_venta;
import javax.swing.*;

/**
 *
 * @author isaim
 */
public class config_ventana extends JFrame{

    public void ventana(){
        setTitle("Punto de Venta");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
         
        JLabel titulo = new JLabel("Iniciar sesión");
        JLabel entrada = new JLabel("Contraseña: ");
        // pocision del texto x , y
        titulo.setBounds(200, 40, 120, 30);
        entrada.setBounds(20,100, 150, 40);
        // Aregamos el titulo
        
        add(titulo);
        add(entrada);
        boton();
        
        setVisible(true);
         

    }
    
    public void boton (){
    JButton boton = new JButton("Aceptar");
    boton.setBounds(30, 150, 100, 60);
    add(boton);

    }
    
    
}
