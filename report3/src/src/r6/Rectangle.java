package r6;//미완성

public class Rectangle {
	int x,y,width,height;
	public Rectangle(int x,int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
	}
	boolean isSquare() {
		if(width==height)
			return true;
		else
			return false;
	}
//	boolean contains(Rectangle r) {
//		if()
//	}
	void show() {
		System.out.println("("+x+","+y+")"+"에서 크기가"+width+"x"+height+"인 사각형");
	}
	
	public static void main(String[] args) {
		Rectangle a = new Rectangle(3, 3, 6, 6);
		Rectangle b = new Rectangle(4, 4, 2, 3);
		
		a.show();
		if(a.isSquare()) System.out.println("a는 정사각형입니다.");
		else System.out.println("a는 직사각형입니다.");
//		if(a.contains(b)) System.out.println("a는 b를 포함합니다.");
	}

}
