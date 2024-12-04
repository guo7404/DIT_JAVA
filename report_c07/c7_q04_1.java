package report_c07;

import java.util.HashMap;
import java.util.Scanner;
//쇼핑후 전체경비를 계산하는 프로그램 작성 
public class c7_q04_1 {
	public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?"); // 정수 또는 소수 확인
    }
	
	private static void ItmesNprices(HashMap<String, Integer> items) {
		//구입가능한 품목과 가격을 저장해두고 사용자가 구입한물건들의 전체 가격 계산
		items.put("고추장", 3000);
        items.put("만두", 500);
        items.put("새우깡", 1500);
        items.put("콜라", 600);
        items.put("참치캔", 2000);
        items.put("치약", 1000);
        items.put("연어", 2500);
        items.put("삼겹살", 2500);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		HashMap<String, Integer> items = new HashMap<>();
		
		ItmesNprices(items);

		int totalCost = 0;
		
		System.out.println("쇼핑 비용을 계산해드립니다. 구입 가능 물건과 가격은 다음과 같습니다.");
		System.out.println(items);
		while(true) {
			System.out.println("물건과 개수를 입력하세요 (종료하려면 그만입력) >> ");
			String input = scanner.nextLine();
			if(input.equals("그만")) {
                break;
			}
			String[] tokens = input.split(" ");
			for(int i=0;i<tokens.length;i+=2) {
	            String itemName = tokens[i]; // 물건 이름
	            int quantity = Integer.parseInt(tokens[i+1]); // 개수
	            
	            if(items.containsKey(itemName)) {
	            	int itemPrice = items.get(itemName);
	            	totalCost += itemPrice*quantity;
	            }
//			
			}
            System.out.println("총 비용은 "+totalCost+"원 입니다.");
		}
		scanner.close();
	}

}
