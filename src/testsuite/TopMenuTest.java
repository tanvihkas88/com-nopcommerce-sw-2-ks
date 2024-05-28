package testsuite;
/*
userShouldNavigateToComputerPageSuccessfully
* click on the ‘Computers’ Tab
* Verify the text ‘Computers’
2. userShouldNavigateToElectronicsPageSuccessfully
* click on the ‘Electronics’ Tab
* Verify the text ‘Electronics’
3. userShouldNavigateToApparelPageSuccessfully
* click on the ‘Apparel’ Tab
* Verify the text ‘Apparel’ 4.
userShouldNavigateToDigitalDownloadsPageSuccessfully
* click on the ‘Digital downloads’ Tab
* Verify the text ‘Digital downloads’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openbrowser(baseUrl);
    }

    // click on the ‘Computers’ Tab
    // Verify the text ‘Computers’

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        driver.findElement(By.linkText("Computers")).click();
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    //2. userShouldNavigateToElectronicsPageSuccessfully
    //* click on the ‘Electronics’ Tab
    //* Verify the text ‘Electronics’
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        driver.findElement(By.linkText("Electronics")).click();
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    //3. userShouldNavigateToApparelPageSuccessfully
    //* click on the ‘Apparel’ Tab
    //* Verify the text ‘Apparel’
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        driver.findElement(By.linkText("Apparel")).click();
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//h1[text()='Apparel']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    //4.
    //userShouldNavigateToDigitalDownloadsPageSuccessfully
    //* click on the ‘Digital downloads’ Tab
    //* Verify the text ‘Digital downloads’

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        driver.findElement(By.linkText("Digital downloads")).click();
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    //5. userShouldNavigateToBooksPageSuccessfully
    //* click on the ‘Books’ Tab
    //* Verify the text ‘Books’

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        driver.findElement(By.linkText("Books")).click();
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    //userShouldNavigateToJewelryPageSuccessfully
    //* click on the ‘Jewelry’ Tab
    //* Verify the text ‘Jewelry’
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        driver.findElement(By.linkText("Jewelry")).click();
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//h1[text()='Jewelry']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    //userShouldNavigateToGiftCardsPageSuccessfully
    //* click on the ‘Gift Cards’ Tab
    //* Verify the text ‘Gift Cards’
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        driver.findElement(By.linkText("Gift Cards")).click();
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}

