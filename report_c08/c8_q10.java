package report_c08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class c8_q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String filePath = "c:/temp/phone.txt";
		HashMap<String, String> numRead	= new HashMap<>();
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			String line;
			while((line=reader.readLine()) != null) {
				String[] lines = line.split(" ");
				numRead.put(lines[0], lines[1]);
			}
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("예외 발생");
		}
		System.out.println(numRead);
		System.out.println("총 "+numRead.size()+"개의 전화번호를 읽었습니다.");
		while(true) {
			System.out.print("이름>> ");
			String name =scanner.nextLine();
			if(numRead.containsKey(name)!=true) {
				System.out.println("없는 이름");
			}else {
				System.out.println(numRead.get(name));
			}
			
			if(name.equals("그만"))
				break;
		}
		scanner.close();
	}

}
