package Clothes;

import Types.Condition;
import Types.Gender;
import Types.SocksType;

class Sock extends Clothes {
    private final SocksType sockType;

    public Sock(Gender gender, Condition condition, SocksType sockType) {
        super("zokni", gender, condition);
        this.sockType = sockType;
    }

    public SocksType getSockType() {
        return sockType;
    }
}
