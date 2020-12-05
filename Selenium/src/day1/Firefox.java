package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Firefox {
	public static void main(String[]args)
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\selenium-java-3.141.59\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.CONTROL+"a").build().perform();
		

}
}