package exception;

import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var score = 0;
        System.out.print("数値を入力してください（0～100）：");

        while (true) {
            while (true) {
                try {
                    var s1 = sc.nextLine();
                    score = Integer.parseInt(s1);
                    break;
                } catch (NumberFormatException n) {
                    System.out.print("\"数値\"を入力してください(0～100)：");
                }
            }

            try {
                var result = judgeScore(score);
                System.out.println("判定結果：" + result);
                break;
            } catch (IlligalScoreException e) {
                System.out.println("スコアが不正です。");
                System.out.print("数値を入力してください\"（0～100）\"：");
            }
        }
    }

    public static String judgeScore(int score) {
        if (score > 100 || score < 0) {
            throw new IlligalScoreException();
        } else if (score >= 80) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 60) {
            return "C";
        } else {
            return "D";
        }
    }

}