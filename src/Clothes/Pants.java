package Clothes;

import Types.Gender;
import Types.PantsLength;
import Types.Condition;

public class Pants extends Clothes {
    private final PantsLength pantsLength;
    public Pants(Gender gender, Condition condition, PantsLength pantsLength) {
        super("nadrág", gender, condition);
        this.pantsLength = pantsLength;
    }

    public PantsLength getPantsLength() {
        return pantsLength;
    }

    @Override
    public String toString() {
        return "Clothes.Clothes.Pants{" +
                "pantsLength=" + pantsLength +
                '}';
    }
}

