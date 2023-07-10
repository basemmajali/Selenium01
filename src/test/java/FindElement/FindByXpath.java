package FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindByXpath {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/");
        /*Xpath expression
        * //TagName[@attribute='value']
        * tag name like h1/p/div
        * attribute like id/name/class
        *----------------search by some of value
        * //*[contains(@attribute,'some of value')]
         *-------------------search by text
         * //*[text ='the text']
         *---------------------search by some of text
         * $x("//*[contains(text(),'some of text')]")
         */
    }
}
