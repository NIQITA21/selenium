package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetchnumbersfromexcel {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\NIKITA\\OneDrive\\Documents\\exc1.xlsx");
	Workbook wh=WorkbookFactory.create(fis);
	Sheet s=wh.getSheet("sheet1");
	Row r=s.getRow(1);
	Cell c=r.getCell(1);
	String v=c.toString();
	System.out.println(v);
}
}
