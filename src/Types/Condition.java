package Types;
public enum Condition {
    WORST(1),
    BAD(2),
    AVERAGE(3),
    GOOD(4),
    BEST(5);

    private final int value;

    Condition(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}