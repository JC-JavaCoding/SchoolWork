/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Static_and_Constant_Field;

/**
 *
 * @author Jcj
 */
public class Fruit
{
    private String description;
    private int qty;
    private double costPrice, sellingPrice;
    public final int markup = 75;
    private static int totalQty, totalCost, totalSales;
    
    public Fruit(String d, int q, double c)
    {
        description = d;
        qty = q;
        costPrice = c;
    }

    @Override
    public String toString()
    {
        return "Fruit name: " + description + ",\tQuantity: " + qty + ",\tCost Price = R" + costPrice + ",\tsellingPrice = R" + sellingPrice;
    }
    public String getDescription()
    {
        return description;
    }
    public int getQty()
    {
        return qty;
    }
    public double getSellingPrice()
    {
        sellingPrice = 0;
                
        return sellingPrice;
    }
    public static int getTotalQuantity()
    {
        return totalQty;
    }
    public static double getTotalCost()
    {
        return totalCost;
    }
    public static double getTotalSales()
    {
        return totalSales;
    }
    public void sell(int q)
    {
        qty -= q;
        totalQty -= q;
        totalSales += q*sellingPrice;
    }
}
