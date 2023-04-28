package function;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Function;

public class FunctionObjectPractice {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        //偶数か奇数を判定する
        Predicate<Integer> predicate1 = i -> i % 2 == 0;
        System.out.println("奇数か偶数かを判定します。");
        var s1 = sc.nextLine();
        var s1i = Integer.parseInt(s1);
        System.out.println(predicate1.test(s1i));

        //文字列を反転させる
        Function<StringBuilder, StringBuilder> function1 = i -> i.reverse();
        System.out.println("文字列を反転させます。");
        var s2 = sc.nextLine();
        StringBuilder sb = new StringBuilder(s2);
        System.out.println(function1.apply(sb));

        //文字列を指定された文字で区切る
        Function<String, List> function2 = i -> Arrays.asList(i.split(","));
        System.out.println("文字列を「,」部分で区切ります。");
        var s3 = sc.nextLine();
        System.out.println(function2.apply(s3));

        
    }

}
