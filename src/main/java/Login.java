

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	WebDriver driver=null;
	By email=By.id("email");
	By pwd=By.id("pass");
	By login=By.id("send2");
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	public void sendEmail(String un)
	{
		driver.findElement(email).sendKeys(un);
	}
	public void sendPassword(String pwd1)
	{
		driver.findElement(pwd).sendKeys(pwd1);
	}
	public void clickLogin()
	{
		driver.findElement(login).click();
	}
}
