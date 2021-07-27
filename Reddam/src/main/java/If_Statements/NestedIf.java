package If_Statements;

import javax.swing.*;

public class NestedIf {

    public static void main(String[] args) 
    {
        int a = 0, b = 0, c = 0, m = 0;

        if (a == 3) 
        {
            if (b == 2) 
            {
                if (c == 1) 
                {
                    m = 5;
                } else {
                    m = 1;
                }
            } 
            else 
            {
                m = 4;
            }
        }
    }
}
