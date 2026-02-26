package musical_instruments;

public class StringInstrument extends Instrument{

    static {
        System.out.println("StringInstrument class loaded (static block)");
    }

    {
        System.out.println("StringInstrument instance initializer block executed");
    }

    public static StringInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A string instrument is playing.");
    }
}
