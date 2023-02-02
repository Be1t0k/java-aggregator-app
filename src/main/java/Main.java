//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.Keys;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        WebDriver webDriver = new EdgeDriver();
        Parser parser = new Parser();
        //parser.GOG(driver);
        //parser.Steam(webDriver);
        Scanner inn = new Scanner(System.in);
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(() -> parser.GOG(driver, inn));
        executor.execute(() -> parser.Steam(webDriver, inn)); //inline
        executor.shutdown();
    }
}