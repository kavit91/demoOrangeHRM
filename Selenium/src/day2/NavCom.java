package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavCom {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\selenium-java-3.141.59\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

	}

}
