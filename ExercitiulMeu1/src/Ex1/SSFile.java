package Ex1;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SSFile {
	 private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH_mm_ss");
  
   public static void main(String args[]) throws IOException {
	   
	   LocalDateTime now = LocalDateTime.now();
	   String cale=System.getProperty("user.home") + "\\Desktop\\"+dtf.format(now)+"search.xlsx";
	   File yourFile = new File(cale);
	   yourFile.createNewFile(); // if file already exists will do nothing 
	   FileOutputStream oFile = new FileOutputStream(yourFile, false); 
   
   }
}