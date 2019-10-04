package Lesson001.Chapter05;

public class Ex5_10 {

	public static void main(String[] args) {
		final int limit = 100;
		int prime;
		int i = 1;
		int count = 0;
		System.out.printf("列印出 1~100 間的質數如下:\n");
		while (i <= limit) {
			prime = 1;
			int j = 2;
			while (j <= i - 1) {
				if ((i % j) == 0) {
					prime = 0;
					break;
				}
				j++;
			}
			if (prime == 1) {
				System.out.printf("%d ", i);
				count++;
				if (count % 10 == 0) // 每10個數跳行
					System.out.printf("\n");
			}
			i++;
		}

	}

}
