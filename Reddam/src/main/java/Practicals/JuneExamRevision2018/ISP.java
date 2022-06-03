/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicals.JuneExamRevision2018;

/**
 *
 * @author Jcj
 */
public class ISP
{
    private String ip, isp, date;
    private int total;

    public ISP(String ip, String isp, String date, int total)
    {
        this.ip = ip;
        this.isp = isp;
        this.date = date;
        this.total = total;
    }
    public boolean validIP()
    {
        return true;
    }
    private void changeDate()
    {
        
    }
    @Override
    public String toString()
    {
        return "ISP{" + "ip=" + ip + ", isp=" + isp + ", date=" + date + ", total=" + total + '}';
    }
    public String getIP()
    {
        return ip;
    }
    public String getISP()
    {
        return isp;
    }
    public String getDate()
    {
        return date;
    }
    public int getTotal()
    {
        return total;
    }
    public void setIp(String ip)
    {
        this.ip = ip;
    }
    public void setIsp(String isp)
    {
        this.isp = isp;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    public void setTotal(int total)
    {
        this.total = total;
    }
    
}
