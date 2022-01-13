/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author youst
 */
public class Payment extends JFrame implements ActionListener{
public String VisaNo;
public String password;
public String CVV;
JLabel label = new JLabel("Enter the Visa Info");
    JLabel label1 = new JLabel("Visa Number");
    JLabel label2 = new JLabel("Password");
    JLabel label3 = new JLabel("CVV");
    JButton b1,b2;
    JTextField text = new JTextField(3); 
    JTextField text1 = new JTextField(3);
    JTextField text2 = new JTextField(3);
    JPanel background = new JPanel();
    public Payment()
    {
        setSize(600, 600);
        setLocation(200, 200);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        b1 = new JButton("Confirm");
        b2 = new JButton("Cancel");
        c.gridx = -2;c.gridy = 0;add(label, c);
        c.gridx = 0;c.gridy = 1;add(label1, c);
        c.gridx = 1;c.gridy = 1;add(text, c);
        c.gridx = 0;c.gridy = 2;add(label2, c);
        c.gridx = 1;c.gridy = 2;add(text1, c);
        c.gridx = 0;c.gridy = 3;add(label3, c);
        c.gridx = 1;c.gridy = 3;add(text2, c);
        c.gridx=0; c.gridy=4;add(b1,c);
        c.gridx=1; c.gridy=4;add(b2,c);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource().equals(b1))
      {
          JOptionPane.showMessageDialog(null, "Done");
      }
      else if(e.getSource().equals(b2))
      {
//          SeatGUI Sg=new SeatGUI;
//          sg.setVisible(true);
          dispose();
      }
    }
    
}
