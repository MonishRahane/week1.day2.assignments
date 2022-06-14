package week1.day2.assignments;

public class EmployeeDetails {
	//Creating method to print employee name and employeeid
	public void printEmployeeName(String empName,int empId) {
		System.out.println(empName+","+empId);
	}
	//Creating method to get employee address
	public String getEmployeeAddress(String empAddress) {
		return empAddress;
	}
	//Creating method to print employee address
	public double printEmployeeAddress(double salary) {
		return salary;
	}
	//creating method to print employee mobile number
	public long printEmployeeMobileNumber(long mobNum){
		return mobNum;
	}
	
	public static void main(String[] args) {
		//Accessing the EmployeeDetails class using object
		EmployeeDetails obj = new EmployeeDetails();
		//Accessing method form EmployeeDetails class using the created object 
		obj.printEmployeeName("Hinata",35);
		System.out.println(obj.getEmployeeAddress("Coimbatore"));
		System.out.println(obj.printEmployeeMobileNumber(25000));
		System.out.println(obj.printEmployeeMobileNumber(9523012010l));
		
	}
}
