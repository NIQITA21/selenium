package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launchandenterurl {
public static void main(String[] args) {
	String key="webdriver.chrome.driver";
	String value="./Softwares/chromedriver.exe";
	System.setProperty(key, value);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
}
