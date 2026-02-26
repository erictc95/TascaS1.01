package sportnews;

public abstract class New {
    private String titular;
    private String text;
    private int score;
    private double price;

    public New(String titular) {
        this.titular = titular;
        this.text = "";
        this.score = 0;
        this.price = 0;
    }

    public String getTitular() {
        return titular;
    }

    public String getText() {
        return text;
    }

    public int getScore() {
        return score;
    }

    public double getPrice() {
        return price;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract int calculatePrice();

    public abstract int calculateScore();

}
