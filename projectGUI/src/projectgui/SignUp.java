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
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

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
    JRadioButton g=new JRadioButton("Female");
    JRadioButton g2=new JRadioButton("Male");
   
                                        /***********Constructor************/
    
    public SignUp(){
    setSize(600,600);
    //setLayout(new FlowLayout());
    // setLayout(new GridLayout());
    //setLayout(new GridBagLayout());
    setLocation(200,200);//location beta3 elframe nafso
    
   //setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
    

   //background.setBackground(Color.WHITE);
    //setContentPane(background);
   



    
    //FirstName
    add(label);add(text);
    
    //Lastname 
    add(label2);add(text1);
    //Email
    add(label3);add(text2);
    //PhoneNumber
    add(label4);add(text3);
    //username
    add(label5);add(text4);
    //Password
    add(label6);add(text5);
    //Date of birth
    add(label7);add(text6);
    //Place of Birth
    add(label8);add(pob);
    //Nationality
    add(label9);add(n);
    //Address
    add(label10);add(text8);
    //Gender
    add(label11);add(g);add(g2);
    //ID
    add(label12);add(text10);
    
                                         /******Buttons*****/
                                         
   Button4 = new JButton("Save");
   Button5 = new JButton("Back");
    add(Button4);
    add(Button5);


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
       }
       else if(e.getSource().equals(Button5)){
         HomePage h= new HomePage(); // da button rl back 3lshan ywadena 3ala el homepage 
          h.setVisible(true);
           dispose();
       }

    }
    
 
}
