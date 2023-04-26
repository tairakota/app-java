package exception;
import java.lang.Throwable;

public class ExceptionPractice {

    public static void main(String[] args) {
        var i = judgeScore(101);
        System.out.println(i);
    }

    public static String judgeScore(int score) {
        if (score > 100 || score < 0) {
            IlligalScoreExceptionTest();
            return "";
        } else if (score >= 80 && score <= 100) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 60) {
            return "C";
        } else {
            return "D";
        }
    }

    public static void IlligalScoreExceptionTest() {
        throw new IlligalScoreException();
    }
}

//scoreの値が80以上の場合は"A"を返す
//        scoreの値が70以上の場合は"B"を返す
//        scoreの値が60以上の場合は"C"を返す
//        scoreの値が59以下の場合は"D"を返す
//        scoreの値が負の値、または100より大きい場合はIlligalScoreExceptionの例外を投げる