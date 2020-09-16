package week1.assignments;

public class SwitchOperator {

	public static void main(String[] args) {
		int a=3;
		int b=2;
		String input = "add";
		switch (input) {
		case "add":System.out.println("addition of two numbers are: " + (a+b));
			break;
		case "sub":System.out.println("subtraction of two numbers are: " + (a-b));
		    break;
		case "mul":System.out.println("multiplication of two numbers are: " + (a*b) );
	        break;
		case "div":System.out.println("division of two numbers are: " + (a/b));
	        break;
		default:System.out.println("modulation of two numbers are: " +(a%b));
		}

	}

}
