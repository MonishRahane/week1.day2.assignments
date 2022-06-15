package week1.day2.assignments;

public class PrintDuplicatesInArray {
	 public static void main(String[] args) {
		 //Declaring the given array
		 int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		 //Storing the array length in a variable
		 int length = arr.length;
		 //Declaring count variable
		 int count;
		 //Iterating the arr1 to the the length of the array
		 for(int i = 0;i<length;i++){
			 count = 0;
			 //Iterating again by adding 1 to the iterator variable
			 for(int j =i+ 1;j<length;j++) {
				//Comparing both array 
				if(arr[i] == arr[j]) {
					//Increasing count when the arrays are equal
					count++;
				}
			 }
			 if(count != 0) {
				 	//Printing the duplicate numbers in array
					System.out.println(arr[i]);
				}
		 }
	}
}
