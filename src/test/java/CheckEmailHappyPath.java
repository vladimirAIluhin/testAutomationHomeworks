import org.testng.Assert;
        import org.testng.annotations.DataProvider;
        import org.testng.annotations.Test;

public class CheckEmailHappyPath {

    @DataProvider(name = "email")
    public static Object[][] emails() {
        return new Object[][] {
                { "AAA999@ua.ua" },
                { "aaa!_@AAA99.aaaaa"}};
    }

    @Test(dataProvider = "email")
    public void testEmail(String email) {
        Assert.assertTrue(Email.isEmailCorrect(email), "Email should match description while actual value is "+email);
    }
}
