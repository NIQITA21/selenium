package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readmultipledatafromexcel {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\NIKITA\\OneDrive\\Documents\\exc1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("sheet1");
		int rowcount=s.getLastRowNum()-s.getFirstRowNum();
		for(int i=0;i<rowcount+1;i++)
		{
			Row r=s.getRow(i);
			for(int j=0;j<r.getLastCellNum();j++)
			{
				System.out.print(r.getCell(j).getStringCellValue()+"||");
			}
			System.out.println();
		}
	}

}
