package FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElementByName {
    public static void main(String[] args) {
        //setup driver
        WebDriverManager.edgedriver().setup();
        //create object to start test on Edge
        WebDriver driver =new EdgeDriver();
        //go to this url
        driver.get("https://jo.opensooq.com/en");
        //create new value to save the text
        //String descrption ;
        //based on previous url find element by this name (description)and print the text
        //descrption=driver.findElement(By.name("description")).getText();
        //print description
        System.out.println("description : "+ driver.findElement(By.name("description")));
        driver.quit();
    }
}
