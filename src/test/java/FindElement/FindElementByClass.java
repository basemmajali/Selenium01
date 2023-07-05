package FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElementByClass {
    public static void main(String[] args) {        //setup driver
        WebDriverManager.edgedriver().setup();
        //create object to start test on Edge
        WebDriver driver =new EdgeDriver();
        //go to this url
        driver.get("https://jo.opensooq.com/en");
        //based on previous url find element by this id (welcome)and print the text
        System.out.println(driver.findElement(By.className("font-26")).getText());
        driver.quit();
    }
}
