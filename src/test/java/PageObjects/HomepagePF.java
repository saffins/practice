package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TCS.Base;

public class HomepagePF  {
	
    WebDriver driver;
	WebDriverWait driverWait;
	
	@FindBy(css="span[id='layer_cart_product_title']")
	WebElement prodTitle;
	
	public String getProdTitle(){
		
		
		return prodTitle.getText();
		
	}
	
	@FindBy(css="span[id='layer_cart_product_attributes']")
	WebElement prodColour;
	
	public String getProdColour(){
		
		
		return prodColour.getText();
		
	}
	
	
	
	public HomepagePF(WebDriver driver){
		driverWait = new WebDriverWait(driver, 40);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="#block_top_menu > ul > li:nth-child(3) > a")
	WebElement tShirtsLink;
	
	public void clickTshirts(){
		
		driverWait.until(ExpectedConditions.elementToBeClickable(tShirtsLink));
		tShirtsLink.click();
		
	}
	
	@FindBy(css="img[alt='Faded Short Sleeve T-shirts']")
	WebElement fadedTshirt;
	
	public void clickFadedTshirt(){
		
		fadedTshirt.click();
	}
	
	@FindBy(css="p[id='add_to_cart']")
	WebElement addToCart;
	
	public void addCart() throws InterruptedException{
		
		addToCart.click();
		Thread.sleep(5000);
		
	}
	

	
}
