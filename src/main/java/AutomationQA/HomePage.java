package AutomationQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	 WebDriver driver;

		public void Home_Page(WebDriver  driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//input[@class=\\\"Pke_EE\\")
		WebElement search_box;
		
		@FindBy(xpath="//span[contains(text(),'Grocery')]")
		WebElement grocery;
		
		
		public void auto_suggest_option() 
		{
			search_box.sendKeys("mobile");	
		}
		
		public void Flipkart_grocery()
		{
			grocery.click();
		}
		

}
