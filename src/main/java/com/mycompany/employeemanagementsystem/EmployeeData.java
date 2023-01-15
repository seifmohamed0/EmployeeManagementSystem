package com.mycompany.employeemanagementsystem;

import java.util.Scanner;

/**
 *
 * @author seif
 */
public class EmployeeData {

    String firstName;
    String lastName;
    String email;
    String location;
    int id;
    String salary;
    String contact;

    public void getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee's first name : ");
        firstName = sc.nextLine();
        System.out.print("Enter employee's last name : ");
        lastName = sc.nextLine();
        System.out.print("Enter employee's email : ");
        email = sc.nextLine();
        System.out.print("Enter employee's location : ");
        location = sc.nextLine();
        System.out.print("Enter employee's id : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee's salary : ");
        salary = sc.nextLine();
        System.out.print("Enter employee's contact : ");
        contact = sc.nextLine();
    }

    public void getInfoWitoutId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee's first name : ");
        firstName = sc.nextLine();
        System.out.print("Enter employee's last name : ");
        lastName = sc.nextLine();
        System.out.print("Enter employee's email : ");
        email = sc.nextLine();
        System.out.print("Enter employee's location : ");
        location = sc.nextLine();
        System.out.print("Enter employee's salary : ");
        salary = sc.nextLine();
        System.out.print("Enter employee's contact : ");
        contact = sc.nextLine();
    }
}
