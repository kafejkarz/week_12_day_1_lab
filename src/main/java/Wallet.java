import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan>  numbers;


    public Wallet(String name) {
        this.name = name;
        this.numbers = new ArrayList<IScan>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.numbers.size();
    }

    public void addItem(IScan number) {
        this.numbers.add(number);
    }
}
