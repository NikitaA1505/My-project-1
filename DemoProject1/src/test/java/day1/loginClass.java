package day1;

//changes done

//pull command check
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//Approach 1;
	 //  System.setProperty("WebDriver.chrome.driver", "Path of exe file of chrome");
		
	//5	
	//	Approach 2 -using webdrivermanager class
		
	/*	WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();   //Chrome driver object */
		
	//Approach 3 - selenium version above 4.6.0 we need need to write above statment before chrome driver any browser object
		//WebDriver is interface 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.id("Password")).clear();
		
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		
		
		Thread.sleep(1000);
		
		driver.quit();
		
		
	}

}
