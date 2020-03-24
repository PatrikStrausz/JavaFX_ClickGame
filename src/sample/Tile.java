package sample;

import java.util.Random;

public class Tile {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void toggle() {
        Random r = new Random();
        value = r.nextInt(6)+5;

    }

    public Tile() {
        value =0;
    }
}
