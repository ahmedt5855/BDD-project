package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class forget_password  {

	public By forget_pass=By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]");
	public By Reset_password=By.xpath("//h6[@class=\"oxd-text oxd-text--h6 orangehrm-forgot-password-title\"]");
	public void click_on_forget_pass(WebDriver driver)
	{
		driver.findElement(forget_pass).click();

	}
	public String expected_result_forget(WebDriver driver)
	{
		return driver.findElement(Reset_password).getText();
	}

}
