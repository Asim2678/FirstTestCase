package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitions {

	WebDriver driver=null;
	
//	@Before
	//public void startDriver() {
		
		
//}
			

@Given("^navigate to http://thomascook\\.com$")
public void openBrowser() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\first.project\\src\\test\\java\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
//	System.setProperty("webdriver.gecko.driver","C:\\Users\\Dell\\eclipse-workspace\\first.project\\src\\test\\java\\Drivers\\geckodriver.exe");
//	WebDriver driver = new FirefoxDriver();
	
	
//	System.setProperty("webdriver.edge.driver","C:\\Users\\Dell\\eclipse-workspace\\first.project\\src\\test\\java\\Drivers\\MicrosoftWebDriver.exe"); 
	 
 //   WebDriver driver1 = new EdgeDriver();
	
	driver.get("https://www.thomascook.com/");
	
}


@Given("^as a user I enter \"([^\"]*)\" in search box From$")
public void as_a_user_I_enter_in_search_box_From(String arg1) throws Throwable {
    
}

@When("^I press \"([^\"]*)\"$")
public void i_press(String arg1) throws Throwable {

}

@Then("^I should see \"([^\"]*)\" in the search box$")
public void i_should_see_in_the_search_box(String arg1) throws Throwable {
   
}
}