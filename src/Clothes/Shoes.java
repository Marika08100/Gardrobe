package Clothes;

import Types.Gender;

public class Shoes extends Clothes {
    private final int size;

    public Shoes(Gender gender, int condition,int size) {
        super("cipő", gender,condition);
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
