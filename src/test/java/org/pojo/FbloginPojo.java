package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbloginPojo{
	

    private static final WebElement email = null;


	//2. private web elements
    //WebElement email = driver.findElement(By.id("email"));
	
	private WebElement varRef;
	
	
	@FindAll ({
	@FindBy(xpath = "//input[@id='email']"),
	@FindBy(xpath ="//input[@name='email']"),
	@FindBy(xpath = "//input[@data-testid='royal_email']']")
})
	
	
	@FindBy(xpath = "//input[@aria-label ='Password']" )
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement loginBtn;


	
	
	// 3. Getters to access webelements outside the class
	
	public WebElement getVarRef() {
		return varRef;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement email() {
		return email;
	}


	}




	


