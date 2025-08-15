package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeFormPage {

	WebDriver driver;
	
	//constuctor
	public EmployeeFormPage(WebDriver driver){
		this.driver=driver;
	}
	//Locators
	By empIdField=By.id("Empid");
	By empNameField=By.id("Empname");
	By dobField=By.id("Dob");
	By addressField=By.id("address");
	By contactNoField=By.id("contactno");
	By emailField=By.id("email");
	By submitButton=By.cssSelector("input[type='submit']");
	//By messageText=By.id("message");
	
	public void enterEmpId(String Empid) {
		driver.findElement(empIdField).sendKeys(Empid);
	}
	public void enterEmpName(String Empname) {
		driver.findElement(empNameField).sendKeys(Empname);
	}
	public void enterDOB(String Dob) {
		driver.findElement(dobField).sendKeys(Dob);
	}
	public void enterAddress(String address) {
		driver.findElement(addressField).sendKeys(address);
	}
	public void enterContactNo(String contactno) {
		driver.findElement(contactNoField).sendKeys(contactno);
	}
	public void enterEmail(String email) {
		driver.findElement(emailField).sendKeys(email);
	}
	public void clickSubmit() {
		driver.findElement(submitButton).click();
	}
	
	
}
