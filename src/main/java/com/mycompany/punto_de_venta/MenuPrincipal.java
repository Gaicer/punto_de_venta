/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto_de_venta;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author isaim
 */
public class MenuPrincipal extends JFrame{
    
    public void ventana () {
        setTitle("Punto de Venta");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        add(new JLabel("Menu"));
        
    }
    
    
}
