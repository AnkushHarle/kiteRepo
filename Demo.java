package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo {
	

		@FindBy(xpath="(//input[@type='text'])[2]")private WebElement uName;
		
	   
		Demo(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
			
		
		public void fName() {
			uName.sendKeys("Tester");
		}
	

}
