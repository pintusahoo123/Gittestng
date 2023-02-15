package jan7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Alternative_method_specificrowdata {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D:/sampleexcel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheetAt(0);
		// print no of rows in sheet
		int rows =ws.getLastRowNum();
		System.out.println("no of rows are"+rows);
		// read 1st cell any row data
		String fname = ws.getRow(3).getCell(0).getStringCellValue();
		// read 2nd cell  any row data
		String lname = ws.getRow(7).getCell(1).getStringCellValue();
		// read 3rd cell any row data
		int empid = (int) ws.getRow(8).getCell(2).getNumericCellValue();
		System.out.println(fname+"  "+lname+"   "+empid);
		fi.close();
		wb.close();
		

	}

}
