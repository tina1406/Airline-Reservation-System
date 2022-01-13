/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author Micha
 */
public class Login extends JFrame implements ActionListener{
    public String UserName;
    public String Password;
    JButton Button,Button1;
    JLabel label  =new JLabel("UserName:");
    JLabel label1  =new JLabel("Password:");
    HomePage f = new HomePage();
    JTextField text  = new JTextField(10);  //10 is size 
    JTextField text1 = new JTextField(10);
    
    public Login(){
    setSize(600,600);
    setLayout(new GridBagLayout());
    setLocation(200,200);
    
    add(label);add(text);

  
    
    add(label1);add(text1);
    Button = new JButton("Login");
    Button1 = new JButton("Back");
    add(Button);
    add(Button1);


    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    Button.addActionListener(this);
    Button1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          if(e.getSource().equals(Button)){
       //   Reservation d= new Reservation();
        //  d.setVisible(true);
          dispose();
       }
       else if(e.getSource().equals(Button1)){
         HomePage h= new HomePage(); // da button rl back 3lshan ywadena 3ala el homepage 
          h.setVisible(true);
           dispose();
       }
        
    }
}
