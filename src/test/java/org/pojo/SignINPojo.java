package org.pojo;

import org.nija.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignINPojo extends BaseClass {
//parametrized constructor using (we are using page factory consumation in class reefrence excption error show agakudahtunu)
  public SignINPojo() {
	  PageFactory.initElements(driver, this);
  }
 
  
  
  @FindBy(xpath="//a[text()='Create new account']")
  private WebElement createNewAcc;
  
  @FindBy (xpath = "(//input[@type='text'])[2]")
  private WebElement firstNameTxtBox;
  
  @FindBy (name = "lastname")
  private WebElement secondNameTxtBox;
 
  @FindBy(name = "reg_email__")
  private WebElement MobileorEmailTxtBox;
  @FindBy(name ="reg_passwd__")
  private WebElement newPassword;
  
public WebElement getCreateNewAcc() {
	return createNewAcc;
}
public WebElement getFirstNameTxtBox() {
	return firstNameTxtBox;
}
public WebElement getSecondNameTxtBox() {
	return secondNameTxtBox;
}
public WebElement getMobileorEmailTxtBox() {
	return MobileorEmailTxtBox;
}
public WebElement getNewPassword() {
	return newPassword;
}
	
}
