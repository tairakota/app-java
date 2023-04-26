package exception;

public class IlligalScoreException extends RuntimeException{

    public static void erra() {
        try {
            throw new IlligalScoreException();
        }catch (IlligalScoreException e){
            System.out.println("test");
            ScannerNum.scannerNum();
        }

    }
}
