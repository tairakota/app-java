package EnumPractice;

import java.util.Calendar;
import java.util.Scanner;

public class Enum {
    Calendar cal = Calendar.getInstance();

    public Enum (int year, int month, int day) {
        cal.setLenient(false);
        cal.set(year, month, day);
    }
    public String getDayOfWeek() {
        String week = "";
        switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY -> week = DayOfWeek.Sunday.getLabel();
            case Calendar.MONDAY -> week = DayOfWeek.Monday.getLabel();
            case Calendar.TUESDAY -> week = DayOfWeek.Tuesday.getLabel();
            case Calendar.WEDNESDAY -> week = DayOfWeek.Wednesday.getLabel();
            case Calendar.THURSDAY -> week = DayOfWeek.Thursday.getLabel();
            case Calendar.FRIDAY -> week = DayOfWeek.Friday.getLabel();
            case Calendar.SATURDAY -> week = DayOfWeek.Saturday.getLabel();
        }
        return week;
    }

    public enum DayOfWeek {
        Sunday("日"), Monday("月"), Tuesday("火"), Wednesday("水"), Thursday("木"), Friday("金"), Saturday("土");
        private final String label;
        DayOfWeek(String label) {
            this.label = label;
        }
        public String getLabel() {
            return label;
        }
    }


    public static void main(String[] args) {
        System.out.println("曜日を返します。");
        System.out.print("西暦を入力してください：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var year = Integer.parseInt(s1);
        System.out.print("月を入力してください：");
        var s2 = sc.nextLine();
        var month = Integer.parseInt(s2) - 1;
        System.out.print("日を入力してください：");
        var s3 = sc.nextLine();
        var day = Integer.parseInt(s3);

        var date = new Enum(year, month, day);
        System.out.println(date.getDayOfWeek());
    }
}
