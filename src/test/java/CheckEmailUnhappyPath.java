import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailUnhappyPath {
    @DataProvider(name = "email")
    public static Object[][] emails() {
        return new Object[][]{
                {"AAA9ua.ua"},
                {"aaa!_$$#@@$!@$@AAA99.aaaaa"},
        };
    }

    @Test(dataProvider = "email")
    public void testEmail(String email) {
        Assert.assertFalse(Email.isEmailCorrect(email),
                "Email should not match description \nwhile actual value is " + email);
    }
}

