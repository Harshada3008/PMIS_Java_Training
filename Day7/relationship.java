package Day7;


class Engine{
    void start(){
        System.out.println("Engine started");   
    }
}

class car{
    private Engine engine;
    car(){
        this.engine = new Engine();
    }
    void drive(){
        engine.start();
        System.out.println("Car is moving");
    }
}

