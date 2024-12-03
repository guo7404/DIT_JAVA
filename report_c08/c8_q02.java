package report_c08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class c8_q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "c:/temp/phone.txt";
		System.out.println(filePath+"를 출력합니다.");
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("예외발생");
		}
	}

}
