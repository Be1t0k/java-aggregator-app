//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://store.steampowered.com/");
        WebElement button1 =  driver.findElement(By.xpath("//a[@id='store_search_link']/img"));
        WebElement input1 =  driver.findElement(By.id("store_nav_search_term"));
        // ввод названия игры
        input1.click();
        Scanner in = new Scanner(System.in);
        String search_res = in.nextLine().toLowerCase();
        input1.sendKeys(search_res);
        button1.click();
        // выбор первой из списка результатов
        WebElement game_item = driver.findElement(By.className("responsive_search_name_combined"));
        WebElement game_item_text = driver.findElement(By.xpath("//div[@class='col search_name ellipsis']/span"));
        game_item_text.getText();
        //Проверка на совпадение
        boolean compare_res = search_res.equals(game_item_text.getText().toLowerCase());
        if (compare_res){
            game_item.click();
            //Вывод заголовка
            WebElement game_title = driver.findElement(By.id("appHubAppName"));
            System.out.println(game_title.getText());
            WebElement game_descrip = driver.findElement(By.className("game_description_snippet"));
            System.out.println(game_descrip.getText());
        }
        else{
            System.out.println("Не пройдена");
        }

    }
}
