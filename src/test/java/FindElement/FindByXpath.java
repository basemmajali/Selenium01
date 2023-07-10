package FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindByXpath {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/");
        /*Xpath expression
        >>> //TagName[@attribute='value']
         tag name : like h1/p/div
         attribute : like id/name/class
         */
         String data = driver.findElement(By.xpath("//h1[@id='welcome']")).getText();
        System.out.println(data);
        driver.quit();
        /*
        for console we're using this for Xpath $x("") and for css without x just $("")

         ----------------------search by some of value
         >>> //*[contains(@attribute,'some of value')]
         (*) like all data (like sql)
         (some of the value) : we can monition one word from the value
         (contains) يحتوي على
         */
        driver=new EdgeDriver();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/");
        System.out.println(driver.findElement(By.xpath("//*[contains(@id,'come')]")).getText());
        driver.quit();
        /*
         ---------------------search by text
          //*[text ='the text']
         (text) the text appear to the user
         */
        driver=new EdgeDriver();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/");
        System.out.println(driver.findElement(By.xpath("//*[text()='This is a website that we will use to learn the basic automation']")).getText());
        driver.quit();
        /*
         ---------------------search by some of text
          $x("//*[contains(text(),'some of text')]")

         */
        driver=new EdgeDriver();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/");
        System.out.println(driver.findElement(By.xpath("//*[contains(text(),'automation')]")).getText());
        driver.quit();
    }
}
