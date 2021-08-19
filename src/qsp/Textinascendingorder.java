package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Textinascendingorder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NIKITA/Desktop/multipledropdown.html");
	  WebElement ele=driver.findElement(By.id("DOMINOS"));
	  Select s=new Select(ele);
	  List<WebElement> options=s.getOptions();
	  int count=options.size();
	  System.out.println(count);
	  ArrayList<String> l=new ArrayList<String>();
	  for(WebElement we:options)
	  {
		  String text=we.getText();
		  l.add(text);
	  }
	  Collections.sort(l);
	  for(String t:l)
	  {
		  System.out.println(t);
	  }
}
}