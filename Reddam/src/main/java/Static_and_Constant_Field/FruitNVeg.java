/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Static_and_Constant_Field;

/**
 *
 * @author Jcj
 */
public class FruitNVeg
{
    public static void main(String[] args)
    {
        Fruit tomato = new Fruit("tomato", 13, 17.5);
        Fruit apple = new Fruit("apple", 20, 8);
        Fruit pear = new Fruit("pear", 16, 10);
        
        tomato.sell(4);
        System.out.println("Totalsales: "+ Fruit.getTotalSales() +"\nTotal Cost: "+ Fruit.getTotalCost());
        
        apple.sell(2);
        System.out.println("Totalsales: "+ Fruit.getTotalSales() +"\nTotal Cost: "+ Fruit.getTotalCost());
        
        pear.sell(6);
        System.out.println("Totalsales: "+ Fruit.getTotalSales() +"\nTotal Cost: "+ Fruit.getTotalCost());
    }
}
