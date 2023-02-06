/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance2;

import Inheritence.Animal;
import Inheritence.Cat;
import Inheritence.Dog;
import java.util.ArrayList;

/**
 *
 * @author Jcj
 */
public class AnimalUI
{
    public static void main(String[] args)
    {
        Dog bob = new Dog(20.36, 0.899999989899, 500);
        System.out.println(bob.speak(5));
        
        System.out.println(bob.getWeight());
        bob.eatBONE();
        System.out.println(bob.getWeight());
        
        System.out.println();
        
        ArrayList <Animal> pets = new ArrayList<>();
        pets.add(new Dog(20, 1.5, 3));
        pets.add( new Cat(6, 0.56, 5, 5));
        pets.add(new Dog(20, 1.5, 3));
        pets.add( new Cat(6, 0.56, 5, 5));
        pets.add(new Dog(20, 1.5, 3));
        
        for ( Animal a : pets)
        {
            a.speak();
            if (a instanceof Cat) ((Cat) a).pet();
            
            else if (a instanceof Dog) ((Dog) a).eatBONE();
        }
 /*       bob.weight = 5;
        `public -- everything can access through dot notation
        private -- only class can access it
        protected --anything inheriting it or in same package can access through dot notation
    */   }
}
