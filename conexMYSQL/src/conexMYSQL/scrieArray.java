package conexMYSQL;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class scrieArray {
	public static void citire(String[][] value) {

		try {
			String file="tabel.xlsx";
	        FileInputStream x = new FileInputStream("C:\\Users\\iulian.dumitru\\Desktop\\"+file);
			 Workbook workbook = new XSSFWorkbook(x);
			 Sheet sheet = workbook.getSheet("Sheet4");
			 int z = sheet.getLastRowNum()-sheet.getFirstRowNum();
//			 int z=0;
			 for (String[] items : value) {
				 int a=0;
				 Row newRow = sheet.createRow(z);
				 for (String item : items) {
					 
					 Cell cell = newRow.createCell(a);
//					 System.out.println(item+"trecem pe aici");
	                  cell.setCellValue(item);
					a++;
				}
				 z++;		
			}
			 
			 FileOutputStream outputStream = new FileOutputStream("C:\\Users\\iulian.dumitru\\Desktop\\"+file);

	          //write data in the excel file
	          workbook.write(outputStream);

	          //close output stream
	          outputStream.close();
	        
	        x.close();
	        workbook.close();
			 
		}catch(Exception ee) {
			ee.printStackTrace();
		}
		
	}

}

