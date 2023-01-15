
package com.mycompany.employeemanagementsystem;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author seif
 */
public class EmployeeManagementSystem {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Menu.show();
            int state = sc.nextInt();
            if (state >= 1 && state <= 5) {
                switch (state) {
                    case 1 -> {
                        AddEmployee.addNewEmployee();
                        break;
                    }
                    case 2 -> {
                        System.out.println("Enter Employee's id");
                        int id = sc.nextInt();
                        RemoveEmployee.removeFile(id);
                        break;
                    }
                    case 3 -> {
                        System.out.println("Enter Employee's id");
                        int id = sc.nextInt();
                        try{
                        ShowEmployee.printEmployeeData(id);
                        }catch(IOException e){
                            e.printStackTrace();
                        }
                        break;
                    }
                    case 4 -> {
                        EmployeeData emp = new EmployeeData();
                        System.out.println("Enter Employee's id");
                        int id = sc.nextInt();
                        File checkFile = new File("id " + id + ".txt");
                        if(!checkFile.exists()){
                            System.out.println("id isn't exist");
                            break;
                        }
                        System.out.println("Enter new Data");
                        emp.id = id;
                        emp.getInfoWitoutId();
                        try{
                            UpdateEmployee.updateFile(emp);
                        }catch(IOException e){
                            System.out.println("update failed :(");
                            e.printStackTrace();
                        }
                        break;
                    }
                    case 5 -> {
                        System.exit(0);
                        break;
                    }
                }
            }
        }
    }
}
