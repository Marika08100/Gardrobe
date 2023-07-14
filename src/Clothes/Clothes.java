package Clothes;

import Types.Condition;
import Types.Gender;

public abstract class Clothes {
    private final String type;
    private final Gender gender;
    private final Condition condition;

    public Clothes(String type, Gender gender, Condition condition) {
        this.type = type;
        this.gender = gender;
        this.condition = condition;
    }

    public String getType() {
        return type;
    }

    public Gender getGender() {
        return gender;
    }

    public Condition getCondition() {
        return condition;
    }


    @Override
    public String toString() {
        return "Clothes.Clothes{" +
                "type='" + type + '\'' +
                ", gender=" + gender +
                ", condition=" + condition +
                '}';
    }
}
