package Clothes;

import Types.Condition;
import Types.Gender;
import Types.ShirtLength;

public class Shirt extends Clothes {
    private final ShirtLength shirtLength;
    public Shirt(String type, Gender gender, Condition condition, ShirtLength shirtLength) {
        super ("ing",gender, condition);
        this.shirtLength = shirtLength;
    }

    public ShirtLength getShirtLength() {
        return shirtLength;
    }
    @Override
    public String toString() {
        return "Clothes.Clothes.Shirt{" +
                "shirtLength=" + shirtLength +
                '}';
    }
}
