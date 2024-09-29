package report2_3;

import java.util.Scanner;

public class report2_5 {

	public static void main(String[] args) {
		int ar[] = new int[10];

		Scanner scanner = new Scanner(System.in);
        System.out.println("양의 정수 10개 입력>> ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        System.out.print("3의 배수는...");
        for(int i=0;i<ar.length;i++) {
        	if(ar[i]%3==0) {
        		System.out.print(ar[i]+" ");
        	}
        }
		scanner.close();
	}

}
