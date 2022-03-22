public class TestClass {
    public static void sleep (long millSec) {
        try {
            Thread.sleep(millSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
