/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;

import java.util.ArrayList;

/**
 *
 * @author youst
 */
public class Airline 
{
    private String NameOfCompany;   
    private String CodeOfCompany;  
    private ArrayList<Flight>flights;

    public Airline(String NameOfCompany, String CodeOfCompany, ArrayList<Flight> flights) 
    {
        this.NameOfCompany = NameOfCompany;
        this.CodeOfCompany = CodeOfCompany;
        this.flights = flights;
    }
     public void getFlights(){
         
     }

    public String getNameOfCompany() {
        return NameOfCompany;
    }

    public void setNameOfCompany(String NameOfCompany) {
        this.NameOfCompany = NameOfCompany;
    }

    public String getCodeOfCompany() {
        return CodeOfCompany;
    }

    public void setCodeOfCompany(String CodeOfCompany) {
        this.CodeOfCompany = CodeOfCompany;
    }
}
