
public class Inheritance_Demo1 {
	public static void main(String[] args) {
		
//		Manger m=new Manger();
		Employee em=new Employee();

		System.out.println(em.salay);
		
		
	}
}
class Manger{
	
	int salay = 100;
	
}
class Employee extends Manger{
	
	String name;
	
}
