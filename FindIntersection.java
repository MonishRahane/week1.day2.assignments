package week1.day2.assignments;

public class FindIntersection {
	public static void main(String[] args) {
		//Initializing  the array1
		int[] array1 = {3,2,11,4,6,7};
		
		//Initializing  the array2
		int[] array2 = {1,2,8,4,9,7};
		
		//Looping the array1
		for(int i=0;i<array1.length;i++) {
			
			//Looping the array2
			for(int j=0;j<array2.length;j++) {
				
				//Comparing both arrays
				if(array1[i] == array2[j]) {
					
					//Printing the matching value in both arrays 
					System.out.println(array1[i]);
				}
			}
		}
	}
}
