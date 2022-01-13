/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;


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
import static projectgui.ProjectGUI.users;

public class SignUp extends JFrame implements ActionListener{
    
    public String FirstName;
    public String LastName;
    public String Email;
    public String PhoneNumber;
    public String UserName;
    public String Password;
    public String DateOfBirth;
    public String PlaceOfBirth;
    public String Nationality;
    public String Address;
    public Boolean Gender;
    public String ID;
    public Person u;
    
    JButton Button4,Button5;
    
    JLabel label   =new JLabel("FirstName:");
    JLabel label2  =new JLabel("LastName:");
    JLabel label3  =new JLabel("Email:");
    JLabel label4  =new JLabel("Phone Number:");
    JLabel label5  =new JLabel("UserName:");
    JLabel label6  =new JLabel("Password:");
    JLabel label7  =new JLabel("Date of Birth:");
    JLabel label8  =new JLabel("Place of Birth:");
    JLabel label9  =new JLabel("Nationality:");
    JLabel label10 =new JLabel("Address:");
    JLabel label11 =new JLabel("Gender:");
    JLabel label12 =new JLabel("ID:");
    JLabel label13 = new JLabel("Type");
    JTextField text  = new JTextField(10);  //10 is size 
    JTextField text1 = new JTextField(10); 
    JTextField text2 = new JTextField(10); 
    JTextField text3 = new JTextField(10); 
    JTextField text4 = new JTextField(10); 
    JTextField text5 = new JTextField(10); 
    JTextField text6 = new JTextField(10); 
    JTextField text7 = new JTextField(10); 
    JTextField text8 = new JTextField(10); 
    JTextField text9 = new JTextField(10); 
    JTextField text10 = new JTextField(10); 
    JPanel background =new JPanel();

    
    
        
    JComboBox pob = new JComboBox(new String[]{"","Australia","Austria", "Belgium", "Brazil", "China", "Colombia", "Denmark", "Dominica", "Egypt"
             , "Ethiopia", "Fiji", "France", "Germany", "Hungary", "India", "Japan", "Lebanon", "Mexico", "New Zealand", "Philippines"});
    JComboBox n = new JComboBox(new String[]{"","Afghan","Albanian","Algerian","American","British","Danish","Egyptian","French","Russian"});
    JComboBox n1 = new JComboBox(new String[]{"","Passenger","Admin","Manager","Pilot","Crew"});
    JRadioButton g=new JRadioButton("Female");
    JRadioButton g2=new JRadioButton("Male");
    ButtonGroup bg=new ButtonGroup();
                                        /***********Constructor************/
    
    public SignUp(){
    setSize(600,600);
   
    setLocation(200,200);//location beta3 elframe nafso
    g.setActionCommand("Female");
    g2.setActionCommand("Male");
    bg.add(g);
    bg.add(g2);
    
        setLayout(new GridBagLayout());
            GridBagConstraints c=new GridBagConstraints();
    c.fill=GridBagConstraints.HORIZONTAL;
    
      Button4 = new JButton("Save");
   Button5 = new JButton("Back");
    c.gridx=0;c.gridy=0; add(label,c);
    c.gridx=1;c.gridy=0; add(text,c);
    c.gridx=0;c.gridy=1; add(label2,c);
    c.gridx=1;c.gridy=1; add(text1,c);
    c.gridx=0;c.gridy=2; add(label3,c);
    c.gridx=1;c.gridy=2; add(text2,c);
    c.gridx=0;c.gridy=3; add(label4,c);
    c.gridx=1;c.gridy=3; add(text3,c);
    c.gridx=0;c.gridy=4; add(label5,c);
    c.gridx=1;c.gridy=4; add(text4,c);
    c.gridx=0;c.gridy=5; add(label6,c);
    c.gridx=1;c.gridy=5; add(text5,c);

    
    c.gridx=0;c.gridy=6; add(label7,c);
    c.gridx=1;c.gridy=6; add(text6,c);
    c.gridx=0;c.gridy=7; add(label8,c);
    c.gridx=1;c.gridy=7; add(pob,c);
    c.gridx=0;c.gridy=8; add(label9,c);
    c.gridx=1;c.gridy=8; add(n,c);
    
    c.gridx=0;c.gridy=9; add(label10,c);
    c.gridx=1;c.gridy=9; add(text8,c);
    c.gridx=0;c.gridy=10; add(label11,c);
    c.gridx=1;c.gridy=10; add(g,c);
    c.gridx=2;c.gridy=10; add(g2,c);
    c.gridx=0;c.gridy=11; add(label12,c);
    c.gridx=1;c.gridy=11; add(text10,c);
    c.gridx=0;c.gridy=12; add(label13,c);
    c.gridx=1;c.gridy=12; add(n1,c);
    c.gridx=0;c.gridy=13; add(Button4,c);
    c.gridx=1;c.gridy=13; add(Button5,c);
    
   //background.setBackground(Color.WHITE);
    //setContentPane(background);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    Button4.addActionListener(this);
    Button5.addActionListener(this);
    
    

}
    @Override
    public void actionPerformed(ActionEvent e) {
           if(e.getSource().equals(Button4)){
//          SignUp d= new SignUp();
//          d.setVisible(true);
//           dispose();
            u=new Person();
            u.setFName(text.getText());
            u.setLName(text1.getText());
            u.setEmail(text2.getText());
            u.setPhoneNumber(text3.getText());
            u.setUsername(text4.getText());
            u.setPassword(text5.getText());
            u.setDateOfBirth(text6.getText());
            u.setPlaceOfBirth(pob.getSelectedItem().toString());
            u.setNationality(n.getSelectedItem().toString());
            u.setType(n1.getSelectedItem().toString());
         //   u.setType("Passenger");
            u.setAddress(text8.getText());
            u.setGender(bg.getSelection().getActionCommand());
            u.setId(Integer.parseInt(text10.getText()));
            
         

            
            users.add(u);
               try {
                   Person.writetofile();
               } catch (IOException ex) {
                   Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
               }
                                        JOptionPane.showMessageDialog(null, "Saved");

       }
       else if(e.getSource().equals(Button5)){
         HomePage h= new HomePage(); // da button rl back 3lshan ywadena 3ala el homepage 
          h.setVisible(true);
           dispose();
       }

    }
    
 
}
