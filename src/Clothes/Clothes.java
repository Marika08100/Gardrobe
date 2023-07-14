package Clothes;

import Types.Gender;

public abstract class Clothes {
    private final String type;
    private final Gender gender;
    private final int condition;


    public Clothes(String type, Gender gender, int condition) {
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
    public int getCondition() {
        return condition;
    }




    @Override
    public String toString() {
        return "Clothes.Clothes{" +
                "type='" + type + '\'' +
                ", gender=" + gender;
    }
}
