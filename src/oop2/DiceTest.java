package oop2;

public class DiceTest {
    public static void main(String[] args) {
        var dice = new Dice();
        for (var i = 0; i < 30; i++) {
            System.out.println(dice.cast());
        }
        System.out.println("現在出ている目：" + dice.see());
    }
}
