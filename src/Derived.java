
public class Derived extends Base {
	
	String name="ganjimin";
	void print() {
		System.out.println("나 사직의 메소드");
		
}
	void display() {
		this.print();
		super.print();
	}
}