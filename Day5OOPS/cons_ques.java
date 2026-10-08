package Day5OOPS;

class StudentProfile {

    // Attributes
    String fullName;
    int studentID;
    double score;

    // Constructor 1: Exam Taker
    StudentProfile(String fullName, int studentID, double score) {
        this.fullName = fullName;
        this.studentID = studentID;
        this.score = score;
    }

    // Constructor 2: Direct Walk-in
    StudentProfile(String fullName, int studentID) {
        this.fullName = fullName;
        this.studentID = studentID;
        this.score = 0.0;
    }

    // Determine grade
    char getGrade() {

        if (score >= 90) {
            return 'A';
        } else if (score >= 75) {
            return 'B';
        } else if (score >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // Print report card
    void printReportCard() {

        System.out.println("Name: " + fullName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + getGrade());
        System.out.println("--------------------");
    }
}


// Main class
public class cons_ques{

    public static void main(String[] args) {

        // Exam taker
        StudentProfile student1 =
                new StudentProfile("Anish", 101, 82.5);

        // Direct walk-in
        StudentProfile student2 =
                new StudentProfile("Rahul", 102);

        // Print report cards
        student1.printReportCard();
        student2.printReportCard();
    }
}
