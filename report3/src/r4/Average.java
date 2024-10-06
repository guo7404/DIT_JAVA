package r4;

public class Average {
	int[] nextIndex = new int[10];
	int index = 0;
	int count = 0;
	
	void showAll() {
		for(int i=0;i<count;i++) {
			System.out.print(nextIndex[i]+" ");
		}
	}
	void put(int num) {
		if(index<nextIndex.length) {
			this.nextIndex[index] = num;
			index++;
			count++;
		}
	}
	
	int getAvg() {
		int sum = 0;
		for(int i=0;i<count;i++) {
			sum += nextIndex[i];
		}
		return sum/count;
	}
	
	public static void main(String[] args) {
		Average avg = new Average();
		avg.put(100);
		avg.put(15);
		avg.put(100);
		avg.showAll();
		System.out.println("평균은 "+avg.getAvg());
	}

}
