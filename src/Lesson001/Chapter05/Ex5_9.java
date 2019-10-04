package Lesson001.Chapter05;

public class Ex5_9 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%2d*%1d=%2d",j,i,i*j);
			}
			System.out.printf("\n");
		}

	}

}
