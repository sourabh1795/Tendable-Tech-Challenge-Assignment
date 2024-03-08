package Assigment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Statement3 {

	public static void main(String[] args) throws InterruptedException {
		// Navigate to the "Contact Us" section, choose "Marketing", and complete the form—
		//excluding the "Message" field. On submission, an error should arise. Ensure your script
		//confirms the error message's appearance. If the error is displayed, mark the test as PASS. If
		//absent, it's a FAIL.
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tendable.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
        WebElement ContactUS=driver.findElement(By.xpath("//*[text()='Contact Us']"));
        ContactUS.click();
        
        WebElement Marketing=driver.findElement(By.xpath("//*[@data-target='.toggle-163701']"));
        Marketing.click();	
         
         WebElement FullName=driver.findElement(By.xpath("//*[@id=\"form-input-fullName\"]"));
         FullName.sendKeys("Sourabh Shinde");
         
         WebElement id=driver.findElement(By.xpath("//*[@id=\"form-input-organisationName\"]"));
         id.sendKeys("121548");
         
         WebElement PhoneNo=driver.findElement(By.xpath("//*[@id=\"form-input-cellPhone\"]"));
         PhoneNo.sendKeys("8585546254");
         
         WebElement Email=driver.findElement(By.xpath("//*[@id=\"form-input-email\"]"));
         Email.sendKeys("4455gddjs@gmail.com");
         
         Select se =new Select(driver.findElement(By.xpath("//*[@name='jobRole']")));
         se.selectByValue("Management");
         
         WebElement Agree=driver.findElement(By.xpath("//*[@id=\"form-input-consentAgreed-0\"]"));
         Agree.click();
         Thread.sleep(2000);
         
         
         WebElement Submit=driver.findElement(By.xpath("//*[@type='submit']"));
         Submit.click();
         Thread.sleep(2000);
       
        WebElement messageErrorMessage = driver.findElement(By.xpath("//div[@class='ff-form-errors']/p")); 
        Assert.assertTrue(messageErrorMessage.isDisplayed(), "Sorry, there was an error submitting the form. Please try again.Please verify that you are not a robot.");
       
       
       
      
         
         
	}

}
