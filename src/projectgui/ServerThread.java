/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;

import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JTextArea;

public class ServerThread extends Thread{
private Socket socket;
private PrintWriter output;
private BufferedReader input;
TextArea ta;
    private Iterable<ServerThread> threadList;
public ServerThread (Socket socket,TextArea ta) 
{
this.socket = socket;
this.ta=ta;
}

    ServerThread(Socket socket, JTextArea ta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public void run(){
try{
input = new BufferedReader ( new InputStreamReader (socket.getInputStream())) ;
output = new PrintWriter (socket.getOutputStream() , true) ;
while (true)
{
String outputString= input.readLine() ;
printToAl1Clients(outputString);
ta.append ("Server received" + outputString +"\n");
System.out.println ("Server received " + outputString);
}
}

catch (Exception e)
{
System. out.println( "Error occured" + e.getStackTrace());
}
}
private void printToAllClients (String outputString){
for( ServerThread st: threadList) {
st.output.println (outputString) ;
}
}

    private void printToAl1Clients(String outputString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}