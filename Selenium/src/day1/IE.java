package day1;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\selenium-java-3.141.59\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}

}
