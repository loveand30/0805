import java.util.*;

public class Car {
	
	
	private String name;
	private int price;
	private String maker;
	private Date today;
	private final double PI=3.141596;
	
	
	public Car(String name, int price, String maker) {
		
		this.name = name;
		this.price = price;
		this.maker = maker;
		System.out.println("객체가 생성 되었음");
	}
	
	{

		System.out.println("Hello, World");
		this.today=new Date();
	}
	@Override
	public String toString() {
		return "오늘은"+this.today+"입니다.";
	}
	
}
