import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SwitchToActiveWindow  {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.get("https://formy-project.herokuapp.com/switch-window");

        String originalHandle = driver.getWindowHandle();

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));

        newTabButton.click();

        for(String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        driver.switchTo().window(originalHandle);

        driver.quit();
    }
}
