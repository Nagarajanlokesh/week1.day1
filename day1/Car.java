package week1.day1;

//Step1 - New class creation 
// Public = Access Specifier, Class = Keyword, Car = ClassName 

public class Car {
	
	//Step2- New Method creation ( Shortcut = contol+Space then Enter ) 
	// Private or Public = Access Specifier, Void =Return Type, driverCar = Method name 
	
	public void driveCar() {
		
		// Step 3 - Print statement 
		// Shortcut - Syso then contol+Space then Enter
		System.out.println("Drive the Car");

	}
	
	public void putBreak() {
		
		System.out.println("Break Applied ");

	}
	
    // Without main method we can't run the java program  
	// Object will be created inside main method 
	// Step 4 - Create main method - Shortcut Main then contol+Space then Enter
	
	public static void main(String[] args) {
		
		// Without object we can't run the program 
		// ClassName Object name = new className();
		
		Car myCar = new Car();
		
		myCar.driveCar();
		myCar.putBreak();
		
	
		
	}

}
