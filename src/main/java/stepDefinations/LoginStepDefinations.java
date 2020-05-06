package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinations {
	
	WebDriver driver;
	static String userDir = System.getProperty("user.dir");

	@Given("^User is already on login Page$")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", userDir + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
	}
	
	@When("^Title of page is Free CRM$")
	public void title_of_page_is_Free_CRM() {
		String title = driver.getTitle();
		Assert.assertEquals("Cogmento CRM", title);
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
	   driver.findElement(By.name("email")).sendKeys("kieransnipp@gmail.com");
	   driver.findElement(By.name("password")).sendKeys("Snipp123!");
	 
	//   throw new PendingException();
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement login = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0]. click()", login); 
		
	}
	
	@Then("^user is on homepage$")
	public void user_is_on_homepage() {
		String title = driver.getTitle();
		Assert.assertEquals("Cogmento CRM", title);
	}
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    driver.close();
	    driver.quit();
	}

	

}
