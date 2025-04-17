package StepsForHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksSteps {
	WebDriver driver=null;
	@Before(order = 2)
	public void browserSetup() {
		System.out.println("Inside of browsersetup ");
		driver=new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	@Before(order=1)
	public void browser2()
	{
		System.out.println("In browser2");
	}
	@After
	public void tearDown() {
		System.out.println("Inside of teardown");
		driver.close();
		driver.quit();
	}
	@BeforeStep
	public void beforeSteps() {
		System.out.println("Before steps ");
	}
	@AfterStep
	public void afterSteps() {
		System.out.println("After steps");
	}
	@Given("user is in login page")
	public void user_is_in_login_page() {
	}
	@When("user enters username and password")
	public void user_enters_username_and_password() {
	}
	@And("click submit")
	public void click_submit() {
	}
	@Then("user will be navigated to home page")
	public void user_will_be_navigated_to_home_page() {
	}



}
