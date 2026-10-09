package Day6;

/*Employee Salary
Calculator
Problem Statement
A company has two types of employees:regular employees and managers.
Every employee has a name and a basic
salary. A regular employee receives a bonus equal to 10% of their basic salary, while a manager receives a bonus equal to 20% of their basic salary
Your task is to create a program using
inheritance and method overriding to
calculate the total salary of each employee.
Requirements
1. Create a class Employee with:o A name and basic salary.
o A constructor to initialize these
attributes.
0.A method calculateSalary() that
returns the basic salary plus a 10%
bonus.
2, Create a class Manager that inherits
from Employee:
o Use super to initialize the parent
class attributes.
o Override calculateSalary() to
return the basic salary plus a 20%
"Snuog
3.In the main method:
o Read the employee's name and
basic salary
o Read the manager's namie and basic
salary.
o Create objects of both classes.
o Store both objiects in Employee
reference variables.
o Call calculateSalary() using
these references.
o Print each employee's name and
total salary, 
Input Formet
• First line: employee's name.
• Second line: employee's basio salary.
• Third line: manager's náme.Fourth line: manager's basic salary, 
Constraints
•Names contain no spaces.
Language
1
S3
.1u basic salary5 1000.000,
Output Format
Print two lines in the following format:Employee:<name), Total Salary:<amount>
Manager: <name>,Totäl Salary:
<amount>
Display salary amounts with exactly two digits after the decimal point.
Sample Input O
Rahul
20000
Priya
30000
Sample OutputO
Employee: Rahul, Total Salary: 22000.00Manager: Priya, Total Salary: 36000.00Explanation
Rahul receiyes a 10% bonus?20, 000 + 2, 000 = 22, 000Priya receives a 20% bonus:30, 000 + 6, 000:=36, 000 */

import java.io.*;
import java.util.*;

class Result {
    public static int calculateSalary(int basicSalary, int allowance, int deduction) {
        return basicSalary + allowance - deduction;
    }
}

public class Hackerank3rd {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int basicSalary = sc.nextInt();
        int allowance = sc.nextInt();
        int deduction = sc.nextInt();

        int totalSalary = Result.calculateSalary(
            basicSalary, allowance, deduction
        );

        System.out.println(totalSalary);

        sc.close();
    }
}