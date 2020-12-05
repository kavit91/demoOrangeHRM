package day1;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class Webdrive {
	
	public static void main(String[]args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		
//		System.out.println("this is my first webdriver program");
		
//		 String baseUrl = "http://demo.guru99.com/test/newtours/";
//	        String expectedTitle = "Welcome: Mercury Tours";
//	        String actualTitle = "";
	        
//	        driver.get(baseUrl);
	        
//	        actualTitle = driver.getTitle();
//	        if (actualTitle.contentEquals(expectedTitle)){
//	            System.out.println("Test Passed!");
//	        } else {
//	            System.out.println("Test Failed");
//	        }
	        
	        driver.close();
		
	}

}
