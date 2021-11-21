package org.pac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\pavitharan\\eclipse-workspace\\JAVASelinium\\BasicUrl\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); 
		
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("pavishpavi");
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("1234565");
		
		WebElement para = driver.findElement(By.xpath("//h2[contains(text(),'connect')]"));
		String text = para.getText();
		System.out.println(text);
		
		
		
		
		
	}

}
