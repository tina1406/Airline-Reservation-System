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
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author youst
 */
public class Crew extends JFrame implements ActionListener{


    JLabel label = new JLabel("Welcome Pilot");
    JLabel label1 = new JLabel("Get Assigned Flights");
    JButton b1;

    Crew() {
    setSize(600,600);
    setLocation(200,200);
        setSize(600, 400);
        setLayout(new GridBagLayout());
        setLocation(200, 200);
        add(label);
        b1 = new JButton("Get Assigned Flights");
        label.setFont(new Font("Serif", Font.PLAIN, 30));
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
         c.gridx = -2;
        c.gridy = 0;
        add(label, c);
        c.gridx = 1;
        c.gridy = 2;
        add(b1, c);
//        add(b1);
//        add(b2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // setVisible(true);
        b1.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(b1)) {
            AssignedFlights A = new AssignedFlights();
            A.setVisible(true);
            dispose();
       

        } else {
           // System.out.println("error");
        }
    }
   public void getAssignedFlights(ArrayList<Flight>flights) {
    // flights.
 }
}


