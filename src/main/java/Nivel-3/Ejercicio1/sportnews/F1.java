package sportnews;

public class F1 extends New{
    private String escuderia;

    public F1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
    }

    @Override
    public int calculatePrice() {
        int basePrice = 100;
        int totalPrice = 0;
        if (escuderia.equals("ferrari") || escuderia.equals("mercedes")) {
            totalPrice = basePrice + 50;
        }
        return totalPrice;
    }

    @Override
    public int calculateScore() {
        int baseScore = 4;
        int totalScore = 0;
        if (escuderia.equals("ferrari") || escuderia.equals("mercedes")) {
            totalScore = baseScore + 2;
        }
        return totalScore;
    }
}
