/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JTextArea;

public class ClientThread extends Thread{
    
private Socket socket;
private BufferedReader input;
JTextArea ta;
public ClientThread (Socket s, JTextArea ta) throws IOException{
this.socket = s;
this.ta=ta;
this.input= new BufferedReader ( new InputStreamReader (socket.getInputStream ()) );
}
public void run(){
    
try {
while (true){
String response = input.readLine();
ta.append (response+"\n") ;
System. out.println (response) ;
}
}
catch (IOException e){
e.printStackTrace();
}}}