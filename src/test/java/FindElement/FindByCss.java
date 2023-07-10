package FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindByCss {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String result;
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/");
        // if tag have id we will write #ID
        // for console we're using this for Xpath $x("") and for css without x just $("")
        result=driver.findElement(By.cssSelector("#welcome")).getText();
        System.out.println(result);
        driver.quit();
        //-------------------------------------
        driver=new EdgeDriver();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/locators.html");
        // if tag have class we will write .className
        result=driver.findElement(By.cssSelector(".mobile")).getText();
        System.out.println(result);
        driver.quit();
        //--------------------------------------
        driver=new EdgeDriver();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/locators.html");
        // if tag have name or testid data we will write [name=value]
        result=driver.findElement(By.cssSelector("[name=playwright]")).getText();
        System.out.println(result);
        driver.quit();
        //--------------------------------------
        driver=new EdgeDriver();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/locators.html");
        // we can go throw parent to child , first monition class parent then space and then child class
        result=driver.findElement(By.cssSelector(".wrapper #postman  ")).getText();
        System.out.println(result);
        driver.quit();


    }
}
