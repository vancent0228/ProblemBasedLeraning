package Lesson002.Chapter04;

import java.util.Scanner;

public class Ex4_4 {
	static int num[] = new int[50];
	static int point;

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		point = -1;
		int select, k, item;
		for (int i = 0; i < 30; i++) {
			num[i] = (i + 1) * 2;
			point = point + 1;
		}
		do {
			disp_menu();
			select = keyin.nextInt();
			switch (select) {
			case 1:
				disp_array();
				break;
			case 2:
				if (point >= 50) {
					System.out.printf("陣列已滿無法插入!!\n");
				} else {
					System.out.printf("請輸入欲插入元素 => ");
					item = keyin.nextInt();
					point = point + 1;
					k = point;
					while (true) {
						if (num[k - 1] > item) {
							num[k] = num[k - 1];
							k = k - 1;
						} else {
							break;
						}
						num[k] = item;
					}
				}
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.printf("輸入錯誤!! 請重新輸入\n");
				break;
			}

		} while (select != 3);
	}

	private static void disp_array() {
		System.out.printf("\n==目前序陣列有 %d 筆資料==\n",point+1);
		for (int i = 0; i <= point; i++) {
			System.out.printf("%2d ",num[i]);
			if ((i+1)%10==0) System.out.printf("\n");
		}
		System.out.printf("\n");
	}

	private static void disp_menu() {
		System.out.printf("==歡迎光臨 有序陣列管理系統==\n");
		System.out.printf("(1) 列印有序陣列內容\n");
		System.out.printf("(2) 插入陣列元素\n");
		System.out.printf("(3) 離開系統\n");
		System.out.printf("\t請輸入工作選項 => ");
	}

}
