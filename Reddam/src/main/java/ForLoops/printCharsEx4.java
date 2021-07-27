package ForLoops;

public class printCharsEx4
{
   public static void main(String[] coolbeans)
   {
      //1.1
      String q1Forward = forwardAlphabet();
      System.out.println(q1Forward);
      //1.2
      String q2Backward = bacwardAlphabet();
      System.out.println(q2Backward);
      //2
      String unicodeChars = from32_126();
      System.out.println(unicodeChars);
      
   }
   public static String forwardAlphabet()
   {
      String forwardLtrs = "";
      for(char a_To_Z = 65; a_To_Z < 91; a_To_Z ++)
      {
         forwardLtrs += a_To_Z + "" +(int)a_To_Z +" ";
      }
      return forwardLtrs;
   }
   public static String bacwardAlphabet()
   {
      String backwardLtrs = "";
      for(char z_To_A = 90; z_To_A > 64; z_To_A --)
      {
         backwardLtrs += z_To_A + "" + (int)z_To_A +"   ";
      }
      return backwardLtrs;
   }
   public static String from32_126()
   {
      String moreChars = "";
      for(char i = 32; i < 127; i++)
      {
         moreChars += i + "" + (int)i +"| \t |";
      }
      return moreChars;
   }
}