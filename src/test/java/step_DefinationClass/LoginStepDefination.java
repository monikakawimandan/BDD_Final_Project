package step_DefinationClass;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;
import page.TestBasePage;

public class LoginStepDefination extends TestBasePage {
	LoginPage loginPage;
	

	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);

	}

	@Given("^User is on the TechFios login page$")
	public void user_is_on_the_TechFios_login_page() throws Throwable {
		driver.get("https://techfios.com/billing/?ng=admin/");

	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) throws Throwable {
		loginPage.enterUserName(username);
		Thread.sleep(3000);

	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
		loginPage.enterPassword(password);
		Thread.sleep(3000);
	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
		loginPage.clickSiginBitton();
		Thread.sleep(3000);

	}

	@Then("^User should land on Dashbpad page$")
	public void user_should_land_on_Dashbpad_page() throws Throwable {
		String actualTitle = loginPage.getPageTitle();
		String expectedTitle = "Dashboard- iBilling";

		Assert.assertEquals(expectedTitle, actualTitle);

		takeScreenShot(driver);

		Thread.sleep(3000);

	}

	@When("^User clicks on \"([^\"]*)\" button$")
	public void user_clicks_on_button(String button) throws Throwable {
		switch (button) {
		case "signin":
			loginPage.clickSiginBitton();
			Thread.sleep(3000);
		case "bankCash":
			break;
		default:
			break;

		}

	}

	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
