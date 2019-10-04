package Lesson001.Chapter05;

import java.util.Scanner;

public class Ex5_8 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int height;
		int wide;

		System.out.printf("請輸入矩形 高度 => ");
		height = keyin.nextInt();
		System.out.printf("請輸入矩形 寬度 => ");
		wide = keyin.nextInt();
		System.out.printf("\n\n");
		for (int i = 0; i < height; i++) {
			System.out.printf("\t");
			for (int j = 0; j < wide; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}

	}

}
