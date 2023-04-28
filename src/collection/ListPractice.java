package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        System.out.println("名前を入力してください（exitと入力すると終了します。）");
        var sc = new Scanner(System.in);
        while(true) {
            var s1 = sc.nextLine();
            if(s1.equals("exit")){
                break;
            }
            list.add(s1);
        }

        System.out.println("最初に入力された人：" + list.get(0));
        System.out.println("最後に入力された人：" + list.get(list.size() - 1));
        System.out.println("名前で並び替えます。");
        list.sort(String::compareTo);
        for(String i : list) {
            System.out.println(i);
        }
        sc.close();
    }
}
