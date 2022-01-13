/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;

import java.awt.FlowLayout;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import projectgui.ServerThread;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Server{
public static ArrayList<ServerThread> threadlist = new ArrayList<>();
static ServerSocket serversocket;
static JTextArea ta;
public static void main (String[] args)throws IOException{
serversocket = new ServerSocket (5000) ;
createGUI();
while (true)
{
Socket socket= serversocket.accept() ;
ServerThread serverThread= new ServerThread (socket, ta);
threadlist. add (serverThread) ;
serverThread.start();
//get all the list of currently running thread
}
}
public static void createGUI(){
ta=new JTextArea (12, 20) ;
ta.setEditable (false) ;
JFrame f=new JFrame("Server") ;
f.setSize (300, 300) ;
f.setLayout (new FlowLayout ( )) ;
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
f.add (ta) ;
f.setVisible (true);
}
}