package r2;

public class Cube {
	private int width, depth, height;
	
	public Cube(int width,int depth, int height) {
		this.width = width;
		this.depth = depth;
		this.height = height;
	}
	
	public int getVolume() {
		return width*depth*height;
	}
	
	public void increase(int width,int depth,int height) {
		this.width += width;
		this.depth += depth;
		this.height += height;
	}
	public boolean isZero() {
		return width* depth* height == 0;
	};
	
	
	public static void main(String[] args) {
		Cube cube = new Cube(0,0,0);//가로세로 높이가 1,2,3인 큐브 객체 생성
		System.out.println("큐브의 부피는"+cube.getVolume());
		cube.increase(1,2,3);//가로세로 높이 각각 1,2,3씩 증가
		System.out.println("큐브의 부피는 "+cube.getVolume());
		if(cube.isZero())
			System.out.println("큐브의 부피는 0");
		else
			System.out.println("큐브의 부피는 0이 아님");
		
	}

}
