package report2;

import java.util.Scanner;

public class report2 {//미완

	public static void main(String[] args) {
		System.out.print("자동차 상태 입력 >> ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		byte status = Byte.parseByte(str, 10);

		if ((status & 0b10000000) == 0)
			System.out.print("자동차는 정지 상태이고 ");
		else
			System.out.print("자동차는 달리는 상태이고 ");
		if ((status & 0b01000000) == 0)
			System.out.print("에어컨이 꺼진 상태이고 온도는 ");
		else
			System.out.print("에어컨이 켜진 상태이고 온도는 ");
		if ((status & 0b00100000) == 0)
			System.out.print("도 이다.");
		else
			System.out.print("도 이다.");

	}

}
