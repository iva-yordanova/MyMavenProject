import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractTest {
    @Test(dataProvider = "subtract", dataProviderClass = StaticProvider.class)
    public void myTest2(int a, int b, int result) {
        int subtract = a - b;
        Assert.assertEquals(result, subtract);
        System.out.println("The result is: " + subtract);
    }
}
