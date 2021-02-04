package exception;

public class MyException extends Exception {

    public static void main(String[] args) {
        try {
            throw new NullPointerException("NullPointerException");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void a() {
        throw new NumberFormatException("NumberFormatException");
    }

    private static void b() throws NumberFormatException{
        Integer.parseInt("-");
    }
}
