package report_c08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class c8_q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        String filePath = "c:/temp/phone.txt";
        
        System.out.println("전화번호 입력프로그램입니다.");
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true))){
        	while(true) {
        		System.out.println("이름 전화번호 입력>> ");
        		String input = scanner.nextLine();
        		
        		if(input.equals("그만")) {
        			break;
        		}
        		
        		writer.write(input);
        		writer.newLine();
        	}
        }catch (IOException e) {
        	System.out.println("예외 발생");
        }
        System.out.println(filePath+"에 저장하였습니다.");
        scanner.close();
	}

}
