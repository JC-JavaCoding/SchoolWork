package Practicals;

public class T2_Exam_Practice_SB
{
   public static void main(String [] args)
   {
      String[] eggType = {"Type Elf\t\t", "Type Vampire", "Type Zombie\t"}; 
      int totalEggs = 25, eggsRemainder = 0;
      int numEggs = 0, hatchRange = 6;
      int randomEggType = 0, power = 0;
      int [] daysPower = new int[7];
      int [] highestPower = {};
      int totalPower = 0;
      
      //for every day in the week
      for (int day = 0; day < 7; day++)
      {
         int highestDay = totalPower; 
         totalPower = 0;

         System.out.println("Day :"+ (day + 1));
         System.out.println("Total Eggs: "+ totalEggs +"\n"+ "Eggs for the day: "+ numEggs);
//          numEggs = (int)( Math.random() * hatchRange ) + 2; //find number of hatched eggs for the day
         
         numEggs = (int) (Math.random() * hatchRange) + 2;
         if (numEggs >= totalEggs)
         {
            numEggs = totalEggs;
         }
         totalEggs -= numEggs;
         
         
         for (int egg = 1; egg <= numEggs; egg++)
         {
            randomEggType = (int)(Math.random() * 3);
            
            if ( eggType[randomEggType].equals("Type Elf\t\t") )
            {
               power = 450;
            }
            else if ( eggType[randomEggType].equals("Type Zombie\t") )
            {
               power = 175;
            }
            else
            {
               power = 320;
            }
            totalPower += power;
            
            System.out.println("Egg "+ egg +"\t\t"+ eggType [randomEggType] +"\t"+ "Power "+ power);
         }
         
         System.out.println("Total Power for the day "+ totalPower);
         daysPower[day] = totalPower;

         if (totalEggs == 0)
         {
            System.out.println("Too few eggs");
            break;
         }
         
         System.out.println();
      } 
       
//       daysPower.sort(daysPower);
      System.out.println("The most amount of power was "+ highestPower(daysPower) );
   }
   
   public static int highestPower(int[] powerArr)
   {
      int highest = 0;
      for (int i = 0; i < 7; i++)
      {
         for (int j = 0; j < 7; j++)
         {
            //if first number is larger than second
            if( powerArr[i] >= powerArr[j])
            {
               if (j == 6)
               {
                  highest = powerArr[i];
                  return highest;
               }
            }
            
            else{break;}
         }
      }
      
      return highest;
   }
}