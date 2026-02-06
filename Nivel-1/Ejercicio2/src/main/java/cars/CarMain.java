package cars;


public class CarMain {
    public static void main(String[] args) {
        Car.brake();
        Car car1 = new Car("Gallardo", 500);
        car1.accelerate();
        System.out.println(car1);
        Car car2 = new Car("Aventador", 600);
        Car car3 = new Car("Urus", 450);
        System.out.println(car2);
        System.out.println(car3);
    }

}
