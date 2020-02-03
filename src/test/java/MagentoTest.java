

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MagentoTest 
{
	public static void main(String args[])
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://magento.com/");
	Welcome w=new Welcome(driver);
	w.ClickOnMyAccount();
	Login l=new Login(driver);
	l.entermail("div9334@gmail.com");
	l.enterpass("welcome@123");
	l.ClickOnLogin();
	Account a=new Account(driver);
	a.ClickOnLogOut();
	}
}
