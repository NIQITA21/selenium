package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginusingPOM extends Genericscript {
	@Test
	public void Login() throws InterruptedException
	{
		WebElement ele=driver.findElement(By.xpath("//span[.='Login']"));
		ele.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		ele.click();
	}
}
