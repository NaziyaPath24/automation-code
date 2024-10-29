package StepDefinition;

import org.openqa.selenium.WebDriver;

import com.qa.Pages.Company_RegistrationPage;
import com.qa.factory.Driver_Factory;

import App_Hooks.Application_Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Company_RegistrationSteps {
	
	WebDriver driver;
	 Application_Hooks hook=new  Application_Hooks();
	private Company_RegistrationPage page=new Company_RegistrationPage(Driver_Factory.getDriver());
	@Given("User is on application login page")
	public void user_is_on_application_login_page() {
		
		Driver_Factory.getDriver().get("https://122.175.43.71:2801/");
	}

	@When("User provides Username{string} and password{string}")
	public void user_provides_username_admin_pathbreaker_com_and_password_passw0rd(String username,String password) {
		page.user_enter_username(username);
		page.user_enter_password(password);
		
	}

	@When("Hamburger button is working proerly or not")
	public void hamburger_button_is_working_proerly_or_not() {
		page.click_on_hamburger();
	}

	//@Then("User can verify the logo should be dipslayed or not after logging the application")
	//public void user_can_verify_the_logo_should_be_dipslayed_or_not_after_logging_the_application() {
		//page.logo_displayed();
	//}

	@Then("user click on employer tab")
	public void user_click_on_employer_tab() {
		page.employertab();
	}

	@Then("user selects registration option")
	public void user_selects_registration_option() {
		page.registrationtab();
	}

	@Then("user selects company type as {string}")
	public void user_selects_company_type_as(String string) {
		page.companytype();
	}

	@When("user enters valid details as Novartis and nov and naziya@gmail.com and Path@{int} and {int} and {int} and Hyderabad, hayathnagar {int}-{int} and L01631KA2010PTC087678 and 22AAQQA0000A1Z1 and BHNBN9098M and minnu and minnu@gmail.com and {int} and miryalaguda, ashoknagar {int}-{int}")
	public void user_enters_valid_details_as_novartis_and_nov_and_naziya_gmail_com_and_path_and_and_and_hyderabad_hayathnagar_and_l01631ka2010ptc087678_and_22aaqqa0000a1z1_and_bhnbn9098m_and_minnu_and_minnu_gmail_com_and_and_miryalaguda_ashoknagar(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6, Integer int7, Integer int8) {
	
		page.companyName();
		page.serviceName();
		page.CompanyEmailId();
		page.Password();
		page.ContactNumber();
		page.AlternateNumber();
		page.CompanyCINNumber();
		page.gstNumber();
		page.PANnumber();
		page.authorisedName();
		page.PersonalEmailId();
		page.PersonalMblNumber();
		page.authorisedAddress();
		
	}
	@When("user click on submit button")
	public void user_click_on_submit_button() {
	page.submitbutton();

}
}
