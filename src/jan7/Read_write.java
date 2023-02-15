package jan7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_write {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D:/sampleexcel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheetAt(0);
		int rows  = ws.getLastRowNum();
		System.out.println("no of rows are"+rows);
		// i want all row data in all colomn
		for (int i=1; i<=rows; i++)
		{
			String fname = ws.getRow(i).getCell(0).getStringCellValue();
			String lname = ws.getRow(i).getCell(1).getStringCellValue();
			int empid = (int) ws.getRow(i).getCell(2).getNumericCellValue();
			System.out.println(fname+"       "+lname+"        "+empid);
			// write some text into results cell
			ws.getRow(i).createCell(3).setCellValue("pass");
		}
		fi.close();
		// for results value
		FileOutputStream fo = new FileOutputStream("D:/resultsexcel.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
	}

}
