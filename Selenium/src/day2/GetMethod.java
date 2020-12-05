package day2;
/* WebDriver Commands
 * 
 * ..............
 * (Get() command)
 * get()   ---use for open the usrl in the browser
 * getTitle() ---- return the title of the pages
 * getCurrentUrl()  ---return the usl of the cureent page
 * getText()   ----return the text value of an element
 * 
 * (Browser Command)
 * close()
 * quit()
 * 
 * (Navigation commands)
 * navigate().forward()
 * navigate().back()
 * navigate().to()
 * navigate()refresh()
 * 
 * Conditional Commands
 * isDisplayed()
 * isEnable()
 * isSelected()
 * 
 * Wait Commands
 * Implicitwait
 * Explicitwait
 * 
 * Switch Commands
 * switchTo().frame()
 * switchTo().alert()
 * switchTo().defaultContent()
 * switchTo().Window()
 * Drive.WIndowHandles()
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethod {

	public static void main(String[] args) {
		// Get cammand
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\selenium-java-3.141.59\\\\geckodriver-v0.27.0-win64\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/newtours/");   //open the url in browser
		System.out.println(driver.getTitle());    // return the title of the page
		System.out.println(driver.getCurrentUrl());  //return url of the page
		//getText  -- to get the perticular text is present or not

		String a=driver.findElement(By.xpath("//tr[@align='right']//td[@colspan='2']//font[@size='2']")).getText();
		System.out.println(a);
		
		driver.close();  //close the browser 
		driver.quit();  // it close the all the multiple browser which are open at time of automation
	}

}
