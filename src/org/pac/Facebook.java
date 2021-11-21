package org.pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\pavitharan\\eclipse-workspace\\JAVASelinium\\BasicUrl\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();         //maximise
		                                            //get()
		String url = driver.getCurrentUrl();        //getcurrenturl()
	   System.out.println(url);                     //gettitle() 
		
	   String tit = driver.getTitle();				//close()
	   System.out.println(tit);                     //quit()
	   
	  // driver.close();
	   
	   driver.quit();
		
		
		
		
		
			
	}

}
