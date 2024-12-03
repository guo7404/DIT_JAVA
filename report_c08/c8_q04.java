package report_c08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class c8_q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath = "C:/windows/system.ini";
		System.out.println(filepath+" 파일을 읽어 출력합니다.");
		try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
			String line;
			int num =1;
			while((line = reader.readLine())!=null) {
				System.out.println(num+" : "+line);
				num++;
			}
		}catch(IOException e) {
			
		}
	}

}
