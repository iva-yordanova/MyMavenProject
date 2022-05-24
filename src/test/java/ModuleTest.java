import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ModuleTest {
    @Test(groups = "divide")
    @Parameters({"a", "b"})
    public void multiParamTest( int a, int b) {
        System.out.println("Result from the division: " + (a % b));
        Assert.assertEquals((a % b),0,"There is a reminder");
    }
}

