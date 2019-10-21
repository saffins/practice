package TCS;

import org.testng.annotations.Test;

import PageObjects.HomepagePF;
import PageObjects.LoginPF;

public class LoginTC extends Base{
	
	@Test
	public void login() throws InterruptedException{
		
		LoginPF loginPF = new LoginPF(driver);
		loginPF.clickLogin();
		
		loginPF.setEmail("jetblue@grr.la");
		loginPF.setPass("jetblue");
		loginPF.loginUser();
		
	}
	
	

}
