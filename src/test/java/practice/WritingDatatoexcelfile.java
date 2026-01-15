package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class WritingDatatoexcelfile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		FileInputStream fis=new FileInputStream("/home/rwethu/Downloads/Untitled spreadsheet.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Animal");
//		Row r = sh.createRow(2);
//		Cell cell = r.createCell(0);
//		cell.setCellValue("Monkey");
//		FileOutputStream fos=new FileOutputStream("/home/rwethu/Downloads/Untitled spreadsheet.xlsx");
//		wb.write(fos);
		
ExcelUtility util=new ExcelUtility();
 String value=util.writeDatatoexcel("Animal", 1, 2, "girafee");
// String value1=util.writeDatatoexcel("Animal", 0, 1, "kangaroo");

 System.out.println(value);
 
 
	}}


