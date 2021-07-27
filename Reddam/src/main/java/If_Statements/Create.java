package If_Statements;

import java.io.*;

public class Create
{  
   public String fileAbsPath;
   public void newFile(String fileName)
   {
      try
      {
         java.io.File file = new java.io.File(fileName +".java");
         if(file.createNewFile())
         {
            System.out.println("File created: "+ file.getName());
            fileAbsPath = file.getAbsolutePath();
            
            //create printwriter
            java.io.PrintWriter startup = new java.io.PrintWriter(file);
            
            //print imports:
            startup.println("import javax.swing.*;");
            
            //print public class 
            startup.println("\n" + "public class "+ fileName +"\n" + "{");
            
            //print psvm
            startup.println("\t" + "public static void main(String [] args)" + "\n\t" + "{");
            
            //print basic variable types:
            startup.println("\t\t" + "//Basic variables: \n\t\t" + "String s = \"\"; \n\t\t" + "String input = JOptionPane.showInputDialog(\"\"); \n\t\t" + "double d = 69; \n\t\t" + "int j = 0;");
            
            //print for loop
            startup.println("\n\t\t" + "//Standard form for loop: \n\t\t" + "for (int i = 0; i < 10; i++) \n\t\t" + "{ \n\t\t\t" + "//Type your code in this code block \n\t\t" + "}");
            
            //print end-block brackets:
            startup.print("\t" + "}\n" + "}");
             //close file
            startup.close();
         }
         else
         {
            System.out.println("Already existing file");
         }
      }
      catch (IOException e) 
      {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }
   }
   public String path()
   {
      return fileAbsPath;
   }
}