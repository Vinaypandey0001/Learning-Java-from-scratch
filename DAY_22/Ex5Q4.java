import java.util.Scanner;

class Employee {
    private String name;
    private int empId;
    private double salary;


    public Employee() {
        this.name = "";
        this.empId = 0;
        this.salary = 0.0;
    }


    public Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }


    public void increaseSalary(double percentage) {
        salary += salary * (percentage / 100);
    }
}

 
class Manager extends Employee {

    private int level;


    public Manager(String name, int empId, double salary, int level) {

        super(name, empId, salary);
        this.level = level;
    }


    public int getLevel() {
        return level;
    }
}

public class Ex5Q4 {
    public static void main(String[] args) {
        // Create an Employee object using default constructor
        Employee emp1 = new Employee();
        System.out.println("Employee 1 Details:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Salary: " + emp1.getSalary());

        // Create an Employee object using parameterized constructor
        Employee emp2 = new Employee("vinay", 101, 50000);
        System.out.println("\nEmployee 2 Details:");
        System.out.println("Name: " + emp2.getName());
        System.out.println("Salary: " + emp2.getSalary());

        // Increase salary of emp2 by 10%
        emp2.increaseSalary(10);
        System.out.println("\nAfter 10% salary increase:");
        System.out.println("New Salary: " + emp2.getSalary());

        // Create a Manager object
        Manager manager = new Manager("Sachin", 201, 80000, 2);
        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.getName());
        System.out.println("Salary: " + manager.getSalary());
        System.out.println("Manager Level: " + manager.getLevel());

        // Increase manager's salary by 15%
        manager.increaseSalary(15);
        System.out.println("\nAfter 15% salary increase:");
        System.out.println("New Salary: " + manager.getSalary());
        
        System.out.println("Name: vinay Kumar Pandey");
         System.out.println("SAP ID -500120087");

    }
}

