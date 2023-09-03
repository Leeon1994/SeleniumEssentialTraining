import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.time.Duration;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDown = driver.findElement(By.id("dropdownMenuButton"));

        dropDown.click();

        WebElement dropDownItem = driver.findElement(By.id("autocomplete"));

        dropDownItem.click();

        driver.quit();
    }
}
