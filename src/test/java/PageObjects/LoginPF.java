package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TCS.Base;

public class LoginPF {

	WebDriver driver;

	@FindBy(css = "div.header_user_info > a.login")
	WebElement loginBtn;

	@FindBy(css = "input[id='email']")
	WebElement username;

	
	@FindBy(css = "input[id='passwd']")
	WebElement password;

	

	

	@FindBy(css = "button[id='SubmitLogin'] > span")
	WebElement loginUser;

	public void loginUser() {

		loginUser.click();

	}

	public void clickLogin() {

		loginBtn.click();

	}
	
	public LoginPF(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public void setPass(String pass) {

		password.sendKeys(pass);

	}
	
	public void setEmail(String email) {

		username.sendKeys(email);

	}


}
