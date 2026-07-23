/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto_de_venta;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

/**
 *
 * @author isaim
 */
public class MenuPrincipal extends JFrame{
     
    public void menuVentana(){
        ventana();
        imagenLogo();
    }
    
    public void ventana () {
        setTitle("Punto de Venta");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        add(new JLabel("Menu"));
        setVisible(true);

    }
    
     
    public void imagenLogo(){
     JLabel logo = new JLabel();
     logo.setIcon(new ImageIcon(getClass().getResource("/img/logcarritolla.png")));
        logo.setBounds(20, 20, 128, 128);
        add(logo);
    }
    
    
    
    
    
    
    
}
