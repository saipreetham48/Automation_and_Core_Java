package pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {
	@FindBy(id="username")
	@CacheLookup
	WebElement txt_username;
	@FindBy(id="password")
	WebElement txt_password;
	@FindBy(id="submit")
	WebElement btn_submit;
	
//	@FindBy(partialLinkText = "sai")
//	List<WebElement> myLinks;
	
//	@FindBy(how = How.ID,using = "submit")
//	WebElement submt;
	
	WebDriver driver;
	
	
	public LoginPage_PF(WebDriver driver) {
		this.driver=driver;
		//AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 20);
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickSubmit() {
		btn_submit.click();
	}

}
