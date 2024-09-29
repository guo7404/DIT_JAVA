package report2_1;

public class WhileLoop {

	public static void main(String[] args) {
		int sum =0, i=1;
		while(true) {
			if(i>50)
				break;
			sum += i;
			i += 3;
			
		}
		System.out.println(sum);
	}
}
//(1)변수 i에 수를 3씩 계속 올리고 sum에 합함, i가 50이 넘으면 sum을 출력하고 종료/ 425
