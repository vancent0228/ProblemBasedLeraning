package Lesson001.Chapter05;

import java.util.Scanner;

public class PM5_6 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int height = 0;
		System.out.printf("請輸入等邊三角形 高度 => ");
		height = keyin.nextInt();
		//1 
		System.out.printf("畫出左邊的等邊三角形高度: \n");
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
		
		//2
		System.out.printf("畫出反向左邊的等邊三角形高度: \n");
		for (int i = 1; i <= height; i++) {

			System.out.printf("%2d", i);

			for (int j = 0; j < i-1; j++) {
				System.out.printf(" ");
			}
			for (int j = 0; j < (height - i)+1; j++) {
				System.out.printf("*");
			}

			System.out.printf("\n");
		}
		//3 
		System.out.printf("畫出右邊的等邊三角形高度: \n");
		for (int i = 1; i <= height; i++) {
			
			System.out.printf("%2d", i);

			for (int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			
			System.out.printf("\n");
		}
		
		//4
		System.out.printf("畫出反向右邊的等邊三角形高度: \n");
		for (int i = 1; i <= height; i++) {

			System.out.printf("%2d", i);

			for (int j = 0; j < (height - i)+1; j++) {
				System.out.printf("*");
			}

			System.out.printf("\n");
		}

	}

}
