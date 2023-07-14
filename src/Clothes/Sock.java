package Clothes;

import Types.Gender;
import Types.SocksType;

public class Sock extends Clothes {
    private final SocksType sockType;

    public Sock(Gender gender, int condition,SocksType sockType) {
        super("zokni", gender,condition);
        this.sockType = sockType;
    }

    public SocksType getSockType() {
        return sockType;
    }
}
