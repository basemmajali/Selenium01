package FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class FindElementByID {
    public static void main(String[] args) {
        //setup driver
        WebDriverManager.edgedriver().setup();
        //create object to start test on Edge
        WebDriver driver =new EdgeDriver();
        //go to this url
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/");
        //based on previous url find element by this id (welcome)and print the text
        System.out.println(driver.findElement(By.ById.id("welcome")).getText());
        driver.quit();
    }}
