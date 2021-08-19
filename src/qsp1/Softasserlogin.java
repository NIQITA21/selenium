package qsp1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softasserlogin extends Genericscript {
@Test
public void ValidLogin() throws InterruptedException
{
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nickytricky96@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9413705670");
	driver.findElement(By.xpath("//button[@value='1']")).click();
	Thread.sleep(2000);
	String  actualtitle=driver.getTitle();
	System.out.println(actualtitle);
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(actualtitle,"Facebook");
	System.out.println("nikita");
	sa.assertAll();
}
}