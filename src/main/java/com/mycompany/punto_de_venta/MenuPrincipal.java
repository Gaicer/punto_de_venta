
package com.mycompany.punto_de_venta;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author isaim
 */
public class MenuPrincipal extends JFrame{
    JLabel logo = new JLabel();
    JTextField txtRanura;

    public void ventana() {
        setTitle("Punto de Venta");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

     
        imagenLogo();
        componentesMenu();
       
        setVisible(true);
    }
    
        public void imagenLogo() {
            java.net.URL imgURL = getClass().getResource("/imagenes/imagen.png");

            if (imgURL != null) {
                ImageIcon originalIcon = new ImageIcon(imgURL);

                // Redimensionar la imagen para que encaje en el Label (128x128)
                Image imgEscalada = originalIcon.getImage().getScaledInstance(128, 128, Image.SCALE_SMOOTH);
                ImageIcon imagenFinal = new ImageIcon(imgEscalada);

                if (logo == null) {
                    logo = new JLabel();
                }

                logo.setIcon(imagenFinal);
                logo.setBounds(20, 5, 90, 128);
                add(logo);

            } else {
                System.err.println("No se encontró la imagen en /imagenes/imagen.png");
            }
        }
    
        
        
        public void componentesMenu(){
           txtRanura  = new JTextField();
           txtRanura.setBounds(65,100, 200, 30);
           
           
           add(txtRanura);
        }
        


    
    
    
    
    
}
