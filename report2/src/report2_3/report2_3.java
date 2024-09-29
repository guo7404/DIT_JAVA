package report2_3;

import java.util.Scanner;

public class report2_3 {//미완
	
	public static void main(String [] args) {
		System.out.print("양의 정수 입력 : ");
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
			for(int i=s;i>0;i--) {
				for(int j=0;j<s;j++) {
					System.out.print("* ");
				}
			System.out.println();
			s--;
			}
	}
}
