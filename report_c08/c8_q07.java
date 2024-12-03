package report_c08;

import java.io.File;

public class c8_q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirPath = "c:/";
		
		File dir = new File(dirPath);
		
		File[] list = dir.listFiles();
		
		File largestFile = list[0];
		
		
		for(File file : list) {
			if(file.length()>largestFile.length()) {
				largestFile = file;
			}
		}
		System.out.println("가장 큰 파일은 "+largestFile.getName()+" / "+largestFile.length()+"byte");
//		System.out.println(largestFile.getName()+" "+largestFile.length());
	}

}
