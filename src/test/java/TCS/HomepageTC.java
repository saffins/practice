package TCS;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomepagePF;

public class HomepageTC extends Base {
	HomepagePF homepagePF;

	@Test
	public void addTshirtToCart() throws InterruptedException {

		homepagePF = new HomepagePF(driver);
     	homepagePF.clickTshirts();
		homepagePF.clickFadedTshirt();
		homepagePF.addCart();

	}

	@Test
	public void verifyAddedProductToCart() {

		Assert.assertEquals(homepagePF.getProdTitle(), "Faded Short Sleeve T-shirts");
		Assert.assertEquals(homepagePF.getProdColour(), "Orange, S");

	}

}
