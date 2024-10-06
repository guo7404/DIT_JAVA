package r1;

public class TV {
	String brand;
	int inch,price;
	void show() {
		System.out.println(brand+"에서 만든 "+price+"만원 "+inch+"인치 TV");
	}
	public TV(String brand,int inch,int price) {
		this.brand = brand;
		this.inch = inch;
		this.price = price;
	}
	
	public static void main(String[] args) {
		TV tv = new TV("삼성",50,300);
		tv.show();
	}
}
		
