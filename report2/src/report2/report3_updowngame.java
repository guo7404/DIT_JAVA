package report2;

import java.util.Random;
import java.util.Scanner;

public class report3_updowngame {//미완
	
	public static void main(String[] args) {
		Random r = new Random();
		int k = r.nextInt(100); //0~99까지의 임의의 정수 생성
		
		System.out.println("수를 결정하였습니다. 맞추어보세요.");
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			if(n > k) {
				System.out.println("더 낮게");
			}else if(n < k) {
				System.out.println("더 높게");
			}else {
				System.out.println("정답입니다!");
				break;
			}
		}
	}

}
