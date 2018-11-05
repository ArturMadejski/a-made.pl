package pl.art.amadepl.entity;

public enum MessageType {

    GOOD("good job"), NEUTRAL("it's alright"), BAD("you're sucks");


    private String value;

    MessageType(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
