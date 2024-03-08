package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statement1 {

	public static void main(String[] args) throws InterruptedException {
		// Confirm accessibility of the top-level menus: Home, Our Story, Our Solution, and Why Tendable.
		
	
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tendable.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
        WebElement OurStory=driver.findElement(By.xpath("//*[text()='Our Story']"));
        System.out.println("Home menu is accessible: " + OurStory.isDisplayed());
        
        WebElement OurSolution=driver.findElement(By.xpath("//*[text()='Our Solution']"));
        System.out.println("Our Story menu is accessible: " + OurSolution.isDisplayed());


        WebElement WhyTendable=driver.findElement(By.xpath("//*[text()='Why Tendable?']"));
        System.out.println("Our Solution menu is accessible: " + WhyTendable.isDisplayed());
        
        WebElement AboutUs=driver.findElement(By.xpath("//*[text()='About Us']"));
        System.out.println("Why Tendable menu is accessible: " + AboutUs.isDisplayed());
        
        Thread.sleep(2000);
        driver.close();
        

	}

}
