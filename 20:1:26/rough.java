import java.io.IOException;

class Rough {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }
        catch (Exception e) {
            throw new RuntimeException();
        }
        finally {
            System.out.println("Finally");
        }

    }
}
