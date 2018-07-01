
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest 
{
	@Test
	public void testrun()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url="https://www.magento.com";
		System.out.println(driver);
		driver.get(url);
		
		Home h=new Home(driver);
		h.clickOnMyacct();
		Login l=new Login(driver);
		l.sendEmail("subramanyaraj87@gmail.com");
		l.sendPassword("Welcome123");
		l.clickLogin();
		Main m=new Main(driver);
		m.clickOnLogout();
	}
}
