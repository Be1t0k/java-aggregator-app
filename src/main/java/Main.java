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
import org.openqa.selenium.edge.EdgeOptions;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        options.setHeadless(true);
        options.addArguments("--headless");
        options.addArguments("start-maximized");
        WebDriver driver = new EdgeDriver(options);
        WebDriver webDriver = new EdgeDriver(options);
        Parser parser = new Parser();
        Scanner inn = new Scanner(System.in);
        //parser.GOG(driver,inn);
        parser.Steam(webDriver,inn);
//        ExecutorService executor = Executors.newCachedThreadPool();
//        executor.execute(() -> parser.GOG(driver, inn));
//        executor.execute(() -> parser.Steam(webDriver, inn)); //inline
//        executor.shutdown();
    }
}