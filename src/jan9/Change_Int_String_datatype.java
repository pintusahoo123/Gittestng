package jan9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Change_Int_String_datatype {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D:/sampleexcel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("empdata");
		int rows = ws.getLastRowNum();
		System.out.println("no of rows are"+rows);
		for (int i=1; i<=rows; i++)
		{
			if(wb.getSheet("empdata").getRow(i).getCell(2).getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				int celldata = (int) wb.getSheet("empdata").getRow(i).getCell(2).getNumericCellValue();
				String empid = String.valueOf(celldata);   // here valueof is used converting string type value to interger  type
				System.out.println(empid);
			}
		}

	}

}
