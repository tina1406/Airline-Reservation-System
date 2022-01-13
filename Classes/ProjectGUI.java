/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectgui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Micha
 */
public class ProjectGUI {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Person> users = new ArrayList<>();
    public static ArrayList<Flight> Flights = new ArrayList<>();
    public static ArrayList<Passenger> passengers=new ArrayList<>();
        public static ArrayList<Ticket> tickets=new ArrayList<>();

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
//        Flight f=new Flight();
//        f.FlightID="123";
//        Flights.add(f);
//        Flight f2=new Flight();
//        f2.FlightID="111";
//        Flights.add(f2);
       // Flight.writetofile();
        Flight.readfromfile();
        Person.readfromfile();
//        for (int i = 0; i < users.size(); i++) {
//            System.out.println(users.get(i).getFName());            
//        }
       // SeatGUI s= new SeatGUI();
        HomePage h = new HomePage();
        //Addflight h=new Addflight();
        //Passenger h=new Passenger();
        h.setVisible(true);
//        Manager m = new Manager();
//        Admin a = new Admin();
//        CustomersService cs=new CustomersService();
    
//        JFrame f = new JFrame();
//        f.setSize(600, 600);
//        f.setLocationRelativeTo(null);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.add(new HomePage());
//        f.setVisible(true);
//        JFrame f1 = new JFrame("An image on screen");
//        f1.setSize(400, 400);
//        f1.add(new ImageScreen());
//        f1.setLocationRelativeTo(null);
//        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f1.setVisible(true);
//{
//    Thread t=new Thread(){
//            public void run(){
//                CustomerSupporter s=new CustomerSupporter();
//                
//            }
//        };
//        t.start();
//        
//        Thread t2=new Thread(){
//            public void run(){
//                try {
//                    Passengerchat s=new Passengerchat();
//                } catch (IOException ex) {
//                    Logger.getLogger(ProjectGUI.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                
//            }
//        };
//        t2.start();
//        
//         Thread t3=new Thread(){
//            public void run(){
//                try {
//                    Passengerchat s=new Passengerchat();
//                } catch (IOException ex) {
//                    Logger.getLogger(ProjectGUI.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                
//            }
//        };
//        t3.start();
//    }
    }
}
