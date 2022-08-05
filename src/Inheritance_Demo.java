
public class Inheritance_Demo {
	public static void main(String[] args) {
		
	
	ThreeD td=new ThreeD();
	td.print();
	}
}
class TwoD{
	
	int x=5, y=10;
	public TwoD(){System.out.println("TwoD");}
	void print() {
		System.out.printf("(x,y)=(%d %d)",this.x, this.y);
	}
	
}
class ThreeD extends TwoD{
	int z=100;
	public ThreeD() {
		System.out.println("ThreeD");
	}
}