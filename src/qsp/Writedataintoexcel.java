package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.interactions.Actions;

public class Writedataintoexcel {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\NIKITA\\OneDrive\\Documents\\exc1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("sheet1");
		Row r= s.createRow(2);
		Cell c=r.createCell(3);
		c.setCellValue("selenium");
		FileOutputStream fout=new FileOutputStream("C:\\Users\\NIKITA\\OneDrive\\Documents\\exc1.xlsx");
		wb.write(fout);
	
	}

}
