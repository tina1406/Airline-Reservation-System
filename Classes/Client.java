/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import static projectgui.buttonclick.createGUI;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client {
public static JButton b, b2;
static JTextField tf, tf2;
static JTextArea ta;
static Scanner scanner = new Scanner (System. in);
static String userInput;
static String clientName;
static Socket socket;
static PrintWriter output;
public static void main (String[] args)throws IOException{
socket = new Socket ("localhost", 5000) ;
output = new PrintWriter (socket. getOutputStream () , true) ;
createGUI() ;
        }
}