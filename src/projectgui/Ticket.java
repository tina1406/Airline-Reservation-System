/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import static projectgui.Flight.FlightPath;
import static projectgui.Flight.flight;
import static projectgui.ProjectGUI.Flights;
import static projectgui.ProjectGUI.tickets;

/**
 *
 * @author youst
 */
public class Ticket {
    private String BoardingTime;
    private Flight FromTo;
    private Seats SeatNo;
    private String TicketNo;
    private String TerminalNo;
    private String Gate;
    public Person user;
static public String TicketPath=("Ticket.bin");
static public File ticket=new File(TicketPath);
    public Ticket() {
        user=new Person();
        FromTo=new Flight();
    }

    public Ticket(String BoardingTime,Flight FromTo, Seats SeatNo,String TicketNo, String TerminalNo, String Gate) 
    {
        this.BoardingTime = BoardingTime;
        this.FromTo = FromTo;
        this.SeatNo = SeatNo;
        this.TicketNo = TicketNo;
        this.TerminalNo = TerminalNo;
        this.Gate = Gate;
    }
    
    public String getBoardingTime() {
        return BoardingTime;
    }

    public void setBoardingTime(String BoardingTime) {
        this.BoardingTime = BoardingTime;
    }

    public Flight getFromTo() {
        return FromTo;
    }

    public void setFromTo(Flight FromTo) {
        this.FromTo = FromTo;
    }

    public Seats getSeatNo() {
        return SeatNo;
    }

    public void setSeatNo(Seats SeatNo) {
        this.SeatNo = SeatNo;
    }

    public String getTicketNo() {
        return TicketNo;
    }

    public void setTicketNo(String TicketNo) {
        this.TicketNo = TicketNo;
    }

    public String getTerminalNo() {
        return TerminalNo;
    }

    public void setTerminalNo(String TerminalNo) {
        this.TerminalNo = TerminalNo;
    }

    public String getGate() {
        return Gate;
    }

    public void setGate(String Gate) {
        this.Gate = Gate;
    }  
    public static void writetofile() throws FileNotFoundException, IOException {
       // ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream(FlightPath));//3ayz a-save el info fe file.
         ObjectOutputStream wticket = new ObjectOutputStream(new FileOutputStream(TicketPath));
        wticket.writeObject(tickets);
        wticket.close();
    }
//
    public static void readfromfile() throws FileNotFoundException, IOException, ClassNotFoundException {
        if(ticket.exists()&&ticket.length()!=0){
        ObjectInputStream read = new ObjectInputStream(new FileInputStream(TicketPath));
        tickets = (ArrayList<Ticket>) read.readObject(); // convert stream of bytes data that was written in binary file into arraylist of objects  again
        read.close();
        }
        else
        {
            System.out.println("file empty");
        }
    }
}
