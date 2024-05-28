package testsuite;
/*
Write down the following test into ‘LoginTest’ class
1. userShouldNavigateToLoginPageSuccessfully * click on the ‘Login’ link
* Verify the text ‘Welcome, Please Sign In!’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openbrowser(baseUrl);

    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedText = "Welcome, Please Sign In!";
        WebElement welcomeTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = welcomeTextElement.getText();
        Assert.assertEquals("No redirected to login page", expectedText, actualText);
    }
/*
2. userShouldLoginSuccessfullyWithValidCredentials
* click on the ‘Login’ link
* Enter valid username
* Enter valid password
* Click on ‘LOGIN’ button
* Verify the ‘Log out’ text is display

 */
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Click on the 'Login' link
        driver.findElement(By.linkText("Log in")).click();

        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("xyz@gmail.com");

        // Enter valid password
        driver.findElement(By.id("Password")).sendKeys("Xyz123");

        // Click on 'LOGIN' button
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

        // Verify the ‘Log out’ text is displayed
        String expectedText = "Log out";

        String actualText = driver.findElement(By.xpath("//a[contains(text(), 'Log out')]")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    /*
    3. verifyTheErrorMessage
* click on the ‘Login’ link
* Enter invalid username
* Enter invalid password
* Click on Login button
* Verify the error message ‘Login was unsuccessful.
Please correct the errors and try again. No customer account found’
     */
    @Test
    public void verifyErrorMessageWithInvalidCredential() {
        //Find the login link and click
        driver.findElement(By.linkText("Log in")).click();
        //find the email field and enter the email address
        driver.findElement(By.id("Email")).sendKeys("Prime123@gmail.com");
        // find the password field and enter the password
        driver.findElement(By.id("Password")).sendKeys("Prime123");

        //Click on Login Button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        String actualErrorMessage = driver.findElement(By.xpath("//div[@class = 'message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error Message not displayed", expectedErrorMessage, actualErrorMessage);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
