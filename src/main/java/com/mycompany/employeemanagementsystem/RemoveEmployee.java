
package com.mycompany.employeemanagementsystem;

import java.io.File;

/**
 *
 * @author seif
 */
public class RemoveEmployee {
    public static void removeFile(int id){
        File file = new File("id "+id+".txt");
        if(file.exists()){
            if(file.delete()){
                System.out.println("File deleted :)");
            }else{
                System.out.println("File didn't deleted :(");
            }
        }else{
            System.out.println("Employee already exists");
        }
    }
}
