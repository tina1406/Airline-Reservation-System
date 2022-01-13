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
import javax.swing.JOptionPane;

/**
 *
 * @author youst
 */
public class AssignedFlights extends JFrame implements ActionListener{
     ArrayList<String> Flights = new ArrayList<String>();
      JLabel label = new JLabel("Assigned Flights");
       JButton b1;
     AssignedFlights(){
        b1 = new JButton("Back");
        
        setSize(600,600);
        setLayout(new GridBagLayout());
        setLocation(200, 200);
        add(label);
        label.setFont(new Font("Serif", Font.PLAIN, 30));
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = -2;c.gridy = 0;add(label, c);
        c.gridx = 1;c.gridy = 2;add(b1, c);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setVisible(true);
        b1.addActionListener(this);
     }
    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource().equals(b1)) {
    HomePage h = new HomePage();
    h.setVisible(true);
    //JOptionPane.showMessageDialog(null, "Saved");       
    dispose();
       

        } else {
           // System.out.println("error");
        }    }
}
