package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceWithSelenuim {
    public static void main(String[] args) {
        //setup browser using WebDriverManager class
        WebDriverManager.chromedriver().setup();
        //new object from WebDriver class
        WebDriver driver = new ChromeDriver();
        //maximize browser page
        driver.manage().window().maximize();
        //add URL for Website
        driver.get("https://qacart.com/ar");
        //save pageSource in new variable
        String pageSource =driver.getPageSource();
        //print pageSource
        System.out.println("the page source is :"+pageSource);
    }
}
