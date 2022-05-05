/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjtestproject;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rwanv
 */
public class MessageTest {
    
    public MessageTest() {
    }

    /**
     * Test of TestData method, of class Message.
     */
    @Test
    public void TestDataPass() 
    {
        Message m = new Message();
        String Expected = "Hello Online Class";
        String Actual = m.TestData();
        assertEquals(Expected,Actual);
    }
    @Test
    public void TestDataFail() 
    {
        Message m = new Message();
        String Expected = "Hello Online Class's";
        String Actual = m.TestData();
        assertEquals(Expected,Actual);
    }
    @Test
    public void testValidNoPass() 
    {
        Message m = new Message();
        boolean Expected = true;
        boolean Actual = m.ValidNumber(10);
        assertTrue(Actual);
    }
    @Test
    public void testValidNoFail() 
    {
        Message m = new Message();
        boolean Expected = true;
        boolean Actual = m.ValidNumber(8);
        assertTrue(Actual);
    }
    @Test
    public void testValidUserPass() 
    {
        Message m = new Message();
        boolean Expected = true;
        boolean Actual = m.CheckUserName("Reece");
        assertTrue(Actual);
    }
    
    @Test
    public void testValidUserFail() 
    {
        Message m = new Message();
        boolean Expected = true;
        boolean Actual = m.CheckUserName("Tim");
        assertTrue(Actual);
    }
    
}
