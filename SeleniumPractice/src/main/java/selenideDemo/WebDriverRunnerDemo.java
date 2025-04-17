package selenideDemo;
import static com.codeborne.selenide.Selenide.*;

import java.time.Duration;

import com.codeborne.selenide.WebDriverRunner;
public class WebDriverRunnerDemo {

	public static void main(String[] args) {
		open("https://www.google.com");
		WebDriverRunner.getWebDriver().getCurrentUrl();
		WebDriverRunner.getWebDriver().getTitle();
		WebDriverRunner.getAndCheckWebDriver().getPageSource();
		WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
	}

}
