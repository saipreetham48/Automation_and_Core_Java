package selenideDemo;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
public class AlertTest {

	public static void main(String[] args) {
		//open("https://mail.rediff.com/cgi-bin/login.cgi");
		open("https://testpages.eviltester.com/styled/alerts/alert-test.html");
		//$(By.name("proceed")).click();
		$(By.id("promptexample")).click();

		Alert alert=switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("sedrfggh");
		alert.accept();
		//alert.dismiss();
	}

}
