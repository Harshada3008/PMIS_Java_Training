package Day10;

public class MultiTypeParameter<K,V>{
    private K key;
    private V value;

    MultiTypeParameter(K key, V value){
        this.key = key;
        this.value = value;
    }
    K getkey(){
        return key;

    }
    V getValue(){
        return value;
    }

    
}
class gen{
    public static void main(String[]args){
    MultiTypeParameter<String, Integer> p = new MultiTypeParameter<>("Age", 25);
    String key = p.getkey();
    Integer value = p.getValue();

    System.err.println(key + ":" + value);
    }
}
