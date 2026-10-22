package com.ConsoleBasedApp;
import java.util.ArrayList;
import java.util.Scanner;
public class EmployeePayroll {
		    int id;
		    String name;
		    double salary;

		    EmployeePayroll(int id, String name, double salary) {
		        this.id = id;
		        this.name = name;
		        this.salary = salary;
		    }

		    void display() {
		        System.out.println("--------------------------");
		        System.out.println("ID     : " + id);
		        System.out.println("Name   : " + name);
		        System.out.println("Salary : " + salary);
		    }
	}
class PayrollSystem {

    ArrayList<EmployeePayroll> employees = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addEmployee() {

        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Salary : ");
        double salary = sc.nextDouble();

        employees.add(new EmployeePayroll(id, name, salary));

        System.out.println("Employee Added Successfully.");
    }

    public void viewEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No Employees Found.");
            return;
        }

        for (EmployeePayroll e : employees) {
            e.display();
        }
    }

    public void searchEmployee() {

        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();

        for (EmployeePayroll e : employees) {

            if (e.id == id) {
                e.display();
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    public void updateSalary() {

        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();

        for (EmployeePayroll e : employees) {

            if (e.id == id) {

                System.out.print("Enter New Salary : ");
                e.salary = sc.nextDouble();

                System.out.println("Salary Updated.");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    public void deleteEmployee() {

        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();

        for (EmployeePayroll e : employees) {

            if (e.id == id) {
                employees.remove(e);
                System.out.println("Employee Deleted.");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }
}
class Main {

    public static void main(String[] args) {

        PayrollSystem payroll = new PayrollSystem();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== Employee Payroll System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    payroll.addEmployee();
                    break;

                case 2:
                    payroll.viewEmployees();
                    break;

                case 3:
                    payroll.searchEmployee();
                    break;

                case 4:
                    payroll.updateSalary();
                    break;

                case 5:
                    payroll.deleteEmployee();
                    break;

                case 6:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);
        sc.close();
    }
}