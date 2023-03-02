package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrangeHomePage {

    public static By Dashboard=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6");
public static By logoutMenu = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i");
public static By logiut = By.className("oxd-userdropdown-link");
    public OrangeHomePage(WebDriver driver) {
    }
    public void logout(WebDriver driver)
    {
        driver.findElement(logoutMenu).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(logiut)));
        driver.findElement(logiut).click();
    }
}