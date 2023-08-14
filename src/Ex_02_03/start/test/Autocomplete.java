package Ex_02_03.start.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));

        autocomplete.sendKeys("Al Wahda Mall Al Asalah Street");

        // since the google API is no longer working, I'll test clicking the dismiss button
        WebElement autocompleteResult = wait.until(ExpectedConditions.elementToBeClickable(By.className("dismissButton")));

        autocompleteResult.click();

        Thread.sleep(Duration.ofSeconds(5));
        driver.quit();
    }
}
