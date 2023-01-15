package com.mycompany.employeemanagementsystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author seif
 */
public class AddEmployee {

    public static void addNewEmployeeGivenInfos(EmployeeData emp) {
        try {
            File file = new File("id " + emp.id + ".txt");
            if (file.createNewFile()) {
                FileWriter myWriter = new FileWriter("id " + emp.id + ".txt");
                myWriter.write(
                        "id : " + emp.id
                        + "\nfirst name : " + emp.firstName
                        + "\nlast name : " + emp.lastName
                        + "\nemail : " + emp.email
                        + "\nsalary : " + emp.salary
                        + "\ncontact : " + emp.contact
                        + "\nlocation : " + emp.location
                );
                myWriter.close();
                System.out.println("\nEmployee added successfully");
            } else {
                System.out.println("Emoloyee already exists");
            }
        } catch (IOException e) {
            System.out.println("Error...");
            System.out.println(e);
        }
    }

    public static void addNewEmployee() {
        EmployeeData emp = new EmployeeData();
        emp.getInfo();
        addNewEmployeeGivenInfos(emp);
    }
}
