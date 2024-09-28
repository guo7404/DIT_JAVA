package report1;

import java.util.Scanner;

public class report1 {

	public static void main(String[] args) {
		System.out.print("$1=1200원입니다. 달러를 입력하세요>>");
		Scanner scanner = new Scanner(System.in);
		int doller = scanner.nextInt();
		System.out.println("$"+doller+"는 "+doller*1200+"원 입니다.");
		scanner.close();

	}

}
