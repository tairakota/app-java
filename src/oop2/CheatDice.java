package oop2;

public class CheatDice extends Dice{
    int i;
    int random6;

    public int cast2() {
        i++;
        random6 = cast();
        if (i % 6 == 0) {
            return random6 = 6;
        }
        return random6;
    }
}
