package Ex1;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
	import java.util.Scanner;
	import org.apache.commons.lang3.ArrayUtils;
	import org.apache.commons.lang3.StringUtils;

public class java {
	
	public static void main(String args[]) {  
		Scanner scanner = new Scanner(System.in);  
		int decimalNum = 0;  
  
		System.out.print("Enter the binary number:");  
		String num1 = scanner.next();  
  
		try {  
		///{ write you code here    
 
 System.out.print(Integer.toBinaryString(Integer.parseInt(num1)));

 
		} catch (NumberFormatException nfe) {  
			System.out.println("The number is not a binary number.");  
		}  
  
	
	
	/*public static void main(String[] args) { 
		int total = 0; // stores the sum of the 5 numbers   
		int number; // stores the current input   
		Scanner scan = new Scanner(System.in);
                ///{ Write your code here  
	for(int i=0;i<5;i++){
		System.out.println("Enter an integer:");
	    number=scan.nextInt();
	    total+=number;
	}
           
                
          ///}
		System.out.println("Total is:"+ total); 
	
	
	
	
	/*public static void main(String args[]){   
		 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter height: ");
        int height = sc.nextInt();
 
        System.out.print("Enter width: " );
        int width = sc.nextInt();
        
        for(int i=0;i<height;i++) {
        	for(int j=0;j<width;j++) {
        		System.out.print("#");
        	}
        	System.out.println();
        }
	
	
	/* public static void main(String args[]){  
		  
         Scanner sc = new Scanner(System.in) ; 
  
         int c=0;
         System.out.print("Enter String: "); 
         String str = sc.nextLine();  
         String[] s =str.split("");
		         for(int i=0;i<s.length;i++) {
		        	 Boolean bol=true;
		        	 for(int j=2;j<=Integer.parseInt(s[i])/2;j++) {
			        	 if(Integer.parseInt(s[i])%j==0) {
			        		 bol=false;
			        		 break;
			        	 } 
			        	 if(bol=true) {
			        		 c+=Integer.parseInt(s[i]); 
		        	 }
		        	
		        	 }
		         }  
		         System.out.println ("Number of a's: " + c);  
	
	
	/* Scanner sc=new Scanner(System.in);
	    public static void main(String[] args){
			System.out.println("Welcome To The Keychain Shop!");
			java obj=new java();
			obj.menu();
		}
		public void menu()
		{
			int choice,keyChains=0,price=10;
			
				while(true){
					System.out.print("1. Add Keychains to Order.\n2. Remove Keychains from Order.\n3. View Current Order.\n4. Checkout.\nPlease Enter Your Choice-");
					choice=sc.nextInt();
					switch(choice){
						case 1:
							keyChains=addKeychains(keyChains);
							break;
						case 2:
							keyChains=removeKeychains(keyChains);
						
							break;
						case 3:
							viewOrder(keyChains,price);
							break;
						default:
							checkout(keyChains,price);
							return;
					}
				}
			}
		
		
		private int checkout(int keyChains, int price) {
			Scanner sc=new Scanner(System.in);
			System.out.println("What is your name-");
			String nume= sc.next();
			
			System.out.println("No. of keychains-" + keyChains+ 
					"\nCost per keyChain-" + price+ 
					"\nTotal Cost-" + price*keyChains);
			System.out.println("Thank you for your order-"+nume);
			
			
			return 0;
			
		}
		private int viewOrder(int keyChains, int price) {
			System.out.println("No. of keychains-" + keyChains+ 
					"\nCost per keyChain-" + price+ 
					"\nTotal Cost-" + price*keyChains);
			return 0;
			
		}
		private int removeKeychains(int keyChains) {
			Scanner sc=new Scanner(System.in);
			int key=sc.nextInt();
			keyChains-=key;
			return keyChains;
		}
		private int addKeychains(int keyChains) {
			Scanner sc=new Scanner(System.in);
			int key=sc.nextInt();
			keyChains+=key;
			return keyChains;
		

	
	/* public static void main(String[] args){
			System.out.println("Welcome To The Keychain Shop!");
			java obj=new java();
			obj.menu();
		}
		public void menu()
		{
			Scanner sc=new Scanner(System.in);
			int choice;
		
				while(true){
					System.out.println("\n1. Add Keychains to Order.\n2. Remove Keychains from Order.\n3. View Current Order.\n4. Checkout.\nPlease Enter Your Choice: ");
					choice=sc.nextInt();
					switch(choice){
						case 1:
							addKeychains();
							break;
						case 2:
							removeKeychains();
							break;
						case 3:
							viewOrder();
							break;
						case 4:
							checkout();
	                        System.exit(0);
	                        break;
	                    default:
	                        System.out.print("Incorrect Choice.");
					}
				}
			}
		private void removeKeychains() {
			System.out.println("REMOVE KEYCHAINS.");
			
		}
		private void checkout() {
			System.out.println("CHECKOUT.");
			
		}
		private void viewOrder() {
			System.out.println("VIEW ORDER.");
			
		}
		private void addKeychains() {
		System.out.println("ADD KEYCHAINS.");
			

	
	
	
	
	/*public static void main(String args[]) {
	      
	     
	      System.out.println("Printing prime number from 2 to 20:" );
	      Boolean bol=true;
	      for(int number = 2; number<=20; number++){
	    	 bol= isPrime(number);
//System.out.println(bol);
	          if(bol == true){
	              System.out.println(number+" <");
	          }  else  {

	        	  System.out.println(number);
	          }

	      }
	}


	private static boolean isPrime(int number) {
		Boolean bol = true;
		for(int i=2;i <= number/ 2;i++) {
			if(number%i==0)	{
//				System.out.println(number+"   "+i);
				bol = false;
				break;
			}
		}
		
		return bol;
	

	
	
	
	/*	public static void main(String args[]){
		 Scanner scanner=new Scanner(System.in);
		 
		 System.out.println("Enter the 1st number:");
		 int num1=scanner.nextInt();
		System.out.println("Enter the 2nd number:");
		 int num2=scanner.nextInt();
		 System.out.println(shareDigit(num1,num2));
		scanner.close();
	}
		    ///{write you code here

	private static Boolean shareDigit(int num1, int num2) {
Boolean bol=true;

 if(Integer.toString(num1).contains(Integer.toString(num2).substring(0,1))||Integer.toString(num1).contains(Integer.toString(num2).substring(1,2))) {
bol=true;	
}else {
	bol=false;
}

		return bol;
	




	
	
	
	
	/*public static void main(String args[]){
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter first string:");
		 String str1 = scanner.nextLine();
		 System.out.println("Enter second string:");
		 String str2 = scanner.nextLine();
		 System.out.println(mixString(str1,str2));
		}
		    ///{write you code here

	private static String mixString(String str1, String str2) {

		String ret="";
		char[] st1=str1.toCharArray();
		char[] st2= str2.toCharArray();
		int cont = 0;
		while(cont<str1.length() & cont<str2.length()){
		ret=ret+st1[cont]+st2[cont];
	
		cont++;
		}

			if(str1.length()>str2.length()) {
			for(int i=cont;i<str1.length();i++) {
			ret=ret+st1[i];
			}}else if(str1.length()<str2.length()) {
				for(int i=cont;i<str2.length();i++) {
					ret=ret+st2[i];
					}
			}
		
		return ret;
	

	
	/*public static void main(String args[]){
		 Scanner scanner=new Scanner(System.in);
		 int cigars=0;
		 boolean isWeekend=false,success=false;
		 System.out.println("Enter number of cigars:");
		 cigars=scanner.nextInt();
		 System.out.println("Is it a weekend?Enter (true/false):");
		 isWeekend=scanner.nextBoolean();
		 success=cigarParty(cigars,isWeekend);
		 System.out.println("party successful:"+success);
		 }
		 public static boolean cigarParty(int cigars, boolean isWeekend) {
			 boolean su=true;
			 if(isWeekend & cigars>=40) {
				 su=true;
			 }else if(isWeekend=false & cigars>=40&cigars<=60) {
				 su=true;
			 }else {
				 su=false;
			 }
			 
		    ///{write you code here

return su;


	
	
	
	
	/*public static void main(String args[]){
		 Scanner scanner=new Scanner(System.in);
		 int review;
		 double cost;
		 System.out.println("Enter cost of ticket in dollars:");
		 cost=scanner.nextDouble();
		 System.out.println("Enter stars it received out of 5:");
		 review=scanner.nextInt();
		 System.out.print("Your level of interest in watching movie:");
		 seeMovie(cost,review);
		 scanner.close();

		 }
	 
	
	public static String seeMovie(double cost,int review) {		
		String lev1=null;
		if(cost<5.00){
			lev1="very much interested";    
			}
		else if(cost<12.00 &review==5) {
			lev1="very much interested";
		}else if(cost==12.00 & review==5) {
			lev1="sort of interested";
		}
		else if(cost>12.00) {
			lev1="not interested";
		}
		else if(cost<=11.99||cost>=5.00 &review>=2|| review<=4) {
			lev1="sort of interested";
		}else {
			lev1="not interested";
		}
		 System.out.print(lev1);
		return lev1;
	
	
	
	
	/*public static void main(String args[]){  
		  
	        int num1 = 0;  
		int num2 = 0;  
			  
		Scanner sc = new Scanner(System.in);  
			  
		System.out.print("Enter first number: ");  
		num1 = sc.nextInt();  
	  
	        System.out.print("Enter second number: ");  
		num2 = sc.nextInt();  
			  
	       
	 
	 
		Sum(num1, num2);  
		Difference(num1, num2);  
			  
		System.out.print(Product(num1, num2)+"\n");  
	       	
	}

	private static String Product(int num1, int num2) {
	int prod=num1*num2;
	//String pro=Integer.toString(prod);
		return Integer.toString(prod);
	}

	private static void Difference(int num1, int num2) {
		int diff=num1-num2;
		System.out.println(diff);
		
	}

	private static void Sum(int num1, int num2) {
		int sum=num1+num2;
		System.out.println(sum);
		
	

	 /*public static void main(String args[]){ 
		 Scanner scanner=new Scanner(System.in); 
		 System.out.println("Enter an alphabet:");
		 String input;
		 
		 input = scanner.next();
		 input = lowerCase(input);
		 System.out.println(input);
		 } 
		 
		  
		 public static String lowerCase(String x){

		   x=x.toLowerCase();
		   
		   
		   
		   return x;
	
		 
	
	
	
	/*	
private static Boolean bol=true;

	 public static void main(String args[]){ 
		 Scanner scanner=new Scanner(System.in); 
		 System.out.println("Enter first number:");
		 int x = scanner.nextInt();
		 System.out.println("Enter second number:");
		 int y = scanner.nextInt();
		 
		 System.out.println(multiples(x,y));
		 
		  
		} 
		 
		 public static boolean multiples(int x , int y){
		    if(y%x!=0) {
		    	bol=false;
		    }
		     
	
		 return bol;
	
	
	
	/*
	static final double PI = 3.14;   
	   public double area;
	void getArea() {   
		// Method used to calculate area of a circle     
		Scanner scanner = new Scanner(System.in);   
		System.out.print("Enter the radius: "); 
		double a=scanner.nextDouble();
		
		area=a*a*PI;
  
		System.out.print("Area of circle is: " + area);   
   
	}   
   
	public static void main(String args[]) {   
		java c1 = new java();   
		c1.getArea();   
	
	
	
	
	
	
	/*	
	public static double number, answer;  
	   
    public static void calculateSquare(double number){  
    	number= Math.round(Math.sqrt(number));
    	String a= Double.toString(number);
    	System.out.println("The square root is: "+a.replaceAll(".0", ""));

    	
    	
    }  
   
    public static void main(String[] args) {  
   
        java challenge= new java();  
        final Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a number: ");  
        number = sc.nextDouble();  
        challenge.calculateSquare(number); 

	
	
	
	/*public static void main(String[] args){
		int[] a=new int[10];
		int maxPos=0;
		int poz=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array values:");
		for(int i=0;i<10;i++) {
		a[i]=sc.nextInt();}
		System.out.print("Array:");
		
		for(int i=0;i<10;i++) {
			System.out.print(a[i]+" ");
			if(i==0) {
				maxPos=a[i];
			}else if(a[i]>maxPos & i>0) {
				poz=i+1;
				maxPos=a[i];
			}
			
		}System.out.println();
		System.out.println("The Largest Element is:"+maxPos);
		System.out.println("It's at location:"+poz);
			
	
	/* public static void main(String args[]){
		    Scanner scanner=new Scanner(System.in);
		    int element[]=new int[10];
		    int i,r=0;
			System.out.println("Enter size of array:");
			r=scanner.nextInt();
			System.out.println("Enter "+r+" integers to fill an array:");
			for(i=0;i<r;i++){
				element[i]=scanner.nextInt();
			}
			System.out.println("Array printed backwards:");
			
			for(int a=r;a>0;a--) {
				System.out.println("element ["+a+"] is:"+element[a-1]);
			}
		    ///{write you code here

	
	
	
	
	/*public static void main(String args[]){
		 Scanner scanner=new Scanner(System.in);
		 int[] array = new int[5];
		 for(int i=0;i<array.length;i++)
		 {
		     array[i] = scanner.nextInt();
		  }
int bol=0;
int cont;

for(int i=0;i<4;i++) {
	
	cont=0;
	System.out.println(cont+" 1  "+i);
	while(array[i]==array[i+1] &i<3) {
		cont+=1;
		i++;
		System.out.println(cont+"  2 "+i);
	}
	System.out.println(cont+" 3  "+i);
	if(cont>0) {
		bol+=1;
	}
}
System.out.println(bol);



	/*public static void main(String args[]){
		 Scanner scanner=new Scanner(System.in);

		 int[] array = new int[5];
		 System.out.println("Enter integers into the array:");
		 for(int i=0;i<array.length;i++)
		 {
		     array[i] = scanner.nextInt();
		  }
Boolean bol=false;
		 for(int i=0;i<3;i++)
		 {
			 if(array[i]+1==array[i+1] & array[i+1]+1==array[i+2]) {
				 bol=true;
			 }
		 }System.out.println(bol);

		    

	
	/* public static void main(String args[]) 
	 {   
	 Scanner scanner=new Scanner(System.in);   
	 int sum=0;   
	 int a[]; 
	 a=new int[5];  
	 
	 List<Integer> lista = new ArrayList<Integer>();
	 System.out.println("Enter elements of array :");  
	  for(int i=0;i<5;i++)  
	    {  
	      lista.add(scanner.nextInt()); 
	    }  
	  String c=null;
	  if(lista.get(0)%2==0) {
	  c="stanga";}
	  else {
		  c="dreapta";
	  }
	  for(int i=0;i<5;) {
		  if(lista.get(i)%2==0 & c=="stanga") {
			  System.out.println("trce pe aici"+i+"   "+lista.get(i));
			  Collections.swap(lista, i,i+1);
			  
		  }else if(lista.get(i)%2==0 & c=="dreapta") {
			  System.out.println("trce pe aici"+i+"   "+lista.get(i));
			  Collections.swap(lista, i,i-1);
			 
			  
		  }i++;
		  
	  }
	  
	  for(int i=0;i<5;i++) {
	  System.out.println(lista.get(i));
	  }
	      
	      
	      /*      if(a[i]>max || i==0) {
	    	  max=a[i];
	      }

	      if(a[i]<min || i==0) {
	    	  min=a[i];
	      }
	      System.out.println(max+"   "+min);
	      if(i==9) 
	      break;  
	      }

	    System.out.println("Result is :"+(max*min)); 


	     
	
	
	
	
	*public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		System.out.print("Enter a string:");
		String s = scanner.next();

		
		String[] str = s.split("");
		System.out.println(str[1]);
		
for(int i=0;i<str.length;i++) {
	System.out.print(str[str.length-i-1]);
}
	
	
	
	/*public static void main(String args[]){
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a string:");
		    	String s = scanner.next();
		    	if(s.length()>1) {
		    		if(s.substring(0,2).equals(s.substring(s.length()-2,s.length())) & s.length()>1) {
		    			System.out.println("true");
		    		}else {
		    			System.out.println("false");
		    		}
		    	
		    	}else {
		    		System.out.println("false");
		    	}
		
	
	 
	
	/* public static void main(String args[]){
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter a string:");
		 String string = scanner.nextLine();
		 System.out.println(equalIsNot(string));
		}
		    
		public static boolean equalIsNot(String str) {
			boolean bool=true;
			int occIs= StringUtils.countMatches(str,"is");
			int occNot= StringUtils.countMatches(str,"not");
			if(Integer.compare(occIs, occNot)>=0) {
				bool=false;
			}else {
				bool=true;
			}	
			
			return bool;

			
		 
		 /*
	 *	 Scanner scanner=new Scanner(System.in);
	 
		 System.out.println("Enter a string:");
		 String str = scanner.nextLine();
		 System.out.println(notReplace(str));
		}
		    ///{write you code here

	 public static String notReplace(String str) {
		 if(str.toString().contains(" is ")) {
			 str=str.replace(" is ", " is not ");
		 }
		
		 
		 if(str.substring(0, 2).toString().equals("is")) {
			 str = "is not"+str.substring(2,str.length());
		 }
		    return str;
		    
		}

	
	
	
	
	/*public static void main(String args[]){
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter a string:");
		 String str = scanner.nextLine();
		 char[] ch = str.toCharArray();

		 List<Integer> lista = new ArrayList<Integer>();
		 int sum=0;
		 int sum1=0;
		 for(int i=0;i<ch.length;i++) {
			 switch(Character.toString(ch[i])) {
			 case "i":
				 lista.add(1);
				 break;
			 case "x":
				lista.add(10);
				break;
			 case "c":
				 lista.add(100);
				break;
			 case "m":
				 lista.add(1000);
				break;
			 case "v":
				 lista.add(5);
				break;
			 case "l":
				 lista.add(50);
			break;
			 case "d":
				 lista.add(500);
				 break;
			 case "I":
				 lista.add(1);
				 break;
			 case "X":
				lista.add(10);
				break;
			 case "C":
				 lista.add(100);
				break;
			 case "M":
				 lista.add(1000);
				break;
			 case "V":
				 lista.add(5);
				break;
			 case "L":
				 lista.add(50);
			break;
			 case "D":
				 lista.add(500);
				 break; 
				default:
					System.out.println("incepe iarasi");
					break;
				 }
			 
			 }
		 
		 for(int i=0;i<lista.size()-1;i++) {
			 if(lista.get(i)==lista.get(+1)) {
				 sum1+=lista.get(i);
			 }else if (lista.get(i)<lista.get(i+1)) {
				 sum= lista.get(i+1)-sum;
			 }
		 
	 
		 }
		 System.out.println(sum);

}
	
	*public static void main(String args[]){
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter a string:");
	 String str = scanner.nextLine();
	 System.out.println(sumDigits(str));
	}
	
	 
	 public static int sumDigits(String str) {
		 char[] lista = str.toCharArray();
		 int sum=0;
		 for(int i=0;i<lista.length;i++) {
			if(Character.isDigit(lista[i])) {
				 sum+= Integer.parseInt(Character.toString(lista[i]));
			 }
		 }
		return sum;
		 
	 }


*	 public static void main(String args[]){
		 Scanner scanner= new Scanner(System.in);
		 System.out.println("Enter the first string:");
		 String str = scanner.nextLine();
	     System.out.println(altPairs(str));
		 
		 
	 }
	 public static String altPairs(String str) {
		 char[] stringul = str.toCharArray();
		 int cont = 0;

		 
		 for(int i=0;i<stringul.length;i++) {

	if(i%3==0 ) {
		System.out.println(stringul[cont]);
		cont+=1;
	}else if(i%3==1){
		System.out.println(stringul[cont]);
		cont+=3;
	}else  {
		System.out.println(stringul[cont]);
		cont+=1;
	}
		
	}


		return str;
	 
}
		 
		 
		 
		*Scanner scanner= new Scanner(System.in);
	      System.out.println("Enter the first string:");
	      String s1 = scanner.nextLine();
		 String[] s= s1.split(" ");

		 List<Integer> sad = new ArrayList<Integer>();

		 Arrays.sort(s,Comparator.comparingInt(String::length));
		 for(int i=0;i<s.length;) {
			 int contor=1;
			for(int j=i+1;j<s.length;j++) {
				if(s[i].length()==s[j].length()) {
					contor+=1;
				}
			}
		
			 
			 System.out.println("No. of words of length "+s[i].length()+ " are "+contor+".");
			 if(contor>1) {
				 i+=contor;
			 }else {
				 i++;
			 }
			
		 } 
		 
		 
		 
		 
		 String s1, s2;
	      Scanner scanner= new Scanner(System.in);
	      System.out.println("Enter the first string:");
	      s1 = scanner.nextLine();
	 
	      System.out.println("Enter the second string:");
	      s2 = scanner.nextLine(); 
	      int c;
	      
	      System.out.println(s1.compareTo(s2));
		 
		 
		 *Scanner scanner=new Scanner(System.in);
		    String str=null,strng="";
			System.out.println("Enter a string for stringSplosion:");
			str=scanner.nextLine();
			strng=stringSplosion(str);
			System.out.println("here it is :"+strng);
			}
		 public static String stringSplosion(String str) {

		    String strng="";
		    int i=0;
		    
		    while(i<str.length()){
		        strng=strng+str.substring(0, i+1);
			    		i++;
		    }
		    return strng;
		
		 
		 
		(Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a string:");
	    	String s = scanner.nextLine();
	    	int i=0;
	    	while(i<s.length()) {
	    		System.out.print(s.substring(0, i));
	    		i++;
	    	}
		 
		 
	
	*
	*
	*
	Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a string:");
		    	char[] s = scanner.next().toCharArray();
		    	String ch="";
		    	int suma=0;
		    	
		    	 
		    	for(int i=0;i<s.length;) {
		    		int nr=0;
		    		
		    		while(StringUtils.isNumeric(Character.toString(s[i])) ){
		    			nr=1;
		    			ch=ch+s[i];
		    	if(i<s.length-1) {
		    			i=i+nr;
		    	}else {
		    		break;
		    	}
		    		}
		    		i++;
		    		if(ch!="") {
		    			suma=suma+Integer.parseInt(ch);}
		    		ch="";
		    		
		    	
		    	}
		    	System.out.println(suma);
		    	
*
**
***
****
	    	
	    	
	    	for(int i=0;i<s.length;i++) {
		    		int cont=i;
		    		
		    		
		    		if(StringUtils.isNumeric(Character.toString(s[cont]))) {
		    			cont++;
		    			ch=ch+Character.toString(s[i]);
		    		System.out.println(ch);
		    		while(StringUtils.isNumeric(Character.toString(s[cont])) & cont<s.length) {
		    			ch=ch+Character.toString(s[cont]);
		    			cont++;
		    			
		    		} i=i+cont;
		    	}else {
		    		i++;
		    	}
		    		
		    		if(ch!="") {suma=suma+Integer.parseInt(ch);}
		    		else {}
		    		}
		    	System.out.println(suma);
		    	
		    	
		    	//StringUtils.isNumeric(s);
		    	
		   
		    	
		    	
		    	
		  	if(s.toString().length()<=3) {
		    		System.out.println(s.toUpperCase());
		    	}else {
		    		System.out.println(s.substring(0, s.length()-3)+s.substring(s.length()-3,s.length()).toUpperCase());
		    	}
		 
		 
		 
		 Scanner scanner=new Scanner(System.in);
		 String string;
		 System.out.println("Enter a string:");
		 string = scanner.nextLine();
		    ///{Write your code here
		 
		   if(string.trim().length()==0) {
			   System.out.println("");
			   
		   }else if(string.trim().length()!=0 &string.trim().length()<=2) {
			   System.out.println(string);
		   }else {
			   System.out.println(string.substring(0, 2));
		   }
		 
		
		
		Scanner sc = new Scanner(System.in);
		  System.out.print("Enter a string:");
		  char[] s = sc.nextLine().toCharArray();	

		    	int count=0;
		    	for(int i=0;i<s.length-1;i++) {
		    		int sec=i;
		    		int count1=0;
		    		while(Character.toString(s[sec]).equals(Character.toString(s[sec+1]))& sec<s.length-2){
		    				count1+=1;
		    				sec++;	
		    		} 
		    		if (count<count1) {
		    			count=count1;
		    		}		    		
		    
		    	}
		    	if(s.length<1) {
		    		System.out.println(0);
		    	}else {
		    	System.out.println(count+1);
		    	}
	
	
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string:");
		String string= scanner.nextLine();
		
		if(string.length()>=2) {
		System.out.println(string.substring(2, string.length()) + string.substring(0,2));
		}else {
			
		}


	 public static void main(String args[]){
		    Scanner scanner=new Scanner(System.in);
		    int n=0;
			String str="",strng="";
			System.out.println("Enter a string:");
			str=scanner.nextLine();
			System.out.println("How many times?:");
			n=scanner.nextInt();
			strng=stringTimes(str,n);
			System.out.println("stringTimes:"+strng);
		 }
			public static String stringTimes(String str, int n) {
		int x=0;
		String adi ="";
		while(x<n){
		    adi=adi+str;
		    x++;
		}
		return adi;
	
	
	
	public static void main(String args[]){
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter a string:");
		 String string = scanner.nextLine();
		 int x=countTriplets(string);
		 System.out.println(x);
		 scanner.close();
		}
	
	
	public static int countTriplets(String x) {
		char[] arr = x.toCharArray();
		
		int contor=0;
		for (int i=0;i<arr.length-2;i++) {
		if(Character.toString(arr[i]).equals(Character.toString(arr[i+1])) & Character.toString(arr[i]).equals(Character.toString(arr[i+2]))) {
			contor+=1;

		}else {	
		}
		
	}
		return contor;
	
	}
	

	public static void main(String[] args)throws IOException{    
        System.out.println("Enter a sentence:");  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
        String s1=br.readLine();  
        
if(s1.substring(1, 3).contains("bad")||s1.substring(0, 2).contains("bad")) {
	System.out.println("True");
	
}else
{
	System.out.println("False");
}

        
        
        
        
       
        char[] jar = s1.toCharArray();
        Arrays.sort(jar);
        for(int i=0;i<jar.length-1;) {
        	if(jar[i]==jar[i+1]) {
        		jar=ArrayUtils.removeElement(jar, jar[i+1]);
        	}else {
        		i++;
        	}
        }

for(int i=0;i<jar.length;i++) {
	System.out.println(jar[i]);
}
        
        
        
        for(int i = 0; i<3;i++) {
        if(s1.contains("%20")) {
        	s1=s1.replace("%20", "");
        } else if(s1.contains("%3A")) {
        	s1=s1.replace("%3A", "?");
        }else if(s1.contains("%3D")) {
        	s1=s1.replace("%3D", ".");
        }else {
        	
        }}
        System.out.println(s1);
    
        boolean g=false;
        char[] lista=s1.toCharArray();
        for(int i=0;i<lista.length-2;i++) {
        	if(Character.toString(lista[i]).equals("b") & Character.toString(lista[i+2]).equals("b")) {
        		g=true;
        		break;
        	}else {
        		g=false;
        	}
        	
        }
	if(g==true){
      System.out.println("True");}
	else
	{
		System.out.println("False");
	}

     
    *       System.out.println(s1.substring(s1.length()/2, s1.length())+new String(s1).substring(0, s1.length()/2));
    *     
        String[] lista = {"a","e","i","o","u"};
        for(int i=0;i<lista.length;i++) {
        if(s1.contains(lista[i]) || s1.contains(lista[i].toUpperCase())) {
        	
        	
        	s1= s1.toString().replace(lista[i], "");
        s1=	s1.toString().replace(lista[i].toUpperCase(), "");
        	
        	System.out.println(s1);
        }else {
        	System.out.println("am trecut pe aici");
        }
        	
        
        }

        
        String Admin="admin";
    	String test="test";

    	
    	if(s1.toString().toLowerCase().equals(Admin.toString().toLowerCase()) || s1.toString().toLowerCase().contains(Admin)){
    	    System.out.println("Username accepted");
    	}else if(s1.toString().toLowerCase().equals(test.toString().toLowerCase())){
    	    System.out.println("Invalid username");
    	}
*System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());
System.out.println(s1.length());



        char[] lista=s1.toCharArray();
         
        for(int i=0;i<lista.length;i++) {
        	
        if(Character.isDigit(lista[i])) {
        	System.out.println("Avem digit");
        	
        }
        	
        else if(Character.isUpperCase(lista[i])) {
        		lista[i]=Character.toLowerCase(lista[i]);
        		System.out.println("Upppepeper");
        		
        	}else {
        		lista[i]=Character.toUpperCase(lista[i]);
        		System.out.println("Lowewrrewwras");
        	}
        }
        
   
        
        ///{Enter your code here   
      
        
        if(s1.toString().contains(" ")) {
        	System.out.println("cuvantul are spatiu");
        }else
        {
        	char[]a=s1.toCharArray();

        	int cont=0;
        	
        	for(int i=0;i<a.length-1;i++) {
        	

        		if(a[i]==a[a.length-i-1]) {
        			System.out.println("Succes");
        		}else {
        			cont=1;
        		}
        	}
        	if(cont==1) {
        	System.out.println("nu este succes");}
        }
        
       
       String[] arra=s1.split(" ");
       String a = "";
       
       for(int i=0; i<arra.length;i++) {
    	   if(a.length() >=arra[i].length()) {
    		   a=a;
    		   
    	   }else
    	   {
    		   a=arra[i];
    	   }
       }
       System.out.println("valoarea " +a);
br.close();*/
        
        
}      }
	

