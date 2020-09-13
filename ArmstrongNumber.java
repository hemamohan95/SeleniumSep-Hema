package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input=153;
		int cal=0;
		int rem;
		int org = input;
		 
		while (input>0) {
			rem= input%10;
			int quo= input/10;
			input=quo;
			cal= cal+ (rem*rem*rem);
			
		}
		if (org==cal) {
			System.out.println(cal);
			
		}

	}

}
