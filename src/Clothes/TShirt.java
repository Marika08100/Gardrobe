package Clothes;

import Types.Condition;
import Types.Gender;

public class TShirt extends Clothes {
    private String color;
    private boolean hasPattern;

    public TShirt(Gender gender, Condition condition, String color, boolean hasPattern) {
        super("T-Clothes.Clothes.Shirt",gender,condition);
        this.color = color;
        this.hasPattern = hasPattern;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasPattern() {
        return hasPattern;
    }

    public void setHasPattern(boolean hasPattern) {
        this.hasPattern = hasPattern;
    }

    @Override
    public String toString() {
        return "Clothes.Clothes.TShirt{" +
                "color='" + color + '\'' +
                ", hasPattern=" + hasPattern +
                '}';
    }
}
