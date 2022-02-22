/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects_Classes;

/**
 *
 * @author Jcj
 */
public class MoreLines
{
    public static void main(String[] args)
    {
//        Line stripes = new Line(10, '+');
//        Line stripe2 = new Line(30, '@');
//        
//        stripes.draw();
//        stripe2.draw();
//        
//        System.out.println("Stripe1:\nSize = "+stripes.size +",\nPattern = "+ stripes.pattern);
//        System.out.println("Stripe2:\nSize = "+stripe2.size +",\nPattern = "+ stripe2.pattern);        
        Line stripe =  new Line(10, '+');
        stripe.draw();
        stripe.setSize(20);
        stripe.setPattern('#');
        stripe.draw();
    }
 
            
}
