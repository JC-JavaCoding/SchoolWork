/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects_Classes;

/**
 *
 * @author Jcj
 */
public class Line
{
    private int size, width;
    char pattern;
    
    public Line()
    {
        size = 2; width = 1;
        pattern = '*';
    }
    public Line(int s, char p)
    {
        size = s;
        width = 1;
        pattern = p;
    }
    
    //set variables/fields
    public void setSize(int s)
    {
        size = s;
    }
    public void setPattern(char p)
    {
        pattern = p;
    }
    
    public void draw()
    {
        for (int i = 0; i < size; i++)
        {
            System.out.print(pattern);
        }
        System.out.println("");
    }
    public void drawVert()
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < width; j++)
            {
                System.out.print(pattern);
            }
            System.out.println();
        }
    }   
    public void drawDesc()
    {
        for (int i = size; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(pattern);
            }
            System.out.println("");
        }
    }
}
