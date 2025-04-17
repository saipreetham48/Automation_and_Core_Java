//package StepDefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//public class GoogleSerachSteps {
//	WebDriver driver=null;
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside step page: browser is opened");
//		driver=new EdgeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
//	   
//	}
//
//	@And("user is on webpage")
//	public void user_is_on_webpage() {
//		System.out.println("Inside step page:user is on the search page");
//		driver.navigate().to("https://www.google.com/");
//	   
//	}
//
//	@When("user entering text in the textbox")
//	public void user_entering_text_in_the_textbox() {
//		System.out.println("Inside step page:user entering text in checkbox");
//		driver.findElement(By.className("gLFyf")).sendKeys("Automation step by step");;
//	  
//	}
//
//	@And("hits enter")
//	public void hits_enter() {
//		System.out.println("Inside step page:user hit the enter");
//		driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
//	    
//	}
//
//	@Then("navigate to the search results")
//	public void navigate_to_the_search_results() {
//		System.out.println("Inside step page:navigated to the search results");
//		System.out.println(driver.getPageSource().contains("Online Courses"));
//		driver.quit();
//	   
//	}
//
//
//
//}
