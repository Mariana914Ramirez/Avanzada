/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shat.vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class Login extends JFrame implements ActionListener{
   
    private JButton Cancelar;
    private JButton Registrar;
    private JButton Ingresar;
    private JLabel titulo;
    private JLabel texto;
    private JTextField correo;
    private JTextField password;
    
    public Login()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Shat");
        this.getContentPane().setBackground(new Color(42,56,59));
        
        
        Ingresar=new JButton("Ingresar");
        Ingresar.setBackground(new Color(86,244,66));
        Ingresar.setFont(new Font("Consolas", Font.BOLD, 20));
        Ingresar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        Registrar=new JButton("Registrate aquí");
        Registrar.setBackground(new Color(76,182,206));
        Registrar.setFont(new Font("Consolas", Font.BOLD, 20));
        Registrar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {   
                Registro formulario = new Registro();
        
                formulario.setVisible(true);
            }
        });
        
        titulo=new JLabel("Login", JLabel.CENTER);
        titulo.setFont(new Font("Consolas", Font.BOLD, 20));
        titulo.setForeground(Color.white);
        
        texto=new JLabel("¿Aún no tienes cuenta?", JLabel.CENTER);
        texto.setFont(new Font("Consolas", Font.BOLD, 15));
        texto.setForeground(Color.white);
        
        correo=new JTextField("Correo");
        correo.setFont(new Font("Consolas", Font.BOLD, 20));
        correo.setSize(150, 100);
        correo.setLocation(0, 150);
        this.setLayout(null);
        
        password=new JTextField("Password");
        password.setFont(new Font("Consolas", Font.BOLD, 20));
        password.setSize(150, 100);
        password.setLocation(0, 300);
        this.setLayout(null);
        
        GroupLayout datos=new GroupLayout(this.getContentPane());
        
        datos.setHorizontalGroup(
                datos.createParallelGroup()
                    .addComponent(titulo, 80, 400, 1200)
                    .addComponent(correo, 80, 80, 1200)
                    .addComponent(password, 80, 80, 1200)
                    .addComponent(Ingresar, 80, 80, 1200)
                    .addComponent(texto, 80, 80, 1200)
                    .addComponent(Registrar, 80, 80, 1200)
                                                           
        );
        
        
        datos.setVerticalGroup(
                datos.createSequentialGroup()
                    .addComponent(titulo, 10, 40, 80)
                    .addComponent(correo, 10, 40, 80)
                    .addComponent(password, 10, 40, 80)
                    .addComponent(Ingresar, 10, 40, 80)
                    .addComponent(texto, 10, 40, 1200)
                    .addComponent(Registrar, 10, 40, 80)
                                                           
        );
        datos.setAutoCreateContainerGaps(true);
        datos.setAutoCreateGaps(true);
        setLayout(datos);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
