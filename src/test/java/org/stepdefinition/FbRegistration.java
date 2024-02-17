package org.stepdefinition;
import io.cucumber.datatable.*;

import java.util.List;

import org.nija.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbRegistration extends BaseClass {
	
	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
		launchBrowser();
	    WindowMaximize();
	    }

	@When("To launch the Fb application")
	public void to_launch_the_Fb_application() {
		launchUrl("https://www.facebook.com/");
	    }
	

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() throws InterruptedException {
		Thread.sleep(3000);
		 WebElement account = driver.findElement(By.xpath("//a[text()='Create new account']"));
		 clickBtn(account);
		
	    }

	@When("To pass the first name in first name text box")
	public void to_pass_the_first_name_in_first_name_text_box(DataTable d) throws InterruptedException {
		 Thread.sleep(3000);
		 List<String> l = d.asList();
		 WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		 firstname.sendKeys(l.get(2), "nijanthan");
		
	    }

	@When("To pass the Second name in Second name text box")
	public void to_pass_the_Second_name_in_Second_name_text_box() {
		 WebElement secondname = driver.findElement(By.name("lastname"));
		 secondname.sendKeys("deveeikan");
		
		
	    }

	@When("To pass the mobileno or email in email text box")
	public void to_pass_the_mobileno_or_email_in_email_text_box(DataTable d) {
		List<List<String>> l = d.asLists();
		WebElement email = driver.findElement(By.name("reg_email__"));
		 email.sendKeys(l.get(1).get(1), "nijanthan.deveeikan06@gmail.com");
				
	    }

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
		 WebElement pass = driver.findElement(By.name("reg_passwd__"));
		 pass.sendKeys("nijanthan.deveeikan06@gmail.com");
		
	   }

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
//		closeEntireBrowser();
	   }

}
