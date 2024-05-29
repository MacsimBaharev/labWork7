package org.example;

public class Phone {
    private String number;
    private boolean type; //true - модильный, false - стационарный

    public Phone(String number, boolean type){
        this.number = number;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return (type ? "Mobile: " : "Static: ") + number;
    }
}
