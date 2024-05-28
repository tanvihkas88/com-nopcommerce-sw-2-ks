package testsuite;
/*
Write down the following test into ‘RegisterTest’ class
1. userShouldNavigateToRegisterPageSuccessfully
* click on the ‘Register’ link
* Verify the text ‘Register’
2. userSholdRegisterAccountSuccessfully * click on the ‘Register’ link
* Select gender radio button
* Enter First name
* Enter Last name
* Select Day Month and Year
* Enter Email address
* Enter Password
* Enter Confirm password
* Click on REGISTER button
* Verify the text
 */
import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openbrowser(baseUrl);
    }
    /*
    1. userShouldNavigateToRegisterPageSuccessfully
    * click on the ‘Register’ link
    * Verify the text ‘Register’
     */
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        driver.findElement(By.linkText("Register")).click();
        String expectedText = "Register";
        String actualText = driver.findElement(By.xpath("//h1[text()='Register']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    /*
    2. userShouldRegisterAccountSuccessfully * click on the ‘Register’ link
    * Select gender radio button
    * Enter First name
    * Enter Last name
    * Select Day Month and Year
    * Enter Email address
    * Enter Password
    * Enter Confirm password
    * Click on REGISTER button
    * Verify the text

     */
    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //click on the ‘Register’ link
        driver.findElement(By.linkText("Register")).click();
        //Select gender radio button
        driver.findElement(By.id("gender-male")).click();
        //Enter First name
        driver.findElement(By.id("FirstName")).sendKeys("Kartik");
        //Enter Last name
        driver.findElement(By.id("LastName")).sendKeys("Shah");
        //Select Day Month and Year
        new Select(driver.findElement(By.name("DateOfBirthDay"))).selectByValue("16");
        new Select(driver.findElement(By.name("DateOfBirthMonth"))).selectByValue("1");
        new Select(driver.findElement(By.name("DateOfBirthYear"))).selectByValue("1982");
        //Enter Email address
        driver.findElement(By.id("Email")).sendKeys("legend@gmail.com");
        //Enter Password
        driver.findElement(By.id("Password")).sendKeys("password123");
        //Enter Confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("password123");
        //Click on REGISTER button
        driver.findElement(By.id("register-button")).click();
        //Verify the text
        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
