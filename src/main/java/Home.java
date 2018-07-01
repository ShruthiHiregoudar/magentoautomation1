

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home 
{
	WebDriver driver=null;
	By myacct=By.xpath("//*[text()='Account']/ancestor::a");
	public Home(WebDriver driver)
	{
		this.driver=driver;
		System.out.println(driver);
	}
	public void clickOnMyacct()
	{
		driver.findElement(myacct).click();
	}

}
