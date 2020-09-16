package week1.assignments;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);  //2,3,4,6,7,11
		
		for (int i = data.length-2; i< data.length; i++) {   
			
			System.out.println("Second Largest Number is " + data[i]);  
			
			break;
		}
		

	}

}
