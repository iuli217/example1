package Ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop= new Properties();
	    FileInputStream filess = new FileInputStream("C:\\Users\\iulian.dumitru\\eclipse-workspace\\ExercitiulMeu1\\datadriveLog.properties");
	    prop.load(filess);
	    
	   try {
		   FileInputStream excel= new FileInputStream(prop.getProperty("excel"));
	    Workbook workbook = new XSSFWorkbook(excel);

        //Get first/desired sheet from the workbook
        Sheet sheet = workbook.getSheet("Sheet4");

        //Iterate through each rows one by one
        for (Iterator<Row> iterator = sheet.iterator(); iterator.hasNext();) {
            Row row = (Row) iterator.next();
            for (Iterator<Cell> iterator2 = row.iterator(); iterator2
                    .hasNext();) {
                Cell cell = (Cell) iterator2.next();
                System.out.println(cell.getStringCellValue());              
            }               
        }
        //sterge ultimul row al tabelului
        sheet.removeRow(sheet.getRow(sheet.getLastRowNum()));  
        
        int rowCount;
        try {   rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

          	//Get the first row from the sheet
        }catch(Exception e){
      	   rowCount=0;
        }
          Row row = sheet.getRow(0);

          //Create a new row and append it at last of sheet

          Row newRow = sheet.createRow(rowCount+1);

          //Create a loop over the cell of newly created Row

          String[] valueToWrite = {"Mr. E","Noida","Dani"};
          
          //String[][] valueToWrite = {{"Mr. E","Noida"},{"Mr. E","Noida"}};
          
          try{
        	  for(int j = 0; j < row.getLastCellNum(); j++){

              //Fill data in row

              Cell cell = newRow.createCell(j);

              cell.setCellValue(valueToWrite[j]);

          }
          }catch(Exception e) {
          	for(int j = 0; j < valueToWrite.length; j++){

                  //Fill data in row

                  Cell cell = newRow.createCell(j);
                  
                  cell.setCellValue(valueToWrite[j]);

              }
          }
          //Create an object of FileOutputStream class to create write data in excel file

          FileOutputStream outputStream = new FileOutputStream(prop.getProperty("excel"));

          //write data in the excel file

          workbook.write(outputStream);

          //close output stream

          outputStream.close();
        
        excel.close();
        workbook.close();
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
   }

	}

