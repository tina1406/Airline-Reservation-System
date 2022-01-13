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
import java.io.Serializable;
import java.util.ArrayList;
import static projectgui.ProjectGUI.Flights;


/**
 *
 * @author POWER
 */
public class Flight implements Serializable {// 3ashan ahot feh el update info.

   // ArrayList<String> Flights = new ArrayList<String>();
    public String FlightID;
    public String FlightNO;
    public String TakenSeats;
    public String AirlineCom;
    public String pricePerTickets;
    public String Capacity;
    public String NoOfSeats;
    public String Dfrom;
    public String Dto;
    public String Status;
    public ArrayList<Seats> seatsreserved=new ArrayList<>();
static public String FlightPath=("Flight.bin");
static public File flight=new File(FlightPath);
    
    public String getNoOfSeats() {
        return NoOfSeats;
     
    }

    public void setNoOfSeats(String NoOfSeats) {
        this.NoOfSeats = NoOfSeats;
    }

    public String getDfrom() {
        return Dfrom;
    }

    public void setDfrom(String Dfrom) {
        this.Dfrom = Dfrom;
    }

    public String getDto() {
        return Dto;
    }

//    public Flight(String FlightID, String FlightNO, String TakenSeats, String AirlineCom, String pricePerTickets, String Capacity, String Status) {
//        this.FlightID = FlightID;
//        this.FlightNO = FlightNO;
//        this.TakenSeats = TakenSeats;
//        this.AirlineCom = AirlineCom;
//        this.pricePerTickets = pricePerTickets;
//        this.Capacity = Capacity;
//        this.Status = Status;
//        
    public void setDto(String Dto) {
        this.Dto = Dto;
    }

    public Flight(String FlightID, String FlightNO, String TakenSeats, String AirlineCom, String pricePerTickets, String Capacity, String NoOfSeats, String Dfrom, String Dto, String Status) {
        this.FlightID = FlightID;
        this.FlightNO = FlightNO;
        this.TakenSeats = TakenSeats;
        this.AirlineCom = AirlineCom;
        this.pricePerTickets = pricePerTickets;
        this.Capacity = Capacity;
        this.NoOfSeats = NoOfSeats;
        this.Dfrom = Dfrom;
        this.Dto = Dto;
        this.Status = Status;
    }
//    }
 
    public String getFlightID() {
        return FlightID;
    }

    public void setFlightID(String FlightID) {
        this.FlightID = FlightID;
    }

    public String getFlightNO() {
        return FlightNO;
    }

    public void setFlightNO(String FlightNO) {
        this.FlightNO = FlightNO;
    }

    public String getTakenSeats() {
        return TakenSeats;
    }

    public void setTakenSeats(String TakenSeats) {
        this.TakenSeats = TakenSeats;
    }

    public String getAirlineCom() {
        return AirlineCom;
    }

    public void setAirlineCom(String AirlineCom) {
        this.AirlineCom = AirlineCom;
    }

    public String getPricePerTickets() {
        return pricePerTickets;
    }

    public void setPricePerTickets(String pricePerTickets) {
        this.pricePerTickets = pricePerTickets;
    }

    public String getCapacity() {
        return Capacity;
    }

    public void setCapacity(String Capacity) {
        this.Capacity = Capacity;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public static void writetofile() throws FileNotFoundException, IOException {
       // ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream(FlightPath));//3ayz a-save el info fe file.
         ObjectOutputStream wflight = new ObjectOutputStream(new FileOutputStream(FlightPath));
        wflight.writeObject(Flights);
        wflight.close();
    }
//
    public static void readfromfile() throws FileNotFoundException, IOException, ClassNotFoundException {
        if(flight.exists()&&flight.length()!=0){
        ObjectInputStream read = new ObjectInputStream(new FileInputStream(FlightPath));
        Flights = (ArrayList<Flight>) read.readObject(); // convert stream of bytes data that was written in binary file into arraylist of objects  again
        read.close();
        }
        else
        {
            System.out.println("file empty");
        }
    }
    void getFlightNO(String text) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getFlightID(String text) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getAirlineCom(String text) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   private String FlightNo;
    private Airplane airplane;
    private Airport destinationAirport;
    private Airport departureAirport;
    private String DepartureTime;
    private String ArrivalTime;
    public ArrayList<String>flightStatus=new ArrayList<>();
    public ArrayList<Seats>FlightSeat=new ArrayList<>();
 
    public Flight() {
        flightStatus.add("Delayed");
        flightStatus.add("Arrived on time");
        flightStatus.add("Departed");
        flightStatus.add("Landed");
        flightStatus.add("Boarding");
        flightStatus.add("In air");
        flightStatus.add("Canceled");
    } 
    public Flight(String FlightNo,Airplane airplane, Airport destinationAirport, Airport departureAirport, String DepartureTime, String ArrivalTime) {
        this.FlightNo = FlightNo;
        this.airplane = airplane;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.DepartureTime = DepartureTime;
        this.ArrivalTime = ArrivalTime;
    }
     public String getFlightNo() {
        return FlightNo;
    }

    public void setFlightNo(String FlightNo) {
        this.FlightNo = FlightNo;
    }
    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(Airport destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(String DepartureTime) {
        this.DepartureTime = DepartureTime;
    }

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(String ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
    }

    public ArrayList<String> getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(ArrayList<String> flightStatus) {
        this.flightStatus = flightStatus;
    }

    public ArrayList<Seats> getFlightSeat() {
        return FlightSeat;
    }

    public void setFlightSeat(ArrayList<Seats> FlightSeat) {
        this.FlightSeat = FlightSeat;
    }
}
