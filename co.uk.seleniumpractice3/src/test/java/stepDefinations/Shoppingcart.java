package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

<<<<<<< HEAD
import org.junit.Assert;

import org.junit.Assert;


=======
>>>>>>> 43150d09d510a8b98fad20c4351e151b5d70a4df
public class Shoppingcart {

	WebDriver driver = null;
	
	
	@Before
	public void startDriver() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void closeBrowser() {
		
		//driver.close();
		//driver.quit();
		
	}

	@Given("^navigate to the \"([^\"]*)\"$")
	public void navigate_to_the(String url) throws Throwable {
		
		driver.navigate().to(url);
		Assert.assertEquals("X-Cart Demo store company > Catalog", driver.getTitle());
	
	}


	@Given("^As a user I Search for \"([^\"]*)\" in search box$")
	public void as_a_user_I_Search_for_in_search_box(String product) throws Throwable {
		
		Assert.assertTrue(driver.findElement(By.name("substring")).isDisplayed());
		
		driver.findElement(By.name("substring")).sendKeys(product);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"form-1533153949209\\\"]/div[2]/button")));

		 
	    driver.findElement(By.xpath("//*[@id=\"form-1533153949209\"]/div[2]/button")).click();

	
	
	
	
	    
	}

	@When("^I can search results$")
	public void i_can_search_results() throws Throwable {
	    
	}

	@Then("^I should see the \"([^\"]*)\" in the saerch page$")
	public void i_should_see_the_in_the_saerch_page(String arg1) throws Throwable {
	  
	}

}
