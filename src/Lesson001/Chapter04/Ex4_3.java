package Lesson001.Chapter04;

import java.util.Random;
import java.util.Scanner;

public class Ex4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random ra = new Random();
		int ran1, ran2, value1, value2;

		ran1 = 1 + ra.nextInt(9);
		ran2 = 1 + ra.nextInt(9);
		value1 = ran1 * ran2;

		System.out.printf("請輸入 %d * %d = ?? =>",ran1,ran2);
		value2 = in.nextInt();

		if (value1 == value2) {
			System.out.printf("\n答對了 您好棒 !!\n");
		} else {
			System.out.printf("\n答錯了正確答案是 %d 多加油哦 !!\n",value1);
		}

	}

}
