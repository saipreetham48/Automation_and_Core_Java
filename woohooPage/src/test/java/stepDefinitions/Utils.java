package stepDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	private Properties props = new Properties();
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	private String card = null;

	public Utils() {
		this.loadProperties();
		this.loadDrivers();
		this.loadGlobalVariables();
	}

	private void loadProperties() {
		try {
			props.load(new FileInputStream("src/test/resources/properties/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void loadDrivers() {
		if ("firefox".equalsIgnoreCase(GlobalVaraiables.browserName)) {
			driver = new FirefoxDriver();
		} else if ("edge".equalsIgnoreCase(GlobalVaraiables.browserName)) {
			driver = new EdgeDriver();
		}
		wait = new WebDriverWait(driver, Duration.ofSeconds(GlobalVaraiables.timeout));
	}
	
	public  WebDriver getDriver() {
		return driver;
	}
	public WebDriverWait getTimeoutWait() {
		return wait;
	}

	public void loadGlobalVariables() {
		GlobalVaraiables.browserName = props.getProperty("browserName");
		GlobalVaraiables.url = props.getProperty("url");
		GlobalVaraiables.timeout = Long.parseLong(props.getProperty("card"));
		GlobalVaraiables.card = props.getProperty("card");
	}

	public void takeScreenshot(String filename) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		filename = filename + "_" + LocalDateTime.now().toString();

		try {
			FileUtils.copyFile(screenshot.getScreenshotAs(OutputType.FILE),
					new File("src/test/resources/screenshots" + filename + ".png"));
		} catch (IOException | WebDriverException e) {
			e.printStackTrace();
		}
	}
//	public void jsClick() {
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.
//	}
	

}
