package selenideDemo;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
public class IframeDemo {

	public static void main(String[] args) {
		open("https://www.hyrtutorials.com/p/frames-practice.html");
		System.out.println(title());
		switchTo().frame("frm2");
		$(By.id("firstName")).setValue("sai");
		switchTo().defaultContent();
		$(By.id("name")).setValue("Reddy");
		
	}

}
