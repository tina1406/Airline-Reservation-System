/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projectgui.PassengerchatThread;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author student
 */
public class Passengerchat extends JFrame implements ActionListener {
   JButton b = new JButton("Enter yoour name:");
   JButton b1 = new JButton("Send:");
   JTextField text1 = new JTextField(10); 
   JTextField text2 = new JTextField(10);
   JTextArea t = new JTextArea(12,20);
    static Socket s;
   static String name="empty",msg;
   static PrintWriter pw;
    Passengerchat() throws IOException{
        GridBagConstraints c=new GridBagConstraints();
    c.fill=GridBagConstraints.HORIZONTAL;
       //JFrame f= new JFrame();
       c.gridx=0;c.gridy=0; add(b,c);
    c.gridx=1;c.gridy=0; add(text1,c);
    c.gridx=0;c.gridy=1; add(b1,c);
    c.gridx=1;c.gridy=1; add(text2,c);
    b.addActionListener((ActionListener) this);
    b1.addActionListener(this);
       setSize(600, 400);
       t.setEditable(false);
        setLayout(new GridBagLayout());
        setLocation(200, 200);
setVisible(true);
        s=new Socket("localhost",800);
        Scanner sc=new Scanner(System.in);
                    pw=new PrintWriter(s.getOutputStream(),true);
PassengerchatThread ct=new PassengerchatThread(s);
            ct.start();
        while(true){
            if(name.equals("empty")){
                System.out.println("enter your name");
                name=sc.nextLine();
            }
            msg=sc.nextLine();
            pw.println(name+" : "+msg);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        }
        
    }

    private void add(Socket s) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource().equals(b)){
             
         
             
         }
    }
}
