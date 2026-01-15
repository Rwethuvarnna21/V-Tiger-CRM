package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getSingleCellDataFromExcelFile(String sheetName,int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException {
//		FileInputStream fis=new FileInputStream("/home/rwethu/Downloads/Animal.xlsx");
		FileInputStream fis=new FileInputStream(Ipathutility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Cell cell=wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex);
		DataFormatter df =new DataFormatter();
		String value = df.formatCellValue(cell);
		return value;
	}
	/**this is ageneric method to fetch multiple data from excel file
	 * 
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return 
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public List<String> getMultipleDataFromExcel(String sheetName,int startRowIndex,int startCellIndex) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream(Ipathutility.excelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	DataFormatter df =new DataFormatter();
	List<String>a1=new ArrayList<String>();
	for(int i=startRowIndex;i<=sh.getLastRowNum();i++) {
		Row r = sh.getRow(i);
	for(int j=startCellIndex;j<r.getLastCellNum();j++) {
		Cell c = r.getCell(j);
		String value=df.formatCellValue(c);
	a1.add(value);
		}
}
return a1;
	}
	
	/**
	 * 
	 * @param sheetname
	 * @param rowindex
	 * @param cellindex
	 * @param value
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
public 	String writeDatatoexcel(String sheetname,int rowindex,int cellindex,String value) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("/home/rwethu/Downloads/Animal.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetname);
	Row r = sh.createRow(rowindex);
	Cell cell = r.createCell(cellindex);
	cell.setCellValue(value);
	FileOutputStream fos=new FileOutputStream("/home/rwethu/Downloads/Animal.xlsx");
	wb.write(fos);
	return value;
}}