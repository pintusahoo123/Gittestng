package jan7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Specific_rowdata {

	public static void main(String[] args) throws Throwable {
		FileInputStream  fi= new FileInputStream("D:/sampleexcel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws =wb.getSheetAt(0);
		XSSFRow row = ws.getRow(2);
		// get each cell
		XSSFCell  cell1 = row.getCell(0);
		XSSFCell  cell2 = row.getCell(1);
		XSSFCell  cell3 = row.getCell(2);
		String   fname = cell1.getStringCellValue();
		String   lname = cell2.getStringCellValue();
		int      empid = (int) cell3.getNumericCellValue();
		System.out.println(fname+"  "+lname+"   "+empid);
		fi.close();
		wb.close();


	}

}
//it prints all data of 2nd row

