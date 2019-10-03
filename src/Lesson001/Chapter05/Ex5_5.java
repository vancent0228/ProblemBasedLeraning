package Lesson001.Chapter05;

public class Ex5_5 {

	public static void main(String[] args) {
		int count, limit = 100, sum = 0;
		count = limit;
		do {
			sum += count;
			count--;
		} while (count > 0);
		
		System.out.printf("\n%d+...+1=%d",limit,sum);

	}

}
