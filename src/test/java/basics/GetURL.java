package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURL {
    public static void main(String[] args) {
        //setup browser using WebDriverManager class
        WebDriverManager.chromedriver().setup();
        //new object from WebDriver class
        WebDriver driver = new ChromeDriver();
        //add URL for Website
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/");
        //generate new value to save Url
        String url =driver.getCurrentUrl();
        //print url to check
        System.out.println("url="+url);
    }
}
