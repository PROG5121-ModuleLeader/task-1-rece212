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
    public void testTestData() 
    {
        Message m = new Message();
        String Expected = "Hello Online Class";
        String Actual = m.TestData();
        assertEquals(Expected,Actual);
    }
    
}
