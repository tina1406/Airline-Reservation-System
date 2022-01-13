/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

/**
 *
 * @author POWER
 */
public class PrintReportFrame extends JFrame implements ActionListener {

    public String FlightID;
    public String FlightNO;
    public String AirlineCom;
    JButton b1, b2;
    JLabel label1 = new JLabel("Flight ID: ");
    JLabel label2 = new JLabel("Flight Number: ");
    JLabel label3 = new JLabel("Airline Company: ");
    JTextField text = new JTextField(3);  //3 is size 
    JTextField text1 = new JTextField(3);
    JTextField text2 = new JTextField(3);
    JPanel background = new JPanel();

    public PrintReportFrame() {
        setSize(600, 400);
        setLayout(new GridBagLayout());
        setLocation(200, 200);
        add(label1);
        add(label2);
        add(label3);
        b1 = new JButton("Print");
        b2 = new JButton("Cancel");
        label1.setFont(new Font("Serif", Font.PLAIN, 15));
        label2.setFont(new Font("Serif", Font.PLAIN, 15));
        label3.setFont(new Font("Serif", Font.PLAIN, 15));
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;c.gridy = 0;add(label1, c);
        c.gridx = 1;c.gridy = 0;add(text, c);
        c.gridx = 0;c.gridy = 1;add(label2, c);
        c.gridx = 1; c.gridy = 1;add(text1, c);
        c.gridx = 0;c.gridy = 2;add(label3, c);
        c.gridx = 1;c.gridy = 2;add(text2, c);
        c.gridx = 0;c.gridy = 3;add(b1, c);
        c.gridx = 1;c.gridy = 3;add(b2, c);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           if (e.getSource().equals(b1)) {//print button
            //3ayz akhod el info 3ashan a-print men el file esmo flightEdit fe class.
            Flight f = new Flight();
            f.getFlightID(text.getText());
            f.getFlightNO(text1.getText());
            f.getAirlineCom(text2.getText());
            JOptionPane.showMessageDialog(null, "Printed");
            
    }
           else if (e.getSource().equals(b2)) {
            //cancel button.//hyrg3na wara page(manager).
            Manager m = new Manager();
            m.setVisible(true);
            dispose();
            //3ayz arg3 bardo ll admin lw ana gy men 3ando. a3tked hatkon if condition.

        } 
          
}
}
