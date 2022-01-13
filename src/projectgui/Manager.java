/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import projectgui.PrintReportFrame;
import projectgui.UpdateFrame;
import static projectgui.ProjectGUI.users;

/**
 *
 * @author youst
 */
public class Manager extends JFrame implements ActionListener {

    JLabel label = new JLabel("Welcome Manager");
    JButton a, a1,b;

    Manager() {
        setSize(600, 400);
        setLayout(new GridBagLayout());
        setLocation(200, 200);
        add(label);
        a = new JButton("Add Crew");
        a1 = new JButton("Add Pilot");
        b = new JButton ("Print Report");
        label.setFont(new Font("Serif", Font.PLAIN, 30));
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = -2;
        c.gridy = 0;
        add(label, c);
        c.gridx = 1;
        c.gridy = 2;
        add(a, c);
        c.gridx = 1;
        c.gridy = 3;
        add(a1, c);
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  setVisible(true);
     
        a.addActionListener(this);
        a1.addActionListener(this);
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource().equals(a)) {
            AddCrew c = new AddCrew();
            c.setVisible(true);
            dispose();
        } else if (e.getSource().equals(a1)) {
            AddPilot p = new AddPilot();
            p.setVisible(true);
            dispose();

        }
    }
    public void update(){
        
    }
    public void AddCrew(Crew c){
      
    }
    public void AddPilot(Pilot p){
         
    }
    public void AddFlights(Flight f){
        
    }  
}
