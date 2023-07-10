package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndCloseinSelenuim {
    public static void main(String[] args) {
        //setup browser using WebDriverManager class
        WebDriverManager.chromedriver().setup();
        //new object from WebDriver class
        WebDriver driver = new ChromeDriver();
        //fullscreen browser page
        driver.manage().window().fullscreen();
        //add URL for Website
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/");
        driver.close();//close tab
        //open browser
        driver = new ChromeDriver();
        //add URL for Website
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/");
        driver.quit();//close all windows and tabs (using this)
    }
}
