//package StepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginDemoSteps {
//	WebDriver driver = null;
//
//	@Given("Browser is opened")
//	public void browser_is_opened() {
//		driver = new EdgeDriver();
//		driver.manage().window().maximize();
//
//	}
//
//	@And("user is on the webpage")
//	public void user_is_on_the_webpage() {
//		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
//		System.out.println("PageTitle" + driver.getTitle());
//	}
//
//	@When("^user entered the (.*) and (.*)$")
//	public void user_entered_the_username_and_password(String username, String password) {
//		WebElement text = driver.findElement(By.id("username"));
//		text.sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		System.out.println("Get Entered text:" + text.getDomProperty("value"));
//	}
//
//	@And("user hit submit button")
//	public void user_hit_submit_button() {
//		driver.findElement(By.id("submit")).click();
//		
//		
//	}
//
//	@Then("user navigated to logout page.")
//	public void user_navigated_to_logout_page() {
//		WebElement displayTxt = driver.findElement(By.tagName("h1"));
//		if (displayTxt.isDisplayed()) {
//			System.out.println(displayTxt.getText());
//			driver.quit();
//		} else
//			driver.quit();
//
//	}
//
//}
