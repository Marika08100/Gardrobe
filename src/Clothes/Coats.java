package Clothes;

import Types.CoatType;
import Types.Condition;
import Types.Gender;

public class Coats extends Clothes {
    private final CoatType coatType;

    public Coats(String type, Gender gender, Condition condition, CoatType coatType) {
        super("kabát", gender, condition);
        this.coatType = coatType;
    }

    public CoatType getCoatType() {
        return coatType;
    }

    @Override
    public String toString() {
        return "Clothes.Clothes.Coats{" +
                "coatType=" + coatType +
                '}';
    }
}
