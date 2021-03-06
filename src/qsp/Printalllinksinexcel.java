package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printalllinksinexcel {
	public static void main(String[] args) throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {
		FileInputStream fis=new FileInputStream("C:\\Users\\NIKITA\\OneDrive\\Documents\\exc1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("sheet1");
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(int i=0;i<links.size();i++)
		{
			Row r= s.createRow(i);
			Cell c=r.createCell(0);
			c.setCellValue(links.get(i).getAttribute("href"));
			
		}
		FileOutputStream fout=new FileOutputStream("C:\\Users\\NIKITA\\OneDrive\\Documents\\exc1.xlsx");
		wb.write(fout);
		
		
	}

}
