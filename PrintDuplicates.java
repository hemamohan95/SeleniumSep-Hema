package week1.assignments;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		System.out.println("Length of the array is "+arr.length);
		int count;
		for (int i = 0; i < arr.length-1; i++) {
			count=0;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]==arr[i]) {
					count=count+1;
				}
				
				
			}
			if(count>0) {
				System.out.println("Duplicate numbers are: " + (arr[i]));
			}
			
		}

	}

}
