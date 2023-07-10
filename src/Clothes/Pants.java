package Clothes;

import Types.Condition;
import Types.Gender;
import Types.PantsLength;

public class Pants extends Clothes {
    private final PantsLength pantsLength;
    public Pants(String type, Gender gender, Condition condition, PantsLength pantsLength) {
        super(type, gender, condition);
        this.pantsLength = pantsLength;
    }

    public PantsLength getPantsLength() {
        return pantsLength;
    }

    @Override
    public String toString() {
        return "Clothes.Pants{" +
                "pantsLength=" + pantsLength +
                '}';
    }
}

