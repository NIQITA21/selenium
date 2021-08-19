package qsp;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("//C:/Users/NIKITA/Desktop/Dropdown.html");
	  WebElement ele=driver.findElement(By.id("DOMINOS"));
	  Select s=new Select(ele);
	  s.selectByIndex(1);
	  Thread.sleep(1000);
	  s.selectByValue("4");
	  Thread.sleep(2000);
	  s.selectByVisibleText("capsicum pizza");
	  Thread.sleep(2000);
	  s.deselectAll();
}
}