package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.EmployeeFormPage;

public class EmployeeFormTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		try {
			driver.get("http://localhost:5500/Employee.html");
			
			EmployeeFormPage formPage=new EmployeeFormPage(driver);
			
			formPage.enterEmpId("101");
			formPage.enterEmpName("Scott");
			formPage.enterDOB("2002-01-11");
			formPage.enterAddress("123 ABC");
			formPage.enterContactNo("5555555555");
			formPage.enterEmail("scott@gmail.com");
			formPage.clickSubmit();
			
			//Alert
		     // Trigger the alert
		        //driver.findElement(By.id("triggerAlert")).click();
		 
		        // Switch to alert
		        //Alert alert = driver.switchTo().alert();
		 
		        // Read alert text
		        //String alertMessage = alert.getText();
		        //System.out.println("Alert message: " + alertMessage);
		 
		        // Accept the alert
		        //alert.accept();
			
			Thread.sleep(3000);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
		}
		

	}
}
