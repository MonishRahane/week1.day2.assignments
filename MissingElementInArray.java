package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInArray {
	
	public static void main(String[] args) {
		//Initializing  the array
		int[] array = {1,2,3,4,7,6,8};
		
		//Sorting the array
		Arrays.sort(array);
		
		//Looping the array to the length of the array
		for(int i = 0;i < array.length;i++) {
			
			//Checking the iterator variable is not equal to values in array 
			if((i+1) != array[i]) {
				
				//Printing the missing element 
				System.out.println(++i);
				
				//Breaking the loop once missing element is found
				break;
			}
			
		}
	}
}
