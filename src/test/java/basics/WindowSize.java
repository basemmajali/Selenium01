package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {
    public static void main(String[] args) {
        //setup browser using WebDriverManager class
        WebDriverManager.chromedriver().setup();
        //new object from WebDriver class
        WebDriver driver = new ChromeDriver();
        //generate new variable from Dimension class and give him width & height
        Dimension IphoneXR =new Dimension(414,811);
        //for change window size to specific size
        driver.manage().window().setSize(IphoneXR);
    }
}
