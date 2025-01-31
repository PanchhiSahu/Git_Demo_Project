package AutomationQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_Login {
	
	WebDriver driver;

	
	public Flipkart_Login() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void Login_Steps ()throws InterruptedException {
		// TODO Auto-generated method stub
	
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.flipkart.com/");
	 driver.manage().window().maximize();
	 
	 Thread.sleep(2000);
	 
	 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	 
	 WebElement login_btn=  driver.findElement(By.xpath("//span[text()='Login']"));
	 
	 login_btn.click();
	 
	 WebElement email= driver.findElement(By.xpath("//label[@class='Gq-80a']"));
	 email.sendKeys("8285925431");
	 


	}

}
