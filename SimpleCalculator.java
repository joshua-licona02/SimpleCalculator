import java.util.Scanner;

//HR: None

public class SimpleCalculator {

	public static void main(String[]args) {
		
		int num1=0;
		int num2=0;
		int answer=0;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter numbers one at a time");
		num1=input.nextInt();
		num2=input.nextInt();
	
		System.out.println("Enter +, -, /, or *");
			char operator=input.next().charAt(0);
			
			if(operator=='+') {
				answer=add(num1, num2);
			}
			else if(operator=='-') {
				answer=subtract(num1, num2);
			}
			try {
			 if(operator=='/') {
				answer=divide(num1, num2);
			 }
			}
			catch(ArithmeticException divide){
				System.out.println("Cannot divide by 0"+divide);
			}
			 if(operator=='*') {
				answer=multiply(num1, num2);
			}
			
			System.out.println(num1+" "+operator+" "+num2+" = "+answer);
		
	}
	
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	public static int subtract(int num1, int num2) {
		return num1-num2;
	}
	public static int divide(int num1, int num2) {
		return num1/num2;
	}
	public static int multiply(int num1, int num2) {
		return num1*num2;
	}
}
