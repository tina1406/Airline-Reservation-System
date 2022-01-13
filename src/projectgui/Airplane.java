/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;

/**
 *
 * @author youst
 */
public class Airplane
{
    private String Model;
    private int productionYear;
    private double planeWeight;

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public double getPlaneWeight() {
        return planeWeight;
    }

    public void setPlaneWeight(double planeWeight) {
        this.planeWeight = planeWeight;
    }

    public double TotalWeightCalculation(double Capacity,double allowedWeight) 
    {
     double totalWeight = (allowedWeight * Capacity)+planeWeight;
     return totalWeight;
    }
}
