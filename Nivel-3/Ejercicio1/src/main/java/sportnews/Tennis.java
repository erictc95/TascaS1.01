package sportnews;

public class Tennis extends News{
    private String competicio;
    private String tenistes;

    public Tennis(String titular, String competicio, String tenistes) {
        super(titular);
        this.competicio = competicio;
        this.tenistes = tenistes;
    }

    @Override
    public int calculatePrice() {
        int basePrice = 150;
        int totalPrice = 0;
        if (tenistes.equals("federer") || tenistes.equals("nadal") || tenistes.equals("djokovic")) {
            totalPrice = basePrice + 100;
        }
        return totalPrice;
    }

    @Override
    public int calculateScore() {
        int baseScore = 4;
        int totalScore = 0;
        if (tenistes.equals("federer") || tenistes.equals("nadal") || tenistes.equals("djokovic")) {
            totalScore = baseScore + 3;
        }
        return totalScore;
    }
}
