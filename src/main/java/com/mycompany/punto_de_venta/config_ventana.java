/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto_de_venta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author isaim
 */
public class config_ventana extends JFrame implements ActionListener{
    
    
    
    JTextField txtUsuario;
    JPasswordField txtContrasena;
    private JButton boton;
    

    
    
    public void configurarVentana(){
        setTitle("Punto de Venta");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
         
        JLabel titulo = new JLabel("Iniciar sesión");
        JLabel usuario = new JLabel("usuario: ");
        JLabel entrada = new JLabel("Contraseña: ");
        // pocision del texto x , y
        titulo.setBounds(200, 40, 120, 30);
        usuario.setBounds(15,68 , 130, 50);
        entrada.setBounds(20,100, 150, 40);
        // Aregamos el titulo
        
        add(titulo);
        add(usuario);
        add(entrada);
        componentes();
        
        btnEventos();
       
        
        setVisible(true);
    }
    
    public void componentes(){
        txtUsuario = new JTextField();
        txtContrasena = new JPasswordField();
        txtUsuario.setBounds(65,80, 100, 30);
        txtContrasena.setBounds(100, 110, 100, 30);
       
        add(txtContrasena);
        add(txtUsuario);
    }
    
    public void btnEventos (){
        boton = new JButton("Aceptar");
        boton.setBounds(30, 150, 100, 50);
            add(boton);
            boton.addActionListener((ActionListener) this);    }   
    
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == boton) {
                
                iniciarSesion();                
                
                //String usuario = txtUsuario.getText();

                //String contrasena = String.valueOf(txtContrasena.getPassword());

                //System.out.println(usuario);
                //System.out.println(contrasena);
            }
        }
        
        public void iniciarSesion(){
            Login login = new Login();
            MenuPrincipal menu = new MenuPrincipal();
            String usuario = txtUsuario.getText();
            String pass = String.valueOf(txtContrasena.getPassword());
            
            if (usuario.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                "Complete todos los campos");
                return;
            }

            if (login.validarUsuario(usuario, pass)) {
                
                JOptionPane.showMessageDialog(this,
                "Bienvenido " + usuario);
                
                menu.ventana();
                this.dispose();
                
            } else {
                JOptionPane.showMessageDialog(this,
                "Usuario o contraseña incorrectos");
            }
            
        }
        
        

       
   
        

      
        
}
