package selenideDemo;
import static com.codeborne.selenide.Selenide.*;
public class BasicAuth {

	public static void main(String[] args) {
		open("url of website", "domain", "username", "password");
		
	}

}
