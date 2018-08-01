package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Shoppingcart {

	WebDriver driver = null;
	
	
	@Before
	public void startDriver() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void closeBrowser() {
		
		driver.close();
		driver.quit();
		
	}

	@Given("^navigate to the \"([^\"]*)\"$")
	public void navigate_to_the(String url) throws Throwable {
		
		driver.navigate().to(url);
		Assert.assertEquals("Welcome", driver.getTitle());
	
	}


	@Given("^as a user i Search for a product in search box for \"([^\"]*)\"$")
	public void searchProduct(String product) throws Throwable {

	}

	@When("^I add laptop to shopping cart$")
	public void addProductToCart() throws Throwable {

	}

	@Then("^I should see the product added to shopping cart$")
	public void verifyCart() throws Throwable {

	}

}
