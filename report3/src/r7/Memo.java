package r7;

public class Memo {
	private String name,time,content;//메모작성자,메모시점.메모텍스트
	
	boolean isSameName(Memo b) {//메모 작성자가 같으면 true 리턴, 아니면 false 리턴
		if(this.name == b.getName()) return true;
		else return false;
	};
	String getName() {//메모 작성자 이름 리턴
		return name;
	}
	void show() {//메모출력
		System.out.println(name+", "+time+" "+content);
	} 
	int length() {//메모 텍스트의 길이 리턴
		return content.length();
	}; 
	
	public Memo(String name,String time, String content) {
		this.name = name;
		this.time = time;
		this.content = content;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memo a = new Memo("유송연", "10:10", "자바 과제 있음");
		Memo b = new Memo("박채원", "10:15", "시카고로 어학 연수가요!");
		Memo c = new Memo("김경미","11:30","사랑하는 사람이 생겼어요.");
		
		a.show();
		if(a.isSameName(b)) System.out.println("동일한 사람입니다.");
		else System.out.println("다른 사람입니다.");
		System.out.println(c.getName()+"가 작성한 메모의 길이는"+c.length());
	}

}
