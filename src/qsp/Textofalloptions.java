package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Textofalloptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NIKITA/Desktop/multipledropdown.html");
	  WebElement ele=driver.findElement(By.id("DOMINOS"));
	  Select s=new Select(ele);
	  List<WebElement> text=s.getOptions();
	 int count = text.size();
	 System.out.println(count);
	 for(WebElement we:text)
	 {
		 String texts=we.getText();
		 System.out.println(texts);
	 }
	}
}
