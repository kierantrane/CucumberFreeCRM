package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateContact {

	WebDriver driver;
	static String userDir = System.getProperty("user.dir");

	@Given("^User is already on login Page$")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", userDir + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
	}

	@When("^user mouse over contacts link$")
	public void user_mouse_over_contacts_link() {

	}

	@Then("^user clicks on New Contact link$")
	public void user_clicks_on_New_Contact_link() {

	}

	@Then("^User enters First Name and Last Name$")
	public void user_enters_First_Name_and_Last_Name() {

	}

	@Then("^Verify the contact is created$")
	public void verify_the_contact_is_created() {

	}

}
