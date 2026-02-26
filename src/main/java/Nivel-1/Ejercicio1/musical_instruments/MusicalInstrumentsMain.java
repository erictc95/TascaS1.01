package musical_instruments;

public class MusicalInstrumentsMain {
    public static void main(String[] args) {
        System.out.println("Main started");

        Instrument instrument1 = new WindInstrument("Flauta", 50);
        System.out.println("El instrumento 1 tipo viento ha sido creado");

        Instrument instrument2 = new StringInstrument("Guitarra", 200);
        System.out.println("El instrumento 2 tipo cuerda ha sido creado");

        Instrument instrument3 = new PercussionInstrument("Tambor", 500);
        System.out.println("El instrumento 3 tipo percusion ha sido creado");

        System.out.println("Playing Time");

        instrument1.play();
        instrument2.play();
        instrument3.play();

    }
}
