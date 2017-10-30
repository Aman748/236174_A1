package com.uum._a1;

import java.io.File;
import java.lang.reflect.Method;

/**
 *
 * @author Aman
 */
public class FindIssues {
    
    private int issue=0;
    
    public int getIssue(File[] targetFiles){
        
        for (File file : targetFiles) 
        {
            String fileName = file.getName();
            int removeType = fileName.lastIndexOf(".");
            if (removeType > 0) {
                fileName = fileName.substring(0, removeType); //to remove ".java" from the file name
            }
            
            FindIssues f = new FindIssues();
            String packageName = file.getParentFile().getName();
            
            Method mainMethod;
            try{
                Class name;
                if(!packageName.equals("")){
                    packageName = packageName.replace("/",".");
                    name = Class.forName(packageName+"."+fileName);
                }
                else {
                    name = Class.forName(fileName);
                }
                mainMethod = name.getMethod("main", new Class[]{String[].class});
                if(mainMethod != null){
                    issue++;
                }
            }catch(ClassNotFoundException | NoSuchMethodException | SecurityException e){ 
            }  
        }
        
        return issue;
    }
}