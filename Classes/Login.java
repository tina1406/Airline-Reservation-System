/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static projectgui.ProjectGUI.users;

/**
 *
 * @author Micha
 */
public class Login extends JFrame implements ActionListener {

    public String UserName;
    public String Password;
    JButton Button, Button1;
    JLabel label = new JLabel("UserName:");
    JLabel label1 = new JLabel("Password:");
    JLabel label2 = new JLabel("Type");
    HomePage f = new HomePage();
    JTextField text = new JTextField(10);  //10 is size 
    JPasswordField text1 = new JPasswordField(10);
    JComboBox n1 = new JComboBox(new String[]{"", "Passenger", "Admin", "Manager", "Pilot", "Crew"});

    public Login() {

        setSize(600, 600);
        setLayout(new GridBagLayout());
        setLocation(200, 200);
        Button = new JButton("Login");
        Button1 = new JButton("Back");
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        c.gridx = 0;c.gridy = 0;add(label, c);
        c.gridx = 1;c.gridy = 0;add(text, c);
        c.gridx = 0;c.gridy = 1;add(label1, c);
        c.gridx = 1;c.gridy = 1;add(text1, c);
        c.gridx = 0;c.gridy = 2;add(label2, c);
        c.gridx = 1;c.gridy = 2;add(n1, c);
        c.gridx = 0;c.gridy = 3;add(Button, c);
        c.gridx = 1;c.gridy = 3;add(Button1, c);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setVisible(true);
        Button.addActionListener(this);
        Button1.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(Button)) {
              for (int i = 0; i < users.size(); i++) {
                    if(users.get(i).getUsername().equals(text.getText()) && users.get(i).getPassword().equals(text1.getText())){
                        {  
                        if(users.get(i).getType().equals("Manager")){
                            
                        Manager m = new Manager();// add pilot and crew
                        m.setVisible(true);
                        dispose();
                        break;
                            }
                            else  
                               if(users.get(i).getType().equals("Admin")){      // add manager    
                
                        Admin a = new Admin();
                        a.setVisible(true);
                        dispose();
                        break;
                        
                                    }
                        else  
                               if(users.get(i).getType().equals("Pilot")){ 
                        Pilot p = new Pilot();
                        p.setVisible(true);
                        dispose(); 
                        break;
                               }
                        else  
                               if(users.get(i).getType().equals("Crew")){ 
                        Crew c = new Crew();
                        c.setVisible(true);
                        dispose();   
                        break;
                               }
                               else{
                                   
                        Passenger pa = new Passenger(i);
                        pa.setVisible(true);
                        dispose();
                        break;
                        }
                    }
              }
              }
        //   int count=0;
//                for (int i = 0; i < users.size(); i++) {
//                    if(users.get(i).getUsername().equals(text.getText()) && users.get(i).getPassword().equals(text1.getText())){
//                        
//                       // if(users.get(i).getType().eguals())
//                        JOptionPane.showMessageDialog(null, "Hello "+users.get(i).getFName());
//                        count++;
//                        break;
//                    }
    
//               if(count==0){
//                  JOptionPane.showMessageDialog(null, "Invalid");
//
//                }
        }

    else if(e.getSource().equals(Button1)){
        HomePage h = new HomePage(); // da button rl back 3lshan ywadena 3ala el homepage 
        h.setVisible(true);
        dispose();
       
    }
    
    
    }
}



