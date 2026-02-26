package musical_instruments;

public abstract class Instrument {
    private String name;
    private double price;

    static {
        System.out.println("Instrument class loaded (static block)");
    }

    {
        System.out.println("Instrument instance initializer block executed");
    }

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "instruments{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public abstract void play();
}
