package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplebrowser {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
	}

}
