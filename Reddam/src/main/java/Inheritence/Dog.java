/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritence;

/**
 *
 * @author Jcj
 */
public class Dog extends Animal
{
    private int loyaltyPercentage;
    
    public Dog(double weight, double height, int loyaltyRating)
    {
        super(weight, height, 4) ; 
        
        this.loyaltyPercentage = loyaltyRating;
        
        if (loyaltyPercentage < 0) loyaltyPercentage = 0;
        else if (loyaltyPercentage > 100) loyaltyPercentage = 100;
        
/*can change this to suit needs, just need to fill requirements of super class;
        super has to be first line in constructor*/ 
    }
    
    @Override
    public String speak()
    {
        return "woof";
    }
    public String speak(int num)
    {
        String output = "";
        
        for (int i = 0; i < num; i ++)
        {
            output += "woof ";
        }
        return output;
    }
    
    public void eatBONE()
    {
        this.weight += 1;
        speak();
    }
}
