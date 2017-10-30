package com.uum._a1;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aman
 */
public class FindJavaFileTest {
    
    public FindJavaFileTest() {
    }

    /**
     * Test of getJavaFiles method, of class FindJavaFile.
     */
    @Test
    public void testGetJavaFiles() {
        
        System.out.println("getJavaFiles");
        
        File fir = new File("src/main/java/TestFiles_for_Test");
        
        Set Return = new HashSet();
        
        Set expResult = new HashSet();
        File f1=new File("src/main/java/TestFiles_for_Test/MyThread.java");
        File f2=new File("src/main/java/TestFiles_for_Test/TestWaitNotify.java");
        expResult.add(f1);
        expResult.add(f2);
        
        Set result = FindJavaFile.getJavaFiles(fir,Return);
        assertEquals(expResult,result);
    }
    
}
