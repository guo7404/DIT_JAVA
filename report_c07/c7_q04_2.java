package report_c07;

import java.util.ArrayList;
import java.util.Scanner;

public class c7_q04_2 {
	private static void itemsName(ArrayList<String> items) {
		//구입가능한 품목과 가격을 저장해두고 사용자가 구입한물건들의 전체 가격 계산
		items.add("고추장");
        items.add("만두");
        items.add("새우깡");
        items.add("콜라");
        items.add("참치캔");
        items.add("치약");
        items.add("연어");
        items.add("삼겹살");
	}
	private static void prices(ArrayList<Integer> price) {
		price.add(3000);
		price.add(500);
		price.add(1500);
		price.add(600);
		price.add(2000);
		price.add(1000);
		price.add(2500);
		price.add(2500);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> items = new ArrayList<String>();
		ArrayList<Integer>price = new ArrayList<Integer>();
		itemsName(items);
		prices(price);
		
		int itemsIndex = 0;

		System.out.println("쇼핑 비용을 계산해드립니다. 구입 가능 물건과 가격은 다음과 같습니다.");
		for(int i=0;i<items.size();i++) {
			System.out.println(items.get(i)+" "+price.get(i));
		}
		
		while(true) {
			int totalCost = 0;
			System.out.println("물건과 개수를 입력하세요 (종료하려면 그만입력) >> ");
			String input = scanner.nextLine();
			if(input.equals("그만")) {
                break;
			}
			String[] tokens = input.split(" ");
			for(int i=0;i<tokens.length;i+=2) {
				String itemName = tokens[i]; // 물건 이름
	            int quantity = Integer.parseInt(tokens[i+1]); // 개수
				for(int j=0;j<items.size();j++) {
					if(itemName.equals(items.get(j))) {
						 itemsIndex = items.indexOf(itemName);
					}
				}	            
				totalCost += price.get(itemsIndex)*quantity;
			}
			System.out.println("총 비용은 "+totalCost+"원 입니다.");

		}
		scanner.close();
	}

}
