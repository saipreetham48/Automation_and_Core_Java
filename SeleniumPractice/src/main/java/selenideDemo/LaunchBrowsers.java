package selenideDemo;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
//import these two 
/*
 * import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
 */

import org.openqa.selenium.By;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

public class LaunchBrowsers {
	// screenshots:if failed it will automatically takes screensots

	public static void main(String[] args) {
		Configuration.browser = Browsers.EDGE;// default is chrome
		// Configuration.baseUrl="https://www.google.com/";
		// Configuration.headless=true;//default false
		// Configuration.screenshots=false;// default true

		open("https://www.google.com/");

		$(By.name("q")).setValue("hyr tutorials");
		$(By.name("btnK")).click();
		$(By.xpath("//a[@id='logo']")).shouldHave(Condition.appear);
		System.out.println($(By.xpath("//h3[text()='H Y R Tutorials - H Y R Tutorials']")).getText());
		int headerCount = $$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).size();
		System.out.println(headerCount);
	}

}
