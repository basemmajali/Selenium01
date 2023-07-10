package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavegateinSelenuim {
    public static void main(String[] args) {
        //setup browser using WebDriverManager class
        WebDriverManager.chromedriver().setup();
        //new object from WebDriver class
        WebDriver driver = new ChromeDriver();
        //fullscreen browser page
        driver.manage().window().maximize();
        //add URL for Website
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/");
        driver.navigate().to("https://www.google.com");//same driver.get
        driver.navigate().back();//back to previous page
        driver.navigate().forward();//go to forward page
        driver.navigate().refresh();//refresh page
        driver.quit();
    }
}
