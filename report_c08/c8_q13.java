package report_c08;

import java.io.File;
import java.util.Scanner;

public class c8_q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirPath = "c:/";
		Scanner scanner = new Scanner(System.in);
//		String newDirPath;
		while(true) {
			File dir = new File(dirPath);
			File[] files = dir.listFiles();

			System.out.println("["+dirPath+"]");
			for(File file : files) {
				String type;
				if(file.isFile())
					type = "file";
				else
					type = "dir";
				System.out.printf("%-10s %-30s %s%n",type,file.getName(),file.length()+"바이트");
				
			}
			System.out.print(">> ");
			String arrivalPoint = scanner.nextLine();
			if(arrivalPoint.equals("종료")) {
				break;
			}else if(arrivalPoint.equals("..")) {
				dirPath= dir.getParent();
			}else {
                dirPath = dirPath + arrivalPoint + (arrivalPoint.endsWith("/") ? "" : "/");
//                dirPath = newDirPath;
			}
		}
		scanner.close();
	}


}
