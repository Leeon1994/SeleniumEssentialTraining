import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));

        Actions actions = new Actions(driver);

        actions.moveToElement(name);

        name.sendKeys("Salman Tariq");

        WebElement date = wait.until(ExpectedConditions.elementToBeClickable(By.id("date")));

        date.sendKeys("01/01/2022");

        driver.quit();
    }
}
