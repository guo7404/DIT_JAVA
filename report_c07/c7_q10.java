package report_c07;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class c7_q10 {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> removeOverlap = new ArrayList<String>();
		while(true) {
			
			
			System.out.println("문자열들을 입력하세요 >>");
			String input = scanner.nextLine();
			if(input.equals("그만")) {
                break;
			}
			String[] splitList = input.split(" ");
			
			for(String text : splitList) {
				removeOverlap.add(text);
			}
	        Set<String> uniqueWordsSet = new LinkedHashSet<>(removeOverlap);
	        List<String> uniqueWords = new ArrayList<>(uniqueWordsSet);
	        
	        System.out.println(uniqueWords);
		}
		scanner.close();
	}
}
