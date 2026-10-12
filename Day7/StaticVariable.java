package Day7;

class student{
    String name;
    static String collegeName = "IIT Bombay";
    student(String name){
        this.name = name;
    
    }
    void stucol(){
        System.out.println("Student: " +name+ "\nCollege: " +collegeName);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        student s1 = new student("Harshada");
        student s2 = new student("Priya");
        s1.stucol();
        s2.stucol();
    }
    
}
