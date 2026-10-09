
package Day6;

class Employee {
    double salary = 40000;
}

class Manager extends Employee {
    double salary = 10000;

    void displaySalary() {
        System.out.println("Manager salary: " + salary);
        System.out.println("Employee salary: " + super.salary);
    }
}





