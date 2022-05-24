import org.testng.annotations.DataProvider;

public class StaticProvider {
    @DataProvider(name = "subtract")
    public static Object[][] createData() {
            return new Object[][]{{9, 4, 5}};
        }
    }
