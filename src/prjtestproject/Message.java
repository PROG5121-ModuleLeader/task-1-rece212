/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjtestproject;

/**
 *
 * @author rwanv
 */
public class Message 
{
    public String TestData()
    {
        return "Hello Online Class";
    }
    
    public boolean ValidNumber(int y)
    {
        if (y >9)
        {
            return true;
        }else 
            return false;
    }
    
    public boolean CheckUserName(String strName)
    {
        if (strName.length() >10)
        {
            return true;
        }else 
        {
            return false;
        }
    }
}
