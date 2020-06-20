package encapsulation;

public class testStudent {

	public static void main(String[] args) {

		Student s = new Student();
		s.setName("Lucy");
		s.setAge(14);
		
		System.out.println(s.getName());
		System.out.println(s.getAge(0));

		
	}

}
