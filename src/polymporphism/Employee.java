package polymporphism;

public class Employee extends TestEmployee  {
	
	String name;
	public void sayName() {
		System.out.println("Employee 1");
	}
		
	public void sayName(String name) {
		System.out.println("Employee 2"+ name);
		
		
	}
	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.totalEmployees();
	}

}
