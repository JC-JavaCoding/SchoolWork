/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects_Classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Jcj
 */
public class ClientUI
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("Client name please."),
                accountNumber = JOptionPane.showInputDialog("Account number?");
        
        
        Client client = new Client();
    }
}
