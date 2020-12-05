/*  @@@@  Automate test case using webserver
 *       -> we user chropath insted of firebug it is no more available
 *       
 *       chorpath -- it is use for displ aying the html script and highlight the element
 *     erlyer  
 *       firebug--it is use for displ aying the html script and highlight the element
 *       Firepath--it generate xpath automatically
 *       Test case 1
 *       
 *       1)Open browser
 *       2) Open URL
 *       3)Enter user name
 *       4)Enter password
 *       5)click on ok.
 *       6)Check the page title.
 */
package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationBasic {

	public static void main(String[] args) {
		//first we need to think about which browser we will going to use
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.gecko.driver", "C:\\selenium-java-3.141.59\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		// now we need to create driver object
		WebDriver driver=new FirefoxDriver();         //@@@@ so here we open browser 
		// so if you want to open url in command then we need to used .get()

		driver.get("http://demo.guru99.com/test/newtours/");   //@@@@ here we open URL 
//		driver.manage().window().maximize();
		
         /* now if we want to enter user name or password then we need to know ---- Xpath
		<input type="text" name="userName" size="10" xpath="1">  this is Xpath of usernama
		                                 here in this perticular text
		   input is a "tag name"      "so in html every line has a tag"
		   type, size,name  is a "properties"
		   text , 10, "username" -- this all are "property value"   */
		 //so this is for Username "text box":<input type="text" name="userName" size="10" xpath="1">
	     //this is for password "text box": <input type="password" name="password" size="10" xpath="1">
		 // this is for submit "button" : <input type="submit" name="submit" value="Submit" style="background-color: #FACB00;border: 1px solid black;font-family:MS Sans Serif;font-size:15px;" xpath="1">
	       
		
		// first we need to identify the element 
		// we need to enter some value after identification is done.....for that we need to depends on above properties
		
		//-------------  Locator ---------
		/* name 
		 * id 
		 * css locator       ...so here we can only use one of them either name/id /css locator /or xpath
		 * xpath
		 */
		//now if we want to identify that element so there is a method called findelement and by using it property like name
	       
	       //now we need to put some value in text box by using "sendkey"
		   driver.findElement(By.name("userName")).sendKeys("mercury"); 
	       driver.findElement(By.name("password")).sendKeys("mercury");
	       driver.findElement(By.name("submit")).click();       //  .click()  user for buttons
	       
	       //no we need to validate something 
	       //so if we are comparing the title of the page then--- we need actural title and expected title ..then we can compair it
	       // if both are match test match if both fail test also fail
	       String expTitle="Login: Mercury Tours";
	       String actTitle=driver.getTitle();   //...this will return title of the page (and if we want to know title of the page we can print it)
	       
	       System.out.println(actTitle);
	       
	       if (expTitle.equals("actTitle")==true)
	       {
	    	   System.out.println("Test pass");
	       }
	       else
	       {
	    	   System.out.println("Test pass");
	       }
	       
	       
	       driver.close();  //this will close the browser
	       
	      // so methods we have learn here are
	    // findElement(By.name()).sendKeys():
		// findElement(By.name()).sendKeys():
	       
	       //.close() method to close the browser
	       //.manage().window().maximize();   '''to maximize window
	       
	       //Web eleements we have
	       /*text box/inputbox                    we used    .sendkey() method
	        * radio button 
	        * check button     radio/check/link   we used  .click()  method
	        * buttons
	        * links
	        * images 
	        * drop down
	        * list box 
	        * web table
	        * drag and drop
	        * calender control(date picker)
	        * 
	        * 
	        * 
	        */
	}

}
