package Clothes;

import Types.Condition;
import Types.Gender;

public class Shoes extends Clothes {
    private final int size;

    public Shoes(String type, Gender gender, Condition condition, int size) {
        super("cipő", gender, condition);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    @Override
    public String toString() {
        return "Clothes.Clothes.Shoes{" +
                "size=" + size +
                '}';
    }
}
