package Lesson002.Chapter04;

import java.util.Random;
import java.util.Scanner;

public class Ex4_5 {
	static int course[][] = new int[50][7];
	static String name[] = { "學號", "國文", "英文", "數學", "理化", "自然", "平均" };
	static int point;

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		Random ran = new Random();
		int value;
		int select = 0;
		point = -1;
		int location;
		for (int i = 0; i < 10; i++) {
			course[i][0] = 1 + ran.nextInt(50);
			for (int j = 1; j <= 50; j++) {
				course[i][j] = 30 + ran.nextInt(70);
			}
			point = point + 1;
		}
		do {
			disp_menu();
			select = keyin.nextInt();
			switch (select) {
			case 1:
				disp_course();
				break;
			case 2:
				if (point >= 50) {
					System.out.printf("陣列已滿無法插入!!\n");
					
				}else {
					point=point+1;
					System.out.printf("請輸入學生學號(2位數)=>");
					
				}
				break;

			default:
				System.out.printf("輸入錯誤!! 請重新輸入\n");
			}
		} while (select != 7);

	}

	private static void disp_course() {
		// TODO Auto-generated method stub

	}

	private static void disp_menu() {
		// TODO Auto-generated method stub

	}

}
