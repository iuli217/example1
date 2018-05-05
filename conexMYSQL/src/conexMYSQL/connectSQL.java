package conexMYSQL;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.*;


public class connectSQL extends scrieArray implements scrie {
		
	 public connectSQL(String a, int x) {
			System.out.println(x);
			System.out.println(a);
			StringBuffer adi = new StringBuffer("adiran");
			
		}
	 @SuppressWarnings("unused")
	public static void main(String[] argv) throws IOException, Exception {
		 System.out.println("-------- MySQL JDBC Connection Testing ------------");	 

			Class.forName("com.mysql.jdbc.Driver");
			String con1="jdbc:mysql://192.168.100.XX/Heramus?user=root&password=XXXXXX";
		 
			List<String> lis = new ArrayList<String>();
			String connectionUrl = "jdbc:postgresql://192.168.10.XXX;databaseName=postgres;user=postgres;password=XXXXXXXXX";  
			
		      Connection con = null;  
		      Statement stmt = null;  
		      ResultSet rs = null;  
		      List<String> lista= new ArrayList<String>();
		      try {
				con = DriverManager.getConnection(con1);
				String SQL="select * from country;";
//				String update="update dbo.RawData set Active=1 ";
				String count="  SELECT COUNT(*) FROM country";
		         stmt = con.createStatement();
		         rs=stmt.executeQuery(count);
		         int contor=0;
		         while(rs.next()) {
		        	 System.out.println(rs.getString(1));
		        	 contor=Integer.parseInt(rs.getString(1));
		         }
//		         stmt.executeUpdate(update);
		         rs = stmt.executeQuery(SQL);

		         ResultSetMetaData rsmd = rs.getMetaData();
		         int columnsNumber = rsmd.getColumnCount();
		         String[][] tabel =new String[contor][columnsNumber];
		       
		         rs = stmt.executeQuery(SQL);
		         if(rs.wasNull()) {
		        	 System.out.println("sunt null");
		         }else {
		        	 int i=0;
		         while(rs.next()) {
		        	 
		        		 for(int j=1;j<columnsNumber+1;j++) {		
		        			 if(rs.getString(j)!=null) {
		        				 System.out.println(i+"       "+j);
		        			 tabel[i][j-1]=rs.getString(j).toString();
		        			 }else {
		        				 tabel[i][j-1]="";
		        			 }
		        		 }
		        		 i++;
		        	 }
		         scrie.citire22(tabel);
		         	}

		         rs.close();
		         con.close();
			} catch (SQLException e) {
				System.out.println("Connection Failed! Check output console");
				e.printStackTrace();
				return;
			}
			if (con != null) {
				System.out.println("You made it, take control your database now!");
			} else {
				System.out.println("Failed to make connection!");
			}
	 }
}
