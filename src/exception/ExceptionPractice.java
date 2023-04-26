package exception;

public class ExceptionPractice {

    public static void main(String[] args) {
        System.out.println(ScannerNum.scannerNum());
    }

    public static String judgeScore(int score) {
        if (score > 100 || score < 0) {
            IlligalScoreException.erra();
            return ScannerNum.scannerNum();
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

//    public static void IlligalScoreExceptionTest() {
//        throw new IlligalScoreException();
//    }
}

