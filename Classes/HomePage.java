/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePage extends JFrame implements ActionListener {

    JLabel label = new JLabel("Welcome to Airline Reservation System");
    JButton Login, signUp, CustomersService;

    public HomePage() {
        setSize(600, 600);
        setLocation(200, 200);
        setLayout(new FlowLayout(FlowLayout.CENTER, 120, 120));
        add(label);
        label.setFont(new Font("Serif", Font.PLAIN, 30));
        Login = new JButton("Login");
        signUp = new JButton("Sign Up");
        
        add(Login);
        add(signUp);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setVisible(true);
        Login.addActionListener(this);
        signUp.addActionListener(this);
       

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(Login)) {
            Login d = new Login();
            d.setVisible(true);
            dispose();
        } else if (e.getSource().equals(signUp)) {
            SignUp d = new SignUp();
            d.setVisible(true);
            dispose();
        }
       

    }

}
