
package Day6;

/*class Employee {
    double salary = 40000;
}

class Manager extends Employee {
    double salary = 10000;

    void displaySalary() {
        System.out.println("Manager salary: " + salary);
        System.out.println("Employee salary: " + super.salary);
    }
}
 */

/*
class BankAccount {

    String accountHolder;

    // Constructor
    BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Display account details
    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
    }
}

class SavingAccount extends BankAccount {

    double interestRate = 4.5;

    // Constructor
    SavingAccount(String accountHolder) {
        super(accountHolder);
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
*/
/* 
class Animal {
    String name;
    void eat(){
        System.out.println("Animal is eating");

    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}

public class demo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}*/


class Employee {

    String name;
    double salary;

    // Parent class constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Display employee details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {

    String department;

    // Child class constructor
    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    // Method overriding
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Role: Manager");
    }
}

public class demo {

    public static void main(String[] args) {

        Manager m = new Manager("Anish", 50000, "IT");

        m.displayDetails();
    }
}
