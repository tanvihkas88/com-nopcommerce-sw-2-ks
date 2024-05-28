package browserfactory;
/*
Project-1 - ProjectName : com-nopcommerce-sw-2
BaseUrl = https://demo.nopcommerce.com/
1. Create the package ‘browserfactory’ and create the class with the name ‘BaseTest’ inside the
‘browserfactory’ package. And write the browser setup code inside the class ‘Base Test’.
2. Create the package ‘testsuite’ and create the following classes inside the ‘testsuite’ package.
1. LoginTest
2. TopMenuTest
3. RegisterTest
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public void openbrowser(String baseUrl) {
        // Launch the browser
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void closeBrowser() {
        driver.quit();

    }
}
