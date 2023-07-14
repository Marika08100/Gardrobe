package Clothes;

import Types.CoatType;
import Types.Gender;
import Types.PantsLength;

public class Pants extends Clothes {
    private final PantsLength pantsLength;

    public Pants(Gender gender, int condition, PantsLength pantsLength) {
        super("kabát", gender,condition);
        this.pantsLength = pantsLength;
    }

    public PantsLength getPantsLength() {
        return pantsLength;
    }

    @Override
    public String toString() {
        return "Pants{" +
                "pantsLength=" + pantsLength +
                ", condition="  +
                '}';
    }
}

