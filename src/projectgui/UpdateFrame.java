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
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import static projectgui.ProjectGUI.Flights;

/**
 *
 * @author POWER
 */
public class UpdateFrame extends JFrame implements ActionListener {

    public String FlightID;
    public String FlightNO;
    public String TakenSeats;
    public String AirlineCom;
    public String pricePerTickets;
    public String Capacity;
    public String Stauts;
    JButton b1, b2;
    JLabel label1 = new JLabel("Flight ID: ");
    JLabel label2 = new JLabel("Flight Number: ");
    JLabel label3 = new JLabel("No. Of Seats Taken: ");
    JLabel label4 = new JLabel("Airline Company: ");
    JLabel label5 = new JLabel("Price Per Ticket:");
    JLabel label6 = new JLabel("Capacity");
    JLabel label7 = new JLabel("Status:");

    JTextField text = new JTextField(7);  //7 is size 
    JTextField text1 = new JTextField(7);
    JTextField text2 = new JTextField(7);
    JTextField text3 = new JTextField(7);
    JTextField text4 = new JTextField(7);
    JTextField text5 = new JTextField(7);
    JTextField text6 = new JTextField(7);
    JPanel background = new JPanel();
    JComboBox pob = new JComboBox(new String[]{"Delayed", "Arrived", "On Time"});

    public UpdateFrame() {
        setSize(600, 400);
        setLayout(new GridBagLayout());
        setLocation(200, 200);
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
        b1 = new JButton("Update");
        b2 = new JButton("Cancel");
        label1.setFont(new Font("Serif", Font.PLAIN, 15));
        label2.setFont(new Font("Serif", Font.PLAIN, 15));
        label3.setFont(new Font("Serif", Font.PLAIN, 15));
        label4.setFont(new Font("Serif", Font.PLAIN, 15));
        label5.setFont(new Font("Serif", Font.PLAIN, 15));
        label6.setFont(new Font("Serif", Font.PLAIN, 15));
        label7.setFont(new Font("Serif", Font.PLAIN, 15));
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        add(label1, c);
        c.gridx = 1;
        c.gridy = 0;
        add(text, c);
        c.gridx = 0;
        c.gridy = 1;
        add(label2, c);
        c.gridx = 1;
        c.gridy = 1;
        add(text1, c);
        c.gridx = 0;
        c.gridy = 2;
        add(label3, c);
        c.gridx = 1;
        c.gridy = 2;
        add(text2, c);
        c.gridx = 0;
        c.gridy = 3;
        add(label4, c);
        c.gridx = 1;
        c.gridy = 3;
        add(text3, c);
        c.gridx = 0;
        c.gridy = 4;
        add(label5, c);
        c.gridx = 1;
        c.gridy = 4;
        add(text4, c);
        c.gridx = 0;
        c.gridy = 5;
        add(label6, c);
        c.gridx = 1;
        c.gridy = 5;
        add(text5, c);
        c.gridx = 0;
        c.gridy = 7;
        add(label7, c);
        c.gridx = 1;
        c.gridy = 7;
        add(pob, c);
c.gridx=0;c.gridy=12; add(b1,c);
    c.gridx=1;c.gridy=12; add(b2,c);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(b1)) {
            //save button. 3ayz a-save el info the updated fe file esmo flightEdit fe class.
            Flight f = new Flight();
            f.setFlightID(text.getText());
            f.setFlightNO(text1.getText());
            f.setTakenSeats(text2.getText());
            f.setAirlineCom(text3.getText());
            f.setPricePerTickets(text4.getText());
            f.setCapacity(text5.getText());
            f.setStatus(pob.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, "Saved");
            Flights.add(f);
            //mesh 3aref ahot fel file el updated info.
//            try {
//                   Flight.writetofile();
//               } catch (IOException ex) {
//                  
//               }
        } else if (e.getSource().equals(b2)) {
            //cancel button.//hyrg3na wara page(manager).
            Manager m = new Manager();
            m.setVisible(true);
            dispose();
            //3ayz arg3 bardo ll admin lw ana gy men 3ando. a3tked hatkon if condition.

        } else {
           
        }

    }

    

}
