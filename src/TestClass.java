import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
    @Test
    public void someTest() {
        int actualValue = getSum(6, 6);

        Assert.assertEquals(actualValue, 12, "method sum not work");
    }
    public static int getSum(int a, int b){
        return  a+b;

    }
}
