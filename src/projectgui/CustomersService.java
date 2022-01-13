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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author POWER
 */
public class CustomersService extends JFrame implements ActionListener {

    JLabel label = new JLabel("Welcome to Customer Service");
    JLabel label1 = new JLabel("Name");
    JLabel label2 = new JLabel("Phone Number");
    JLabel label3 = new JLabel("Message");
    JButton b1, b2;
    JTextField text = new JTextField(3);  //7 is size 
    JTextField text1 = new JTextField(3);
    JTextField text2 = new JTextField(3);//3ayz a khely da box kbeer 3ashan had yketeb fe.
    JPanel background = new JPanel();

    public CustomersService() {
        setSize(600, 400);
        setLayout(new GridBagLayout());
        setLocation(200, 200);
        add(label1);
        add(label2);
        add(label3);
        b1 = new JButton("Send");
        b2 = new JButton("Cancel");
        label.setFont(new Font("Serif", Font.PLAIN, 15));
        label1.setFont(new Font("Serif", Font.PLAIN, 15));
        label2.setFont(new Font("Serif", Font.PLAIN, 15));
        label3.setFont(new Font("Serif", Font.PLAIN, 15));

        GridBagConstraints c = new GridBagConstraints();
        //    c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        add(label, c);
//        c.gridx = 1;
//        c.gridy = 0;
//        add(text, c);
        c.gridx = 0;
        c.gridy = 1;
        add(label1, c);
        c.gridx = 1;
        c.gridy = 1;
        add(text, c);
        c.gridx = 0;
        c.gridy = 2;
        add(label2, c);
        c.gridx = 1;
        c.gridy = 2;
        add(text1, c);
        c.gridx = 0;
        c.gridy = 3;
        add(label3, c);
        c.gridx = 1;
        c.gridy = 3;
        text2.setBounds(0, 1, 65, 40);
        add(text2, c);
        c.gridx = 0;
        c.gridy = 4;
        add(b1, c);
        c.gridx = 1;
        c.gridy = 4;
        add(b2, c);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(b1)) {
            JOptionPane.showMessageDialog(null, "Sent");
            HomePage h = new HomePage();
            h.setVisible(true);
            dispose();
                             

        } else if (e.getSource().equals(b2)) {
            Passenger h = new Passenger();
            h.setVisible(true);
            dispose();
        }
    }
}
