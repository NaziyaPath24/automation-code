package com.qa.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Company_RegistrationPage {
	
	private WebDriver driver;
    private WebDriverWait wait;
    public Company_RegistrationPage(WebDriver driver) {
    	this.driver=driver;
    	this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    	 PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//button[text()='EMS Login']")
    WebElement click_on_emslogin_btn;
    @FindBy(name="username")
    WebElement Enter_usrname;
    @FindBy(name="password")
    WebElement Enter_pwd;
    @FindBy(xpath="//button[text()='Sign in']")
    WebElement click_on_signin_btn;
    @FindBy(xpath="//a[@class='sidebar-toggle js-sidebar-toggle']")WebElement click_hamburger;
  //  @FindBy (xpath="//img[@class='align-middle']")WebElement logo;
    @FindBy(xpath = "//span[text()='Employer']")WebElement click_employertab;
    @FindBy(xpath="//a[text()='Registration']")WebElement click_rgstnOptn;
    @FindBy(xpath="//input[@value='Private Limited']")WebElement select_cmpnytype;
    @FindBy(xpath="//input[@placeholder='Enter Company Name']")WebElement enter_cmpnyname;
    @FindBy(xpath="//input[@placeholder='Enter Service Name']")WebElement enter_srvcname;
    @FindBy(xpath="//input[@placeholder='Enter Company Email Id']")WebElement enter_cmpnyemlid;
    @FindBy(xpath="//input[@placeholder='Enter Password']")WebElement enter_password;
    @FindBy(xpath="//input[@placeholder='Enter Contact Number']")WebElement enter_cntctnmbr;
    @FindBy(xpath="//input[@placeholder='Enter Alternate Number']")WebElement enter_altntnmbr;
    @FindBy(xpath="//textarea[@placeholder='Enter Company Address']")WebElement enter_cmpnyaddrs;
    @FindBy(xpath="//input[@placeholder='Enter Company CIN Number']")WebElement enter_cmpnycinnmbr;
    @FindBy(xpath="//input[@placeholder='Enter Company GST Number']")WebElement enter_cmpnygstnmbr;
    @FindBy(xpath="//input[@placeholder='Enter Company PAN Number']")WebElement enter_cmpnypanmbr;
    @FindBy(xpath="//input[@placeholder='Enter Name']")WebElement enter_authrsdname;
    @FindBy(xpath="//input[@placeholder='Enter Personal Email Id']")WebElement enter_prsnlemlid;
    @FindBy(xpath="//input[@placeholder='Enter Personal Mobile Number']")WebElement enter_prsnlmblnmbr;
    @FindBy(xpath="//textarea[@placeholder='Enter Address']")WebElement enter_authrsdaddress;
    @FindBy(xpath="//button[text()='Submit']")WebElement click_sbmtbtn;
    
    
    
    public void click_on_ems() {
   	 driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
   	 click_on_emslogin_btn.click();
    }
    public void user_enter_username(String uname) {
   	 Enter_usrname.sendKeys(uname);
    }
    public void user_enter_password(String pwd) {
   	 Enter_pwd.sendKeys(pwd);
    }
    public void click_on_signin() {
   	 click_on_signin_btn.click();
    }
    public void click_on_hamburger() {
   	 wait.until(ExpectedConditions.visibilityOf(click_hamburger)).click();
    }
  //  public void logo_displayed()  {
    //	driver.navigate().refresh();
   	
   	// System.out.println(logo.isDisplayed());
   	 
 //   }
    public void employertab() {
    	click_employertab.click();
    	
    }
    public void registrationtab() {
    	click_rgstnOptn.click();
    }
    public void companytype() {
    	enter_cmpnyname.sendKeys("Private Limited");
    }
    public void companyName() {
    	enter_cmpnyname.sendKeys("Milton");
    }
    public void serviceName() {
    	enter_srvcname.sendKeys("mil");
    }
    public void CompanyEmailId() {
    	enter_cmpnyemlid.sendKeys("milton@gmail.com");
    }
    public void Password() {
    	enter_password.sendKeys("Path@2024");
    }
    public void ContactNumber() {
    	enter_cntctnmbr.sendKeys("6545654321");
    }
    public void AlternateNumber() {
    	enter_altntnmbr.sendKeys("9823145672");
    }
    public void CompanyAddress() {
    	enter_cmpnyaddrs.sendKeys("Hyderabad, Chilkur 89-987");
    }
    public void CompanyCINNumber() {
    	enter_cmpnycinnmbr.sendKeys("L17110MH1973PLC123543");
    }
    public void gstNumber() {
    	enter_cmpnygstnmbr.sendKeys("22AAALL0000A1Z7");
    }
    public void PANnumber() {
    	enter_cmpnypanmbr.sendKeys("RFTRE9878U");
    }
    public void authorisedName() {
    	enter_authrsdname.sendKeys("Tannu");
    }
    public void PersonalEmailId() {
    	enter_prsnlemlid.sendKeys("tannu@gmail.com");
    }
    public void PersonalMblNumber() {
    	enter_prsnlmblnmbr.sendKeys("8765676545");
    }
    public void authorisedAddress() {
    	enter_authrsdaddress.sendKeys("Hyderabad, kondapur 89-364");
    }
    public void submitbutton() {
    	click_sbmtbtn.click();
    }
    
    
	
}



