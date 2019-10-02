package Lesson001.Chapter04;

import java.util.Scanner;

public class Ex4_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number,money=0;
		System.out.printf("請輸入使用度數 =>");
		number=in.nextInt();
		if (number<=20)
			money=150;
		else
			money=number*5;
		System.out.printf("\n\n應繳費用為 => %d 元\n",money);
	}

}
