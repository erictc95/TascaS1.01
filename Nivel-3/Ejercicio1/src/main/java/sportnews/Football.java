package sportnews;

public class Football extends News{
    private String competicio;
    private String club;
    private String jugador;

    public Football(String titular, String competicio, String club, String jugador) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }

    @Override
    public int calculatePrice() {
        int basePrice = 300;
        int totalPrice = 0;
        if (competicio.equals("champions league")){
            totalPrice = basePrice + 100;
        } else if (club.equals("barça") || club.equals("madrid")) {
            totalPrice = basePrice + 100;
        } else if (jugador.equals("ferran torres") || jugador.equals("benzema")) {
            totalPrice = basePrice + 50;
        }
        return totalPrice;
    }

    @Override
    public int calculateScore() {
        int baseScore = 5;
        int totalScore = 0;
        if (competicio.equals("champions league")){
            totalScore = baseScore + 3;
        } else if (competicio.equals("league")) {
            totalScore = baseScore + 2;
        } else if (club.equals("barça") || club.equals("madrid")) {
            totalScore = baseScore + 1;
        } else if (jugador.equals("ferran torres") || jugador.equals("benzema")) {
            totalScore = baseScore + 1;
        }
        return totalScore;
    }


}
