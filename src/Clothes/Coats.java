package Clothes;

import Types.CoatType;
import Types.Gender;


public class Coats extends Clothes {
    private final CoatType coatType;


    public Coats(Gender gender, int condition,CoatType coatType) {
        super("kabát", gender,condition);
        this.coatType = coatType;
    }

    public CoatType getCoatType() {
        return coatType;
    }

    @Override
    public String toString() {
        return "Coats{" +
                "coatType=" + coatType +
                ", condition="  +
                '}';
    }
}
