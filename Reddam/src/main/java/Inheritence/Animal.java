/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritence;

/**
 *
 * @author Jcj
 */
public class Animal
{
    protected  double weight, height;
    protected int numLegs;

    public Animal(double weight, double height, int numLegs)
    {
        this.weight = weight;
        this.height = height;
        this.numLegs = numLegs;
    }
    
    public String speak()
    {
        return "Generic animal noise";
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setNumLegs(int numLegs)
    {
        this.numLegs = numLegs;
    }

    public double getHeight()
    {
        return height;
    }

    public int getNumLegs()
    {
        return numLegs;
    }
    
    
}
