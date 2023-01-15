package com.mycompany.employeemanagementsystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author seif
 */
public class UpdateEmployee {

    public static void updateFile(EmployeeData emp) throws IOException {
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
        System.out.println("\nEmployee updated successfully");
    }
}
