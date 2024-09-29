package report2;

import java.util.Scanner;

public class report1 {

	public static void main(String[] args) {
		System.out.print("냉장고 상태 입력 >> ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		byte status = Byte.parseByte(str, 2);

		if ((status & 0b00000001) != 0)
			System.out.print("전원 켜져있음. ");
		else
			System.out.print("전원 꺼져 있음. ");
		if ((status & 0b00000010) != 0)
			System.out.print("문 닫혀 있음. ");
		else
			System.out.print("문 열려 있음. ");
		if ((status & 0b00000100) != 0)
			System.out.print("전구 정상 작동. ");
		else
			System.out.print("전구 정상 작동. ");
		if ((status & 0b00001000) != 0)
			System.out.print("냉장고 온도 3도 미만 ");
		else
			System.out.print("냉장고 온도 3도 이상. ");
		scanner.close();
	}

}
