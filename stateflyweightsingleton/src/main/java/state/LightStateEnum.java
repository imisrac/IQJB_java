package state;

public enum LightStateEnum {
    RED("RED", "REDYELLOW"),
    REDYELLOW("REDYELLOW", "GREEN"),
    GREEN("GREEN", "YELLOW"),
    YELLOW("YELLOW", "RED");

    private String color;
    private String next;

    LightStateEnum(String color, String next) {
        this.color = color;
        this.next = next;
    }

    public LightStateEnum change() {
        return valueOf(next);
    }

    public String getColor() {
        return color;
    }
}
