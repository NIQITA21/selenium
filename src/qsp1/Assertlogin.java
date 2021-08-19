package qsp1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertlogin extends Genericscript {
	@Test
	public void ValidLogin() throws InterruptedException
		{
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nickytricky96@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9413705670");
			driver.findElement(By.xpath("//button[@value='1']")).click();
			Thread.sleep(2000);
			String  actualtitle=driver.getTitle();
			System.out.println(actualtitle);
			String expectedresult="Facebook";
			Assert.assertEquals(actualtitle, expectedresult);
			System.out.println("nikita");
			Assert.assertTrue(actualtitle.contains("Facebook"));
			System.out.println("tewari");
		  
		}
}
