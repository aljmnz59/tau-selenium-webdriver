package base;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webDriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//
//        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
//        inputsLink.click();

        WebElement scLink = driver.findElement(By.linkText("Shifting Content"));
        scLink.click();

        WebElement example1 = driver.findElement(By.linkText("Example 1: Menu Element"));
        example1.click();

        List<WebElement> scMenu = driver.findElements(By.tagName("li"));
        System.out.println(scMenu.size());

        System.out.println(driver.getTitle());
        driver.quit();
    }

    static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
