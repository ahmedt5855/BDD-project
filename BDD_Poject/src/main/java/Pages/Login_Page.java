package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
public By usertxt = By.name("username");
public By passtxt = By.name("password");
public By loginbtn = By.xpath("//button[@type=\"submit\"]");
    public By Required_username=By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message\"]");
    public By Required_password=By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message\"]");
    public By invalid_credential=By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]");


    public static void click_button(By btn,WebDriver driver)
    {
        driver.findElement(btn).click();
    }
    public static void setTextElement(By TextElement,String value,WebDriver driver)
    {
        driver.findElement(TextElement).sendKeys(value);
    }
    public String Required_username(WebDriver driver)
    {
        return driver.findElement(Required_username).getText();

    }
    public String Required_password(WebDriver driver)
    {
        return driver.findElement(Required_password).getText();
    }
    public String Required_valid(WebDriver driver)
    {
        return driver.findElement(invalid_credential).getText();

    }



}
