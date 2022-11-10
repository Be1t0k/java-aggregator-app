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
//        WebDriver driver = new ChromeDriver();
//        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://passport.yandex.ru/auth");
        System.setProperty("webdriver.edge.driver", "D:\\vlsu_works\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.selenium.dev/documentation/webdriver/elements/finders/");
        WebElement lister =  driver.findElement(By.id("m-documentationgrid-li"));
        lister.click();
        
    }
}
