package report_c07;

import java.util.Scanner;
import java.util.Vector;

public class c7_q01 {
	private static int findMinValue(Vector<Integer> numbers) {
        int min = numbers.get(0);
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> numbers = new Vector<>();
		System.out.println("양의정수 입력 (-1 입력시 종료) >> ");
		while(true) {
			int input = scanner.nextInt();
			if(input == -1)
				break;
			numbers.add(input);
		}
		int minValue = findMinValue(numbers);
        System.out.println("가장 작은 수: " + minValue);
        scanner.close();
		
	}
}
