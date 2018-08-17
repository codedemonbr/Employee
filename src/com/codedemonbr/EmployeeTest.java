package com.codedemonbr;

public class EmployeeTest
{
    public static void main(String[] args) {
        System.out.println("Employees before instantiation: " + Employee.getCount());

        Employee e1 = new Employee("Susan", "Baker");
        Employee e2 = new Employee("Bob", "Blue");

        System.out.println("/nEmployees after instantiation: ");
        System.out.println("via e1.getCount(): " + e1.getCount());
        System.out.println("via e2.getCount(): " + e2.getCount());

        System.out.println("Employee 1: " + e1.getFirstName() + " " + e1.getLastName());
        System.out.println("Employee 2: " + e2.getFirstName() + " " + e2.getLastName());

        System.out.println("Employee.getCount()" + Employee.getCount());
    }
}
