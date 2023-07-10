package visitingWebsites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
    public static void main(String[] args) {
        //setup browser using WebDriverManager class
        WebDriverManager.chromedriver().setup();
        //new object from WebDriver class
        WebDriver driver = new ChromeDriver();
        //add URL for Website
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/");
        /*for Html file using this
       driver.get("file://");
       after // we add path for file after adding in resources   */

    }
}
