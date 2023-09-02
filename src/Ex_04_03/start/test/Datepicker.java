import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.time.Duration;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateElement = driver.findElement(By.id("datepicker"));

        dateElement.sendKeys("12/04/2022");

        dateElement.sendKeys(Keys.RETURN);

        driver.quit();
    }
}