package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
    //@FindBy(how = How.CSS, using = "#username")
	WebElement USENAME_ELEMENT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	// @FindBy(how = How.CSS, using = "#password")
	WebElement PASSWORD_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	// @FindBy(how = How.CSS, using = "button[name='login']")
	WebElement SIGNIN_BUTTON;
	
	//Methods To Interact with the WebElements
	
	public void enterUserName(String userName) {
		USENAME_ELEMENT.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
		
	}
	
	public void clickSiginBitton() {
		SIGNIN_BUTTON.click();
		
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	
	
}


