
package com.mycompany.employeemanagementsystem;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author seif
 */
public class ShowEmployee {

    public static void printEmployeeData(int id) throws Exception {
        File file = new File("id " + id + ".txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

    }
}
