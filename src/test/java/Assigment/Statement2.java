package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statement2 {

	static WebDriver driver;

	
	public static void main(String[] args) throws InterruptedException {
		// Verify that the "Request a Demo" button is present and active on each of the aforementioned top-level menu pages.
		
	
         System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selenium\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
		 
		driver.get("https://www.tendable.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// Find the top-level menu items and click on them to navigate to their pages
				 WebElement OurStory=driver.findElement(By.xpath("//*[text()='Our Story']"));
				 OurStory.click();	
				 Thread.sleep(2000);
				 verifyDemoButton(""+OurStory); 
				 
				 WebElement OurSolution=driver.findElement(By.xpath("//*[text()='Our Solution']"));
			     System.out.println("Our Story menu is accessible: " + OurSolution.isDisplayed());
			     Thread.sleep(2000);
			     OurSolution.click();	
				 Thread.sleep(2000);
				 verifyDemoButton(""+OurSolution);


			     WebElement WhyTendable=driver.findElement(By.xpath("//*[text()='Why Tendable?']"));
			     System.out.println("Our Solution menu is accessible: " + WhyTendable.isDisplayed());
			     Thread.sleep(2000);
			     WhyTendable.click();	
				 Thread.sleep(2000);
				 verifyDemoButton(""+WhyTendable);
			        
			      WebElement AboutUs=driver.findElement(By.xpath("//*[text()='About Us']"));
			      System.out.println("Why Tendable menu is accessible: " + AboutUs.isDisplayed());
			      Thread.sleep(2000);
			      AboutUs.click();	
				  Thread.sleep(2000);
				  
				  verifyDemoButton(""+AboutUs);
				  driver.close();   
			        
	}
			        private static void verifyDemoButton(String s) 
			        { 
			        	
			        	WebElement requestDemoButton=driver.findElement(By.xpath("//*[text()='Request a Demo']"));
			        	
			        	if (requestDemoButton.isDisplayed()) 
			        	{ 
			        		System.out.println("Request a Demo button is present and active."); 
			        	
			        	}
			        }
			        
	}
				 
				 
           
   
  

        
        	


