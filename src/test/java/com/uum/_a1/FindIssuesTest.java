package com.uum._a1;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aman
 */
public class FindIssuesTest {
    
    public FindIssuesTest() {
    }
    /**
     * Test of getIssue method, of class FindIssues.
     */
    @Test
    public void testGetIssue() {
        System.out.println("getIssue");
        
        File[] targetFiles = new File[2];
        File f1=new File("src/main/java/TestFiles_for_Test/MyThread.java");
        File f2=new File("src/main/java/TestFiles_for_Test/TestWaitNotify.java");
        targetFiles[0]=f1;
        targetFiles[1]=f2;
        
        FindIssues instance = new FindIssues();
        int expResult = 1;
        int result = instance.getIssue(targetFiles);
        assertEquals(expResult, result);
    }
    
}
