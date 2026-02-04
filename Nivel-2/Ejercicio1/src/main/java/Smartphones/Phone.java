package Smartphones;

public class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public void call(String number){
        System.out.println("The Smartphone is calling to number: " + number);
    }

    @Override
    public void takePhoto() {
        System.out.println("Phone is taking a photo");
    }

    @Override
    public void alarmSound() {
        System.out.println("Alarm is Sounding");
    }

    public interface camera {
        void takePhoto();
    }

    public interface clock {
        void alarmSound();
    }
}
