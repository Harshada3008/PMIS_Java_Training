package Day6;

class device{
    void poweron(){
        System.out.println("Powering on...");
    }
}
class phone extends device{
    void Makecall(){
        System.out.println("Making call...");
    }
}
class smartphone extends phone{
    void browse(){
        System.out.println("Browsing the internet...");
    }
}
public class multilevelInheri {
    
    public static void main(String[] args) {
        smartphone Vivo = new smartphone();
        Vivo.poweron();
        Vivo.Makecall();
        Vivo.browse();
    }
    
}
