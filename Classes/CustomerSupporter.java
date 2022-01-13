/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgui;

import java.awt.GridBagLayout;
import projectgui.UserThread;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.sound.sampled.Port;
import javax.swing.JFrame;

/**
 *
 * @author student
 */
public class CustomerSupporter extends JFrame{
   static int port=800;
   static Socket socket;
   public static ArrayList<UserThread>userThreads=new ArrayList<>();
   
   
CustomerSupporter(){
      setSize(600, 400);
        setLayout(new GridBagLayout());
        setLocation(200, 200);
        setVisible(true);
    try(ServerSocket serverSocket=new ServerSocket(port))
        {
        System.out.println("Chat Server is listening on port "+port);
        while(true)
        {
        socket=serverSocket.accept();
        System.out.println("New user connected");
        UserThread  newUser=new UserThread(socket);
        userThreads.add(newUser);
        newUser.start();
        }
    }    
     catch (IOException ex){
         System.out.println("Error in the server: "+ex.getMessage());
         ex.printStackTrace();
    }
    }
}


