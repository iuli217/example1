package conexMYSQL;

import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.x500.X500Principal;

import org.omg.CORBA.Environment;

public class connect {


//	public static File filex;	
//	public static FileWriter writerx;
//	
////	public static void main(String[] args) throws ClassNotFoundException, IOException {
//		
//		filex = new File("C:\\Users\\iulian.dumitru\\Desktop\\selenium\\text.txt");
//		writerx = new FileWriter(filex);
//		
//		Class.forName("com.mysql.jdbc.Driver");
//		String connectionUrl = "jdbc:postgresql://192.168.10.XXX;databaseName=postgres;user=postgres;password=XXXXX"; 
//		String con1="jdbc:mysql://192.168.100.XX/Heramus?user=root&password=XXXXX";
//		  Connection con = null;  
//		  Statement stmt = null;  
//	      ResultSet rs = null;  
//	      List<String> lista= new ArrayList<String>();
//	      try {
//  //			con = DriverManager.getConnection("jdbc:postgresql://192.168.10.202/postgres","postgres","evmanager_prod");
//	    	  con = DriverManager.getConnection(con1);
//	    	  
//	    	  String SQL="select * from country;";
//	    	  
//	    	  stmt = con.createStatement();
//		         rs=stmt.executeQuery(SQL);
//		         int contor=0;
//		         while(rs.next()) {
//		        	writerx.write(rs.getString("CON_NAME"));
//		    
//		        	 System.out.println(rs.getString("CON_NAME"));
//		 
//		        	 contor=Integer.parseInt(rs.getString(1));
//		         }
//		         
//		         writerx.close();		         
//		         
//	      }catch(Exception e) {
//	    	  e.printStackTrace();
//	      }
//	}

}
