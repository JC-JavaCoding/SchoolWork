package ForLoops;

import java.lang.Math;

public class SumOfSeries_Ex6
{
   public static void main(String[] args)
   {
      getTotals();
   }
   public static void getTotals()
   {
      //get values of each question
      addTogether();      
   }
   //Question one formula:
   public static double questionOne(int n)
   {
      double numeratorFormula = n;
      double denominatorFormula = n + 1;
      double termsTotal = numeratorFormula / denominatorFormula;
      return termsTotal;
   }
   //Question two formula:
   public static double questionTwo(int n)
   {
      double numeratorFormula = 2 * n;
      double denominatorFormula = 2 * n + 1;
      double termsTotal = numeratorFormula / denominatorFormula;
      return termsTotal;
   }
   //Question three formula:
   public static double questionThree(int n)
   {
      double numeratorFormula = 4 * (Math.pow(n, 2)) - 4*n + 1;
      double denominatorFormula = 4*(Math.pow(n, 2));
      double termsTotal = numeratorFormula / denominatorFormula;
      return termsTotal;
   }
   //method to add together each question's values
   public static void addTogether()
   {
      double denominator;
      double  q1Total = 0.0;
      double  q2Total = 0.0;
      double  q3Total = 0.0;
      for (int i = 1; i < 16; i++)
      {
         double q1TermTotal, q2TermTotal, q3TermTotal;
         //question 1
         q1TermTotal = questionOne(i);
         q1Total += q1TermTotal;

         //question 2
         q2TermTotal = questionTwo(i);
         q2Total += q2TermTotal;

         //question 3
         q3TermTotal = questionThree(i);
         //every 3rd term gets subtracted, not added
         if (i % 3 == 0)
         {
            q3Total -= q3TermTotal;
         }
         else 
         {
            q3Total += q3TermTotal;
         }
         
         if (i == 15)
         {
            System.out.println("Question 3.1: "+ q1Total);
            System.out.println("Question 3.2: "+ q2Total);
            System.out.println("Question 3.3: "+ q3Total);
         }
      }
   }
}