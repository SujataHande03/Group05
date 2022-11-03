package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {
	private WebDriver driver;
	Select sec;
	
	@FindBy (xpath ="//input[@id='twotabsearchtextbox']") private WebElement searchBox;
	@FindBy (xpath ="//span[text()='Samsung Galaxy M53 5G (Mystique Green, 6GB, 128GB Storage) | 108MP | sAmoled+ 120Hz | 12GB RAM with RAM Plus | Travel Adapter to be Purchased Separately']") private WebElement samsungMobile;
	@FindBy (xpath ="//select[@id='quantity']") private WebElement quantity;
	@FindBy (xpath ="//input[@name='submit.add-to-cart']") private WebElement cart;
	@FindBy (xpath ="//span[@id='attach-sidesheet-checkout-button']") private WebElement proceedToCheckout;
	
	public AddToCart(WebDriver driver)
	  {
		   PageFactory.initElements(driver, this);
		   this.driver=driver;
	  }
	
	public void sendSearchBox()
	  {
		  searchBox.sendKeys("Mobile");
		  searchBox.submit();
	  }
	
	public void mobileSamsung()
	  {
		  samsungMobile.click();
	  }  
	
	public void mobileQuantity()
	  {
		  sec=new Select(quantity);
		  sec.selectByValue("2");
	  }
	
	public void addCartButton()
	 {
		cart.click();
	 }
	public void proceedToCheckoutButton()
	 {
		 proceedToCheckout.click();
	 }

}
