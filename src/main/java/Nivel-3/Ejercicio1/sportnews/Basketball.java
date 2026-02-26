package sportnews;

public class Basketball extends New{
    private String competicio;
    private String club;

    public Basketball(String titular, String competicio, String club) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
    }

    @Override
    public int calculatePrice() {
        int basePrice = 250;
        int totalPrice = 0;
        if (competicio.equals("euroleague")){
            totalPrice = basePrice + 75;
        } else if (club.equals("barça") || club.equals("madrid")) {
            totalPrice = basePrice + 75;
        }
        return totalPrice;
    }

    @Override
    public int calculateScore() {
        int baseScore = 4;
        int totalScore = 0;
        if (competicio.equals("euroleague")){
            totalScore = baseScore + 3;
        } else if (competicio.equals("acb")) {
            totalScore = baseScore + 2;
        } else if (club.equals("barça") || club.equals("madrid")) {
            totalScore = baseScore + 1;
        }
        return totalScore;
    }
}
