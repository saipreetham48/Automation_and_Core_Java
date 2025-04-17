package selenideDemo;

import static com.codeborne.selenide.Selenide.back;
import static com.codeborne.selenide.Selenide.forward;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.refresh;
import static com.codeborne.selenide.Selenide.title;

import com.codeborne.selenide.Configuration;

public class NavigationDemo {

	public static void main(String[] args) throws InterruptedException {
		Configuration.browser = "edge";
		open("https://www.google.com");
		System.out.println(title());
		open("https://www.flipkart.com");
		System.out.println(title());
		back();
		System.out.println(title());
		forward();
		System.out.println(title());
		Thread.sleep(4000);
		refresh();
		System.out.println(title());

	}

}
