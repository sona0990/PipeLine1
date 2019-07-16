package demo1;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addressbook {
	
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Divya\\Downloads\\Eclipse\\Eclipse\\Jars\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("http://localhost:8090/addressbook/");
			driver.findElement(By.xpath("//div[@class = 'v-button v-widget']")).click();
			driver.findElement(By.id("gwt-uid-5")).sendKeys("Ravi");
			driver.findElement(By.id("gwt-uid-7")).sendKeys("Training");
			driver.findElement(By.id("gwt-uid-9")).sendKeys("805983095");
			driver.findElement(By.id("gwt-uid-11")).sendKeys("eduraka.training@gmail.com");
			driver.findElement(By.xpath("//div[@class = 'v-button v-widget primary v-button-primary']")).click();
			
			
			
	
	}



}
