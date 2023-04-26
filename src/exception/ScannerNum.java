package exception;

import java.util.Scanner;

import static exception.ExceptionPractice.judgeScore;

public class ScannerNum {
    public static String scannerNum() {
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        String num1;
        try {
            int num = Integer.parseInt(s1);
            num1 = judgeScore(num);
        } catch (NumberFormatException e) {
            System.out.println("数字を入力してください。");
            return scannerNum();
        }
        return num1;
    }
}
