package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closechildbrowser {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		String parent_id=driver.getWindowHandle();
		Set<String> allwh=driver.getWindowHandles();
		int count=allwh.size();
		System.out.println(count);
		allwh.remove(parent_id);
		int count1=allwh.size();
		System.out.println(count1);
		for(String we:allwh)
		{
			driver.switchTo().window(we);
		
			driver.close();
		}
		
		
	}
}
