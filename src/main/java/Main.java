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

public class Main {

    public  static  void  Steam(WebDriver webDriver){
        webDriver.get("https://store.steampowered.com/");
        WebElement button1 =  webDriver.findElement(By.xpath("//a[@id='store_search_link']/img"));
        WebElement input1 =  webDriver.findElement(By.id("store_nav_search_term"));
        // ввод названия игры
        input1.click();
        Scanner in = new Scanner(System.in);
        String search_res = in.nextLine().toLowerCase();
        input1.sendKeys(search_res);
        button1.click();
        // выбор первой из списка результатов
        WebElement game_item = webDriver.findElement(By.className("responsive_search_name_combined"));
        WebElement game_item_text = webDriver.findElement(By.xpath("//div[@class='col search_name ellipsis']/span"));
        game_item_text.getText();
        //Проверка на совпадение
        boolean compare_res = search_res.equals(game_item_text.getText().toLowerCase());
        if (compare_res){
            game_item.click();
            //Вывод заголовка
            WebElement game_title = webDriver.findElement(By.id("appHubAppName"));
            System.out.println(game_title.getText());
            WebElement game_descrip = webDriver.findElement(By.className("game_description_snippet"));
            System.out.println(game_descrip.getText());
        }
    }

    public  static  void  GOG(WebDriver webDriver){
        webDriver.get("https://www.gog.com/ru");
        WebElement search_icon =  webDriver.findElement(By.className("js-menu-search"));
        WebElement search_input = webDriver.findElement(By.className("menu-search-input__field"));
        search_icon.click();
        Scanner in = new Scanner(System.in);
        String search_res = in.nextLine().toLowerCase();
        search_input.sendKeys(search_res);
        search_input.sendKeys(Keys.RETURN);


    }

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        GOG(driver);
        Steam(driver);
    }
}
