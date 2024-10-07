package r14;

public class VArray {
	int[] array;
	int capacity;//배열의 용량
	int size; //배열에 들어있는 값
	
	public void VArray(int capacity) {
		this.array = new int [capacity];
		this.capacity = capacity;
		this.size = 0;
	}
	
	int capcity() {
		return this.capacity;
	}
	
	int size() {
		return this.size;
	}
	
	void add(int num) {
		
	}
	
	void insert(int index,int num) {
			array[index] = num;
	}
	
	void remove(int index) {
		array == 10;
	}
	
	void printAll() {
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]+" ");
	}
	
}
public class VArray {
	
	public static void main(String[] args) {
		 VArray v = new VArray(5);//5개의 정수를 저장하는 가변 배열 객체 생성
		 System.out.println("용량"+v.capcity()+", 저장된 개수: "+v.size());
		 
		 for(int i=0;i<7;i++)//7개 저장
			 v.add(i);//배열에 순서대로 정수 i값 저장
		 System.out.println("용량"+v.capcity()+", 저장된 개수: "+v.size());
		 v.printAll();
		 
		 v.insert(3,100);//배열의 인덱스 3에 100삽입
		 v.insert(5,200);//배열의 인덱스 5에 200삽입
		 System.out.println("용량"+v.capcity()+", 저장된 개수: "+v.size());
		 v.printAll();
		 
		 v.remove(10); //배열의 인덱스 10의 정수 삭제
		 System.out.println("용량"+v.capcity()+", 저장된 개수: "+v.size());
		 v.printAll();
		 
		 for(int i=50;i<55;i++)//5개 저장
			 v.add(i); //배열에 순서대로 정수 i값 저장
		 System.out.println("용량"+v.capcity()+", 저장된 개수: "+v.size());
		 v.printAll();
	}

}