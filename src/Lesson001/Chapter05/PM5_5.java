package Lesson001.Chapter05;

import java.util.Scanner;

public class PM5_5 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int height = 0;
		System.out.printf("請輸入等邊三角形 高度 => ");
		height = keyin.nextInt();

		for (int i = 1; i <= height; i++) {
			
			System.out.printf("%2d", i);

			for (int j = 0; j < (height - i); j++) {
				System.out.printf(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			
			System.out.printf("\n");
		}

	}

}
