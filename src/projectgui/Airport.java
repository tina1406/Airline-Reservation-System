/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;

/**
 *
 * @author youst
 */
public class Airport
{
    private String Name;
    private String City;
    private String Country;
    private String Address_Code;
    
    public Airport() {
    }

    public Airport(String Name, String Address_Code, String City, String Country) {
        this.Name = Name;
        this.Address_Code = Address_Code;
        this.City = City;
        this.Country = Country;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress_Code() {
        return Address_Code;
    }

    public void setAddress_Code(String Address_Code) {
        this.Address_Code = Address_Code;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country)
    {
        this.Country = Country;
    }
}
