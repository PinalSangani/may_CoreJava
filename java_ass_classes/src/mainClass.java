import java.util.Scanner;

public class mainClass {
	 public static void main(String[] args) {
//		 System.out.println("Hello world");
//		 Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
//		 System.out.print("Enter first number- ");  
//		 int a= sc.nextInt(); 
//		 System.out.print("Enter second number- ");  
//		 int b= sc.nextInt();  
//		 System.out.print("Enter third number- ");  
//		 int c= sc.nextInt();  
//		 int d=a+b+c;  
//		 System.out.println("Total= " +d);  
		 
		 
//		 Scanner reader = new Scanner(System.in);
//
//	        System.out.print("Enter a number: ");
//	        int num = reader.nextInt();
//
//	        if(num % 2 == 0)
//	            System.out.println(num + " Number is even");
//	        else
//	            System.out.println(num + " Number is odd");
//	        
	        
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();
	        scanner.close();
	        
	        if (number % 5 == 0 && number % 7 == 0) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }

	 }
}
      