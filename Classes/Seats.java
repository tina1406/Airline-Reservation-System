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

/**
 *
 * @author Lenovo
 */
public class Seats implements Serializable
{
    private String SeatNo;
    public ArrayList<SeatClass> Type;
    
 public String seatID;
     static public String filepath="seats.bin";
    static public File file=new File(filepath);
 public Seats(String seatID){
     this.seatID=seatID;
 }
// public static void writetofile() throws FileNotFoundException, IOException{
//        ObjectOutputStream write=new ObjectOutputStream(new FileOutputStream(filepath));
//        write.writeObject(seatstaken);
//        write.close();
//    }
//    public static void readfromfile() throws FileNotFoundException, IOException, ClassNotFoundException{
//        if(file.exists() && file.length()!=0){
//            ObjectInputStream read=new ObjectInputStream(new FileInputStream(filepath));
//            seatstaken=(ArrayList<Seat>)read.readObject(); // convert stream of bytes data that was written in binary file into arraylist of objects  again
//            read.close();
//        }
//        else{
//            System.out.println("file empty");
//        }
//    }
}