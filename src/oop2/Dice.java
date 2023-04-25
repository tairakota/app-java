package oop2;

public class Dice {
    int random;

    public int cast() {
        random = (int)(Math.random() * 6 + 1);
        return random;
    }

    public int see() {
        if (random == 0) {
            return 1;
        }
        return random;
    }
}
