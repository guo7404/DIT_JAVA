package r12;

import java.util.Scanner;

class Dictionary {
	private static String[] kor = {"사랑","아기","돈","미래","희망"};
	private static String[] eng = {"love","baby","money","future","hope"};
	public static String kor2Eng(String word) {
		/*검색 코드 작성*/
		String e = "";
		for(int i=0;i<kor.length;i++) {
			if(word.equals(kor[i]))
				e = eng[i];
		}
		return e;
	}
}

public class DicApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.println("한글 단어? ");
			String d = scanner.next();
			if(d.equals("그만")) {
				scanner.close();
				break;
			}else if(Dictionary.kor2Eng(d) == "") {
				System.out.println(d+"는 사전에 없는 단어입니다.");
			}else
				System.out.println(d+"는 "+	Dictionary.kor2Eng(d));
		}
	}
}