package Practicals;

import javax.swing.JOptionPane;

public class CardGame
{
   public static void main(String [] args)
   {
      String name = "";
      String side = "";
      String highestPlayer = "";
      int type = 0;
      int attack = 0;
      int defence = 0;
      int luckFactorInt = 0;
      double luckFactorDouble = 0;
      double points = 0;
      double allPointsTotal = 0;
      double highestPoints = 0;
      int characterNum;
      
      for (characterNum = 1; characterNum <= 7; characterNum ++)
      {
         name = JOptionPane.showInputDialog("Enter Character Name");
         type = (int) (Math.random() * 4) + 1;            
         System.out.println("\n\n"+"Name: "+ name +" - "+ side +" side.");         
         double totalPoints = 0;
         
         for (int i = 0; i < 3; i++)
         {
            attack = (int) (Math.random() * 6) + 1;
            defence = (int) (Math.random() * 6) + 1;
            luckFactorInt = (int)(Math.round(name.length() / 3.5 * 10));
            luckFactorDouble = (luckFactorInt / 10.0);
            points = ( attack + defence ) * luckFactorDouble;
            
            if (type == 1)
            {
               side = "Light";
            }
            else if (type == 2)
            {
               side = "Dark";
            }
            else
            {
               side = "Support";
            }
            System.out.println("Attack: "+ attack +" Defence: "+ defence +" Luck: "+ luckFactorDouble +" Points: "+ points);
            totalPoints += points;
            
         }   
         System.out.println("Total Points: "+ totalPoints);
         allPointsTotal += totalPoints;
         if(totalPoints > highestPoints)
         {
            highestPoints = totalPoints;
            highestPlayer = name;
         }
         if (allPointsTotal >= 100){break;}
            
      }
      
      System.out.println("The highest points score was: "+ highestPoints +", Playercard: "+ highestPlayer);
      System.out.println("There were "+ characterNum +" characters.");
   }
}