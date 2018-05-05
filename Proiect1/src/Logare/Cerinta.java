package Logare;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Cerinta extends Lift {

	private static Scanner sc1;
	public static void main(String[] args) throws IOException {
		
		
		Properties prop= new Properties();
		FileInputStream filess = new FileInputStream("C:\\Users\\iulian.dumitru\\eclipse-workspace\\Proiect1\\logs.properties");
		prop.load(filess);
		Scanner scanner = new Scanner(System.in);  
		System.out.println("introdu user:");
		String user = scanner.nextLine(); 
		System.out.println("introdu parola:");
		String parola=scanner.nextLine();
		
		if(user.equals(prop.getProperty("user"))& parola.equals(prop.getProperty("pass"))) {
		
			System.out.println("introduceti cautarea");
			String cautare=scanner.nextLine();
			logare.log();
		}
		scanner.close();
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("sunteti la parter");
//		int etaj=0;
//		int et=-1;
//		try{do {	
//			try{
//				System.out.println("la ce etaj merge?");
//			et=sc.nextInt();
//			}catch(Exception e) {
//				sc.nextLine();
//				System.out.println("numar introdus gresit");
//				et=-1;
//				sc1 = new Scanner(System.in);
//				int eet=sc1.nextInt();
//				sc1.nextLine();
//				et=eet;
//			}
//			if(et==-1) {
//				System.out.println("ramanem la etajulllll"+etaj);
//				break;
//			}else if(et>etaj &et<10) {
//				Lift.urcare(et);
//				etaj=et;
//			}else if(et<etaj) {
//				Lift.coborare(et);
//				etaj=et;
//			}else if(et==etaj &et!=0) {
//				Lift.blocare(et);
//				etaj=et;
//			}
//		}while(etaj<10 &etaj>0);
//		}catch(Exception e) {
//			System.out.println("numar introdus gresit, reincearca iar");
//		}
//		if(etaj==0) {
//		System.out.println("suntem la parter");
//		}
//		sc.close();
//			
		


	}
}