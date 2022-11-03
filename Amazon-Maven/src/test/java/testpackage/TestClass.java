package testpackage;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.AccountOrders;
import pages.AddToCart;

public class TestClass {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
//	AccountOrders accountorders= new AccountOrders(driver);
//	Thread.sleep(5000);
//	accountorders.accountOrderNavigation();
//	accountorders.SendUserName();
//	
	AddToCart addToCart= new AddToCart(driver);
	addToCart.sendSearchBox();
	addToCart.mobileSamsung();
	ArrayList<String> url=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(url.get(1));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 500)");
	Thread.sleep(2000);
	addToCart.mobileQuantity();
	Thread.sleep(2000);
	addToCart.addCartButton();
	Thread.sleep(2000);
	addToCart.proceedToCheckoutButton();
	
	

}
}