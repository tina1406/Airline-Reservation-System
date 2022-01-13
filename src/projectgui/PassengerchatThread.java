/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgui;

import projectgui.UserThread;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import static projectgui.CustomerSupporter.userThreads;

/**
 *
 * @author student
 */
public class PassengerchatThread extends Thread{
    private Socket socket;
    BufferedReader br;
  PassengerchatThread(Socket socket) throws IOException {
      this.socket=socket;
      br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    public void run(){
        while(true){
            try {
                String x=br.readLine();
                System.out.println(x);
            } catch (IOException ex) {
                Logger.getLogger(UserThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
