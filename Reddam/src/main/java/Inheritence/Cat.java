/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritence;

/**
 *
 * @author Jcj
 */
public class Cat extends Animal
{
    private int hateMeter;
    public Cat(double weight, double height, int numLegs, int hateMeter)
    {
        super(weight, height, numLegs);
        
        this.hateMeter = hateMeter;
    }
        @Override
    public String speak()
    {
        return "meow";
    }
    public void scratch()
    {
        System.out.println("Human HP - 10");
    }
    public void pet()
    {
        hateMeter += 2;
        scratch();
    }
}
