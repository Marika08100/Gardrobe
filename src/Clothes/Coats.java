package Clothes;

import Types.CoatType;
import Types.Gender;
import Types.Condition;


public class Coats extends Clothes {
    private final CoatType coatType;

    public Coats(Gender gender, Condition condition, CoatType coatType) {
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
