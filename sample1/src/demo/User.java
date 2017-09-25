package demo;

class User {
	int id;
	String name;
	int salary;
	int roll;
	String school;
	
	User(int userId, String userName){
		id = userId;
		name = userName;		
	}
	
    
	
	User(int userId, String userName, int userRoll, int userSalary){
		this(userId, userName);
		roll = userRoll;
	    salary = userSalary;
	
	}
	// Run main methd with all inputs 
	 public static void main(String[] args) {
		User instructor = new User(1002, "Dheeru", 1234, 50000);
		System.out.println("Name: " + instructor.name);
		System.out.println("ID: " + instructor.id);
		System.out.println("Salary: " + instructor.salary);
		System.out.println("ROLL: " + instructor.roll);
	 }
}
