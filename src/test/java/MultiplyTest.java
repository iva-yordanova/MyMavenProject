import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplyTest {

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{{5, 5, 25}, {2, 5, 9}};
    }

    @Test(dataProvider = "data-provider")
    public void myTest3(int a, int b, int result) {
        int multiplication = a * b;
        Assert.assertEquals(result, multiplication);
        System.out.println("The result is: " + multiplication);
    }
}
