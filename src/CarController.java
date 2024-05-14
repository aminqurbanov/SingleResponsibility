public class CarController {
    private Car car;
    private Engine engine;

    public CarController(Car car, Engine engine) {
        this.car = car;
        this.engine = engine;
    }
    public void startCar() {
        engine.start();
        System.out.println("The " + car.getMake() + " " + car.getModel() + " has started.");
    }

    public void stopCar() {
        engine.stop();
        System.out.println("The " + car.getMake() + " " + car.getModel() + " has stopped.");
    }
}
