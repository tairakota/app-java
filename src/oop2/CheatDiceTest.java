package oop2;

public class CheatDiceTest {
    public static void main(String[] args) {
        var dice6 = new CheatDice();
        for (var i = 0; i < 40; i++) {
            System.out.println((i + 1) + "回目" + dice6.cast2());
        }
    }
}
