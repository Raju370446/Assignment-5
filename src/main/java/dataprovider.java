import org.testng.annotations.DataProvider;
public class dataprovider {
    @DataProvider(name = "cities")
    public Object[][] getDataFromDataprovider() {
        return new Object[][]{
                {"Visakhapatnam", "Mumbai"},
                {"Chennai", "Bangalore"},
                {"Mumbai", "Bangalore"},
                {"Delhi", "Chennai"},
                {"Mumbai", "Chennai"},
                {"Delhi", "Bangalore"},
                {"Hyderabad", "Pune"},
                {"Pune", "Mumbai"},
                {"Chennai", "Pune"},
                {"Delhi", "Hyderabad"}
        };
    }
}
