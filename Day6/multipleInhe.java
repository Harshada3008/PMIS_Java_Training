package Day6;

interface Mother{
    void message();
}
interface Father{
    void message();

}
class Child implements Mother,Father{
    @Override 
    public void message(){
        System.out.println("Loving both monm and dad");
    }
}
public class multipleInhe {
    public static void main(String[] args) {
        Child c = new Child();
        c.message();

        Mother m = new Child();
        m.message();

        Father f = new Child();
        f.message();


    }
    
}
