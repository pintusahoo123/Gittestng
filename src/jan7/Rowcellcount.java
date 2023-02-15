package jan7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Rowcellcount {

	public static void main(String[] args) throws Throwable {
		// read the path of excel
		FileInputStream fi = new FileInputStream("D:/sampleexcel.xlsx");
		// get workbook from file
		XSSFWorkbook  wb = new XSSFWorkbook(fi);
		// get shhet from workbook
		XSSFSheet ws = wb.getSheet("empdata");
		// get first row from sheet
		XSSFRow row = ws.getRow(0);
		// count no of rows in a sheet
		int rowcount = ws.getLastRowNum();
		// get nof of cells in 1st row
		int cellcount = row.getLastCellNum();
		System.out.println("no of rows in sheet : :"+rowcount+"   "+"no of cell in first row : :"+cellcount);
		fi.close();
		wb.close();

	}

}
