public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }
    public void start(){
        System.out.println("Starting the" +  type  + "engine.");

    }
    public void stop(){
        System.out.println("Stopping the" +  type  + "engine.");

    }
}
