package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeAndFullscreen {
    public static void main(String[] args) {
        //setup browser using WebDriverManager class
        WebDriverManager.chromedriver().setup();
        //new object from WebDriver class
        WebDriver driver = new ChromeDriver();
        //maximize browser page
        driver.manage().window().maximize();
        // fullscreen for browser page
        driver.manage().window().fullscreen();


    }
}
