package r11;

class ArrayUtill {
	public static int[] concat(int[] a,int[] b) {
		/*배열 a와 b를 연결한 새로운 배열 리턴*/
		int[] c = new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i] = a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		return c;
	}
	
	public static void print(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}

public class StaticEx{
	public static void main(String[] args) {
		int[] array1 = {1,5,7,9};
		int[] array2 = {3,6,-1,100,7};
		int[] array3 = ArrayUtill.concat(array1, array2);
		ArrayUtill.print(array3);
	}
}