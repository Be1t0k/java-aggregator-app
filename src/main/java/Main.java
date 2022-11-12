//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.uralairlines.ru/");
        WebElement button1 =  driver.findElement(By.className("search-form__btn"));
        button1.click();
        WebElement input1 =  driver.findElement(By.className("search-form__input"));
        input1.click();
        input1.sendKeys("Возврат билета");
        button1.click();
    }
}
