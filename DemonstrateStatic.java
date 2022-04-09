//Write a program to demonstrate static variables, methods, and blocks
package MyAssignment_1;

public class DemonstrateStatic {
		static int a=10; //static variable
		int c = 1; //this is instance type variable to access this variable we need to create object
		
		public static void display(){
			
			System.out.println("Static display method");
		}	
		
	static {
		
		System.out.println("Static Block"); // static block 
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("static variable :"+DemonstrateStatic.a);//we can access static variable with class name
		DemonstrateStatic.display();//we can access static method with class name
		display();//directly call static method 
		DemoStatic1.show();//we can access another class static method with class name and method name 
	}

}
//new class

class DemoStatic1{
	public static void show() {
		
		System.out.println("Statiic show mehtod");
	}
}	