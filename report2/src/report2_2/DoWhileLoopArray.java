package report2_2;

public class DoWhileLoopArray {

	public static void main(String[] args) {
		int n[] = {1,-2,6,20,5,72,-16,256},i=0;
		do {
			if(n[i]%4==0) {
				System.out.print(n[i]+" ");
				i++;
			}
			i++;
		} while (i<n.length);
	}

}
