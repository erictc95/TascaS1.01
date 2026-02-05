package smartphones;

public class PhoneMain {
    public static void main(String[] args){
        Smartphone mySmartphone = new Smartphone("Apple", "15 pro max");
        System.out.println(mySmartphone);
        mySmartphone.call("617762538");
        mySmartphone.takePhoto();
        mySmartphone.ringAlarm();
    }
}
