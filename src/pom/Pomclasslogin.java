package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclasslogin {
	@FindBy(xpath="//input[@name='email']")
	private WebElement untbox;
	@FindBy(xpath="//input[@name='pass']")
	private WebElement pwdtbox;
	@FindBy(xpath="//button[@value='1']")
	private WebElement loginbtn;
	
	public Pomclasslogin(WebDriver driver)//constructor
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setusername(String un)
	{
		untbox.sendKeys(un);
	}
	public void setpwd(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
    public void clicklogin()
    {
    	loginbtn.click();
    }
}

