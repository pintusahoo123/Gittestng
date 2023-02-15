package jan9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Formatcell {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D:/sampleexcel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheetAt(0);
		int rows = ws.getLastRowNum();
		System.out.println("no of rows are ::"+rows);
		for (int i=1; i<=rows; i++)
		{
	
	    	ws.getRow(i).createCell(3).setCellValue("pass");
	    	//ws.getRow(i).createCell(3).setCellValue("fail");
		    XSSFCellStyle style = wb.createCellStyle();           //cellstyle class is used for styling the cell
		    XSSFFont font = wb.createFont();                      // fontclass is holding all font methods
		    //font.setColor(IndexedColors.RED.getIndex());
		    font.setColor(IndexedColors.GREEN.getIndex());
		    font.setBold(true);                                   // set bolt is used for bolting the text
		    font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
		    style.setFont(font);
		    // write where you want to do all font methods
		    ws.getRow(i).getCell(3).setCellStyle(style);
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D:/resultsexcel.xlsx");
		wb.write(fo);
		fo.close();
		

	}

}
// setcolor is used for accesing colors in text
// indexcolors is holding all colors 
