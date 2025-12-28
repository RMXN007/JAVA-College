// Q1: To create an abstract class Employee with abstract methods calculateSalary() and displayInfo

abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
    abstract void displayInfo();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }

    void displayInfo() {
        System.out.println("Full-Time Employee: " + name + " | ID: " + id + " | Salary: " + calculateSalary());
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    void displayInfo() {
        System.out.println("Part-Time Employee: " + name + " | ID: " + id + " | Salary: " + calculateSalary());
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Raman", 101, 50000);
        Employee e2 = new PartTimeEmployee("Tarun", 102, 50, 200);

        e1.displayInfo();
        e2.displayInfo();
    }
}