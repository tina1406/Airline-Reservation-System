/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import static projectgui.ProjectGUI.Flights;
import static projectgui.ProjectGUI.users;

/**
 *
 * @author POWER
 */
public class Addflight extends JFrame implements ActionListener {

    public String FlightNO;
    public String Capacity;
    public String Airline;
    public String NoOfSeats;
    public String Dfrom;
    public String Dto;

    JButton add, cancel;
    JLabel l = new JLabel("Flight Details");
    JLabel label = new JLabel("Enter the Flight Info");
    JLabel label1 = new JLabel("Flight Number");
    JLabel label2 = new JLabel("Number of Seats");
    JLabel label3 = new JLabel("Capacity");
    JLabel label4 = new JLabel("Airline Company");
    JLabel label5 = new JLabel("From");
    JLabel label6 = new JLabel("To");
    JTextField text = new JTextField(6);  //10 is size 
    JTextField text1 = new JTextField(6);
    JTextField text2 = new JTextField(6);
    JTextField text3 = new JTextField(6);
    JTextField text4 = new JTextField(6);
    JTextField text5 = new JTextField(6);
    JPanel background = new JPanel();
    JComboBox from = new JComboBox(new String[]{"", "Australia", "Austria", "Belgium", "Brazil", "China", "Colombia", "Denmark", "Dominica", "Egypt",
        "Ethiopia", "Fiji", "France", "Germany", "Hungary", "India", "Japan", "Lebanon", "Mexico", "New Zealand", "Philippines"});
    JComboBox to = new JComboBox(new String[]{"", "Australia", "Austria", "Belgium", "Brazil", "China", "Colombia", "Denmark", "Dominica", "Egypt",
        "Ethiopia", "Fiji", "France", "Germany", "Hungary", "India", "Japan", "Lebanon", "Mexico", "New Zealand", "Philippines"});

    public Addflight() {
        setSize(600, 600);
        setLocation(200, 200);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        add = new JButton("Add");
        cancel = new JButton("Cancel");
        c.gridx = -2;c.gridy = 0;add(label, c);
        c.gridx = 0;c.gridy = 1;add(label1, c);
        c.gridx = 1;c.gridy = 1;add(text, c);
        c.gridx = 0;c.gridy = 2;add(label2, c);
        c.gridx = 1;c.gridy = 2;add(text1, c);
        c.gridx = 0;c.gridy = 3;add(label3, c);
        c.gridx = 1;c.gridy = 3;add(text2, c);
        c.gridx = 0;c.gridy = 4;add(label4, c);
        c.gridx = 1;c.gridy = 4;add(text3, c);
        c.gridx = 0;c.gridy = 5;add(label5, c);
        c.gridx = 1;c.gridy = 5;add(from, c);
        c.gridx = 0;c.gridy = 6;add(label6, c);
        c.gridx = 1;c.gridy = 6;add(to, c);
        c.gridx = 0;c.gridy = 7;add(add, c);
        c.gridx = 1;c.gridy = 7;add(cancel, c);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add.addActionListener(this);
        cancel.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(add)) {
            Flight f = new Flight();
            f.setFlightNO(text.getText());
            f.setNoOfSeats(text1.getText());
            f.setCapacity(text2.getText());
            f.setAirlineCom(text3.getText());
            f.setDfrom(from.getSelectedItem().toString());
            f.setDto(to.getSelectedItem().toString());
            Flights.add(f);
            try {
                Flight.writetofile();
            } catch (IOException ex) {
                Logger.getLogger(Flight.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Saved");

        } else if (e.getSource().equals(cancel)) {
            Admin a = new Admin();
            a.setVisible(true);
            dispose();
        }
    }

}
