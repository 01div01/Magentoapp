

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Account 
{
	WebDriver driver;
	By logout=By.linkText("Log Out");
	public Account (WebDriver driver)
	{
		this.driver=driver;
	}
	public void ClickOnLogOut()
	{
		driver.findElement(logout).click();
		driver.close();
	}

}
