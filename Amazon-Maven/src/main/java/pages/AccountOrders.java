package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountOrders {
	 private Actions act;
	private WebDriver driver;
	
	@FindBy (xpath="//span[text()='Account & Lists']") private WebElement accountOrders;
	@FindBy (xpath ="//span[text()='Your Orders']") private WebElement yourOrders;
	@FindBy (xpath ="//input[@name='email']") private WebElement email;
	
	
	public AccountOrders(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void accountOrderNavigation()
	{
		 act= new Actions(driver);
		act.moveToElement(accountOrders).moveToElement(yourOrders).click().build().perform();
		
	}
	public void SendUserName()
	{
		email.sendKeys("9970537481");
	}

}




//input[@name='email']























//
//