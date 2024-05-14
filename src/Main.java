public class Main {
    public static void main(String[] args) {
        
            Car car = new Car("Bmw", "g30", 2023);
            Engine engine = new Engine("V8");
            CarController carController = new CarController(car, engine);

            carController.startCar();
            carController.stopCar();
        }
    }