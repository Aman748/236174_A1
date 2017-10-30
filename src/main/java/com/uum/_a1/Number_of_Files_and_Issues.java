package com.uum._a1;
/**
 *
 * @author Aman
 */

import java.io.File;  
import java.util.HashSet;  
import java.util.Set;
import java.util.TreeSet;

public class Number_of_Files_and_Issues {    
      
    TreeSet<String> nums = new TreeSet<>(); 
    
    public static void main(String[] args) throws Exception {  
        File path = new File("src/main/java/TestFiles");   //默认目录  
        Set<File> javalsf = new HashSet(); 
//        Set lsf = new ArrayList(); 
        try {  
            FindJavaFile.getJavaFiles(path,javalsf);
                  
            File[] Target = new File[javalsf.size()];
            javalsf.toArray(Target);
            FindIssues javaFiles = new FindIssues();
            
            int Issues = javaFiles.getIssue(Target);
            
            System.out.println("Number of Java Files = " + javalsf.size());
            System.out.println("Number of Issues = " + Issues);
        } catch (Exception e) {
            System.out.print(e);
        }
    }        
}