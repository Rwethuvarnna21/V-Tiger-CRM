package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class Fetchdatafromexcelfile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("/home/rwethu/Downloads/Untitled spreadsheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		/*if we want to change the sheet name change argument inside sheet
		 * 
		 */
//		Sheet sh = wb.getSheet("Animal");
//		Row r = sh.getRow(0);
//		Cell cell = r.getCell(0);
//		String value = cell.getStringCellValue();
//		double value = cell.getNumericCellValue();
//		DataFormatter df =new DataFormatter();
//		String value = df.formatCellValue(cell);
//		System.out.println(value);
		ExcelUtility util=new ExcelUtility();
		String value = util.getSingleCellDataFromExcelFile("Animal", 0, 0);
		System.out.println(value);

	}

}
