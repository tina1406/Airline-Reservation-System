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
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import static projectgui.ProjectGUI.users;
/**
 *
 * @author Lenovo
 */
public class Person implements Serializable{
    private int id;
    private String FName;
    private String LName;
    private String Email;
    private String phoneNumber;
    private String username;
    private String gender;
    private String password;
    private String dateOfBirth;
    private String nationality;
    private String Address;
    private String placeOfBirth;
    private String Type;
    
    static public String  filepath="users.bin";
    static public File file= new File (filepath);
    public Person(String FName, String LName, String Email, String phoneNumber, String username, String gender, String password, String dateOfBirth, String nationality, String Address, String placeOfBirth,int id, String type) {
        this.id = id;
        this.FName = FName;
        this.LName = LName;
        this.Email = Email;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.nationality = nationality;
        this.Address = Address;
        this.placeOfBirth = placeOfBirth;
        this.Type=type;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person() {

    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public static void login() {}
    public static void signup() {}
    
    public static void writetofile() throws FileNotFoundException, IOException{
        ObjectOutputStream write=new ObjectOutputStream(new FileOutputStream(filepath));
        write.writeObject(users);
        write.close();
    }
    public static void readfromfile() throws FileNotFoundException, IOException, ClassNotFoundException{
        if(file.exists() && file.length()!=0){
        ObjectInputStream read=new ObjectInputStream(new FileInputStream(filepath));
        users=(ArrayList<Person>)read.readObject(); // convert stream of bytes data that was written in binary file into arraylist of objects  again
        read.close();
        }
        else {
            System.out.println("file empty");
        }
    }
}
