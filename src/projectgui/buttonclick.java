/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;

import projectgui.ClientThread;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import static projectgui.Client.b;
import static projectgui.Client.b2;
import static projectgui.Client.clientName;
import static projectgui.Client.output;
import static projectgui.Client.socket;
import static projectgui.Client.ta;
import static projectgui.Client.tf;
import static projectgui.Client.tf2;
import static projectgui.Client.userInput;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


  class buttonclick extends JFrame implements ActionListener{
      public static void createGUI()
 {
b=new JButton ("Send");
b2=new JButton ("Enter name");
tf= new JTextField (15) ;
tf2=new JTextField(15);
ta=new JTextArea (12, 20) ;
ta.setEditable(false);
        
JFrame f= new JFrame ("Client") ;
f.setSize (300, 300) ;
f.setLayout (new FlowLayout()) ;
f.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE) ;
f.add (tf2) ;
f.add (b2) ;
f.add (tf) ;
f.add (b) ;
f.add (ta);
f.setVisible(true);
b. addActionListener (new buttonclick());
b2. addActionListener (new buttonclick());

  }
     

@Override
public void actionPerformed (ActionEvent e){
  if (e.getSource().equals(b2)) {
clientName = tf2.getText();
b2.setVisible(true);
}
else if (e. getSource ().equals(b)) {
String text=tf.getText();
String message =( "(" + clientName + ")"+ "message:");
userInput = text;
output.println(message+ " "+userInput);
ClientThread clientThread;
try 
{
    clientThread = new ClientThread (socket, ta);
    clientThread.start () ;
}
catch (IOException ex) 
    {
        java.util.logging.Logger.getLogger(buttonclick.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

}
}
}