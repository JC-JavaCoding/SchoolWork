package ForLoops;


public class Star_Challenge
{
   public static void main(String [] args)
   {
      cycleValue();
   }
   private static void cycleValue()
   {
       int increaseDecreaseVal;
       for (int i = 0; i < 7; i++)
        {
         if (i < 4)
         {
            increaseDecreaseVal = 1;
            printAsterix(increaseDecreaseVal);
         }
         else
         {
            increaseDecreaseVal = -1;
            printAsterix(increaseDecreaseVal);
         }
         System.out.println();
      }
   }
   private static void printAsterix( int incDecVal)
   {
      for(int i = 0; i<1; i += incDecVal)
      {
         System.out.print("*");
      }
   }
}