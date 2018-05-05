package Logare;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;



public class scriereExcel extends procesareLista{
	 private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH_mm");
	 
	public static String scriere(List lista) throws IOException {

			   LocalDateTime now = LocalDateTime.now();
			   String cale=System.getProperty("user.home") + "\\Desktop\\"+"search"+dtf.format(now)+".txt";
			   File yourFile = new File(cale);
			   yourFile.createNewFile(); // if file already exists will do nothing 
			   FileOutputStream oFile = new FileOutputStream(yourFile, false); 
			   
			   List <String> ls =procesareLista.procesare(lista);	   
			   FileUtils.writeLines(new File(cale), ls);   
			   FileWriter writer = new FileWriter(System.getProperty("user.home") + "\\Desktop\\"+"texttt.txt"); 
			   BufferedWriter x = new BufferedWriter(writer);
			   for (String string : ls) {
				   System.out.println(string);
				   x.write(string+"\n");			
			   }
	   
			   
		/*	   
			  for(int i=0;i<s.length;i++) {
				 if(i==0) {
					 writer.write(s[i].toString()+"\n");
				 }else {
					 x.append(s[i].toString());
					 x.append(" ").write(" ");;
				//	 writer.append(s[i].toString());
				 }
			  }
			*/   
			 /*  for(Object str : s) {
				   System.out.println("1"+str +"\n\n\n\n");
				   writer.write(str.toString()+"\n");
				   //			     writer.write(str);
			   }*/
			   writer.close();
			   
//			   procesareLista proc= new procesareLista();
//			   proc.procesare(lista);
			   
			 /*  System.out.println("am ajuns aici");
			   String[][] array= new String[(ls.size()+1)/6+1][6];
				for(int i=0;i<lista.size();i++) {
					array[ls.size()/6][ls.size()%6]=ls.get(i).toString();
					System.out.println(array[ls.size()/6][ls.size()%6]=ls.get(i).toString()+"    "+i);
				}
				
				 try
				    {
					 
				        FileInputStream x = new FileInputStream("C:\\Users\\iulian.dumitru\\Desktop\\tabel.xlsx");

				        //Create Workbook instance holding reference to .xlsx file
				        Workbook workbook = new XSSFWorkbook(x);


				        //Get first/desired sheet from the workbook
				        Sheet sheet = workbook.getSheetAt(1);

				        //Iterate through each rows one by one
				        for (Iterator<Row> iterator = sheet.iterator(); iterator.hasNext();) {
				            Row row = (Row) iterator.next();
				            for (Iterator<Cell> iterator2 = row.iterator(); 
				            		iterator2.hasNext();) {
				                Cell cell = (Cell) iterator2.next();
				                System.out.println(cell.getStringCellValue());              
				            }               
				        }
//				        sterge ultimul row al tabelului
//				        sheet.removeRow(sheet.getRow(sheet.getLastRowNum()));  
				        int rowCount;
				        try {   rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

				          	//Get the first row from the sheet
				        }catch(Exception e){
				      	   rowCount=0;
				        }
				          Row row = sheet.getRow(0);

				          //Create a new row and append it at last of sheet
				          Row newRow = null;
						
						
						try {
							for(int i = 0; i < array.length; i++) {
								newRow = sheet.createRow(rowCount+1);
								Cell cell = newRow.createCell(i);
					              cell.setCellValue(array[i][i]);
							}
						}catch(Exception e) {
							
						}
				          //Create a loop over the cell of newly created Row

				    /*      String[] valueToWrite = {"Mr. E","Noida"};
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
				          //Close input stream
*/
				          

				          //Create an object of FileOutputStream class to create write data in excel file
/*
				          FileOutputStream outputStream = new FileOutputStream("C:\\Users\\iulian.dumitru\\Desktop\\tabel.xlsx");

				          //write data in the excel file

				          workbook.write(outputStream);

				          //close output stream

				          outputStream.close();
				        
				        x.close();
				        workbook.close();
				    }
				    catch (Exception e)
				    {
				        e.printStackTrace();
				    }
				   
				*/
			   oFile.close();
		return null;
		
	}
}


