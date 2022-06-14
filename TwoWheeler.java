package week1.day2.assignments;

public class TwoWheeler {
	//Declaring global variables
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chasisNumber = 5269748134l;
	boolean isPunctured = false;
	String bikeName = "KTM Adeventure 250";
	double runningKm = 2170.56;
	
	public static void main(String[] args) {
		//Creating object for the class TwoWheeler
		TwoWheeler obj = new TwoWheeler();
		
		//Printing the variables form the class TwoWheeler
		System.out.println(obj.noOfWheels);
		System.out.println(obj.noOfMirrors);
		System.out.println(obj.chasisNumber);
		System.out.println(obj.isPunctured);
		System.out.println(obj.bikeName);
		System.out.println(obj.runningKm);
		
		
	}
}
