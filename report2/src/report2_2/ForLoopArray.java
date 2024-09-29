package report2_2;

public class ForLoopArray {

	public static void main(String[] args) {
		int n[] = {1,-2,6,20,5,72,-16,256};
		for(int i=0;i<n.length;i++) {
			if(n[i]>0&&n[i]%4==0) {
				System.out.print(n[i]+" ");
			}
		}
	}

}
//배열의 실수값을 4로 나눠 나머지가 0이되는 4의배수를 출력하는 코드 / 20 72 256