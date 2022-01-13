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
public class SeatClass 
{
    private double Price;
    private String MealPlan;
    public ArrayList<String> type=new ArrayList<String>();

    public SeatClass() {
       type.add("Economy");
       type.add("Business");
       type.add("FirstClass");
       System.out.println(type);
    }
    
    public String getMealPlan() {
        return MealPlan;
    }

    public void setMealPlan(String MealPlan) {
        this.MealPlan = MealPlan;
    }

    public SeatClass(double Price) {
        this.Price = Price;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
}
