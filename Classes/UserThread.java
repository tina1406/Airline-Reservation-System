/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgui;

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
class UserThread extends Thread{
  private Socket socket;
    BufferedReader br;
    PrintWriter pw;
  UserThread(Socket socket) throws IOException {
      this.socket=socket;
      br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
      pw=new PrintWriter(socket.getOutputStream(),true);
    }

   

    public void run(){
        while(true){
            try {
                String x=br.readLine();
                System.out.println(x);
                for(int i=0;i<userThreads.size();i++){
                    userThreads.get(i).pw.println(x);
                }
            } catch (IOException ex) {
                Logger.getLogger(UserThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
