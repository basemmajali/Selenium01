package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleWithSelenium {
    public static void main(String[] args) {
        //setup browser using WebDriverManager class
        WebDriverManager.chromedriver().setup();
        //new object from WebDriver class
        WebDriver driver = new ChromeDriver();
        //maximize browser page
        driver.manage().window().maximize();
       //add URL for Website
        driver.get("https://qacart.com/ar");
        //save title in new variable
        String Title =driver.getTitle();
        //print title
        System.out.println("Title:"+Title);
        //go to another website
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/");
        //save title for new page
        Title =driver.getTitle();
        //print title
        System.out.println("Title:"+Title);
    }
}
