/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import projectgui.UpdateFrame;

/**
 *
 * @author youst
 */
public class Admin extends JFrame implements ActionListener {

    JLabel label = new JLabel("Welcome Admin");
    JButton a,a1,b1, b3,b4;

    Admin() {
        setSize(600, 400);
        setLayout(new GridBagLayout());
        setLocation(200, 200);
        add(label);
        a = new JButton("Add Flights");
        a1 = new JButton("Add Manager");
        b1 = new JButton("Update"); 
        b3 = new JButton("Delete Manager");
        b4 = new JButton ("Back");
        label.setFont(new Font("Serif", Font.PLAIN, 30));
 GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = -2;c.gridy = 0;add(label, c);
        c.gridx = 1;c.gridy = 1;add(b1, c);
        c.gridx = 1;c.gridy = 3;add(b3, c);
        c.gridx= 1; c.gridy= 4;add(a,c);
        c.gridx= 1; c.gridy= 5;add(a1,c);
        c.gridx= 1; c.gridy= 6; add(b3,c);
        c.gridx= 1; c.gridy= 6; add(b4,c);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
         if (e.getSource().equals(b1)) {
            UpdateFrame update = new UpdateFrame();
            update.setVisible(true);
            dispose();
//        } else if (e.getSource().equals(b2)) {
//            PrintReportFrame PRF = new PrintReportFrame();
//            PRF.setVisible(true);
//            dispose();

        } else if (e.getSource().equals(b4)){
           HomePage h = new HomePage();
           h.setVisible(true);
           dispose();
        
          } else if (e.getSource().equals(a1)) {
            AddManager m = new AddManager();
            m.setVisible(true);

          } else if (e.getSource().equals(a)) {
            Addflight a = new Addflight();
            a.setVisible(true);
            dispose();

          } else if (e.getSource().equals(a)) {
            Addflight a = new Addflight();
            a.setVisible(true);
            dispose();

         } else if (e.getSource().equals(b3)) {
            // delete from file
    }
}
    public void update(){
        
    }
    public void AddManager(Manager M){
    
    }
    public void ViewManager(Manager M){
        
    }
    public void DeleteManager(Manager M){
        
    }
}