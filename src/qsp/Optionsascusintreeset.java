package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Optionsascusintreeset {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NIKITA/Desktop/multipledropdown.html");
	  WebElement ele=driver.findElement(By.id("DOMINOS"));
	  Select s=new Select(ele);
	  List<WebElement> options=s.getOptions();
	  int count=options.size();
	  TreeSet<String> t= new TreeSet<String>();
	  for(WebElement we:options)
	  {
		  String text=we.getText();
		  t.add(text);
	  }
	  for(String t1:t)
	  {
		  System.out.println(t1);
	  }
}
}
