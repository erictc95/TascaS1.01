package cars;

public class Car {

    private static final String brand ="Lamborghini";
    private String model;
    private static int power;

    public Car(String model, int power) {
        this.model = model;
        Car.power = power;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", power=" + power +
                '}';
    }

    public static void brake(){
        System.out.println("The car is braking!");
    }

    public void accelerate() {
        System.out.println("The car is accelerating");
    }

}
