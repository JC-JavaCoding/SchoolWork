/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects_Classes;

/**
 *
 * @author Jcj
 */
public class Client
{
    private String clientName, accountNumber;
    private double balance;
    
    public Client(String clientName, String accountNumber, double balance)
    {
        this.clientName = clientName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getClientName()
    {
        return clientName;
    }
    public void setClientName(String clientName)
    {
        this.clientName = clientName;
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public String toString()
       {
        return "Client{" + "clientName=" + clientName + ", accountNumber=" + accountNumber + ", balance=" + balance + '}';
    }
    public void changeName(String surname, char initial)
    {
        clientName = surname + " " + initial +".";
    }
    
}
