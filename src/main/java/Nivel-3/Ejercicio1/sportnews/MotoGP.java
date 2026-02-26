package sportnews;

public class MotoGP extends New{
    private String equip;

    public MotoGP(String titular, String equip) {
        super(titular);
        this.equip = equip;
    }

    @Override
    public int calculatePrice() {
        int basePrice = 100;
        int totalPrice = 0;
        if (equip.equals("honda") || equip.equals("yamaha")) {
            totalPrice = basePrice + 50;
        }
        return totalPrice;
    }

    @Override
    public int calculateScore() {
        int baseScore = 3;
        int totalScore = 0;
        if (equip.equals("honda") || equip.equals("yamaha")) {
            totalScore = baseScore + 3;
        }
        return totalScore;
    }
}
