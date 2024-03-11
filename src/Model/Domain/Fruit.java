package Model.Domain;

public class Fruit {
    private String name;
    private int amountWords;
    public Fruit(String name) {
        this.name = name;
        this.amountWords = name.length();

    }
    public int getAmountWords() {
        return amountWords;
    }
    public String getName() {
        return name;
    }
}
