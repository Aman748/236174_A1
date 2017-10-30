package com.uum._a1;

import java.io.File;
import java.util.Set;

/**
 *
 * @author Aman
 */
public class FindJavaFile {
    public static Set getJavaFiles (File Path, Set Javalsf){        
        //判断文件是否存在  
        File[]files=Path.listFiles();
        for (File file : files) {
            if (!file.exists()){  
                System.out.println("The file name not existing!");  
            }else{  
                //判断是否是文件  
                if (file.isFile()){  
                    //如果当前fir是文件，则判断是什么文件  
                    String firName = file.getName();//获取文件名                        
                    //System.err.println(firName.hashCode());  获取文件后缀名  
                    if(firName.substring(firName.lastIndexOf(".")+1) .equals("java")){ 
                        Javalsf.add(file);
                    } 
                }
            }     
        }
        return Javalsf;
    }
}
