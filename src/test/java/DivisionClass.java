import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionClass {

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{{100, 5, 20}};
    }

    @Test(dataProvider = "data-provider",  groups = "divide")
    public void myTest4(int a, int b, int result) {
        System.out.println("The result is: " + (a / b));
        Assert.assertEquals(result, (a / b));
    }

}
