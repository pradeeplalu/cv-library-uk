package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay
 */
public class TestData {
    @DataProvider(name = "JobFind")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                {"Accountant", "kingston", "up to 7 miles", "60000", "800000", "Per annum", "Permanent", "Permanent Accountant jobs in Kingston upon Thames"}
        };
        return data;
    }
}


