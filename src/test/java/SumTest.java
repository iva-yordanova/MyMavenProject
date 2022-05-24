import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest {

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{{4, 5, 9}};
    }

    @Test(dataProvider = "data-provider")
    public void myTest1(int a, int b, int result) {
        int sum = a + b;
        Assert.assertEquals(result, sum);
        System.out.println("The sum is: " + sum);
    }
}



