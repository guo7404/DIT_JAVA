package report1;

import java.util.Scanner;

public class report3 {

	public static void main(String[] args) {
		System.out.println("*** 자바 분식입니다. 주문하면 금액을 알려드립니다. ***");
		System.out.print("떡볶이 몇인분 >>");
		Scanner scanner = new Scanner(System.in);
		int dduk = scanner.nextInt()*2000;
		System.out.print("김말이 몇인분 >>");
		Scanner scanner2 = new Scanner(System.in);
		int kim = scanner2.nextInt()*1000;
		System.out.print("쫄면 몇인분 >>");
		Scanner scanner3 = new Scanner(System.in);
		int zzol = scanner3.nextInt()*3000;
		int sum = dduk + kim + zzol;
		System.out.print("전체금액은 "+sum+"원 입니다.");
		scanner.close();
	}

}
