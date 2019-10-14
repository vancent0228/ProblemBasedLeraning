package Lesson002.Chapter04;

import java.util.Random;
import java.util.Scanner;

public class PM4_3 {
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
			course[i][0] = (i + 1) * 2;
			;
			for (int j = 1; j <= 5; j++) {
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

				} else {
					int temp[] = new int[7];
					point = point + 1;
					System.out.printf("請輸入學生學號(2位數)=>");
					temp[0] = keyin.nextInt();
					System.out.printf("請輸入國文成績=>");
					temp[1] = keyin.nextInt();
					System.out.printf("請輸入英文成績=>");
					temp[2] = keyin.nextInt();
					System.out.printf("請輸入數學成績=>");
					temp[3] = keyin.nextInt();
					System.out.printf("請輸入理化成績=>");
					temp[4] = keyin.nextInt();
					System.out.printf("請輸入自然成績=>");
					temp[5] = keyin.nextInt();

					int k = point;
					while (true) {
						if (k == 0) {
							break;
						} else if (course[k - 1][0] > temp[0]) {
							course[k] = course[k - 1];
							k = k - 1;
						} else {
							break;
						}
					}
					course[k] = temp;
				}

				System.out.printf("\n目前學生人數為 %d\n", point);
				break;
			case 3:
				System.out.printf("請輸入欲刪除學生學號 => ");
				value = keyin.nextInt();
				location = Line_serach(value);
				if (location == -1) {
					System.out.printf("\n沒有學號=%d 學生\n", value);
				} else {
					for (int i = location; i <= point; i++) {
						course[i] = course[i + 1];
					}
					point = point - 1;
					System.out.printf("\n%d 學生已刪除成功\n", value);
					System.out.printf("\n目前學生人數為 %d\n", point);
				}
				break;
			case 4:
				System.out.printf("請輸入查詢學號 => ");
				value = keyin.nextInt();
				location = Line_serach(value);
				if (location == -1) {
					System.out.printf("\n沒有學號=%d 學生\n", value);
				} else {
					for (int i = 0; i <= 6; i++) {
						System.out.printf("%s=%d\n", name[i], course[location][i]);
					}
					System.out.printf("\n");
				}
				break;
			case 5:
				System.out.printf("請輸入欲更新成績的學號 => ");
				value = keyin.nextInt();
				location = Line_serach(value);
				if (location == -1) {
					System.out.printf("\n沒有學號=%d 學生\n", value);
				} else {
					System.out.printf("更新 %d 學生的成績\n", course[location][0]);
					for (int i = 1; i <= 5; i++) {
						System.out.printf("請更新 %s 成績", name[i]);
						course[location][i] = keyin.nextInt();
					}
				}
				break;
			case 6:
				int sum;
				for (int i = 0; i <= point; i++) {
					sum = 0;
					for (int j = 1; j <= 5; j++) {
						sum += course[i][j];
					}
					course[i][6] = sum / 5;
				}
				buffer_sort();
				disp_course();
				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.printf("輸入錯誤!! 請重新輸入\n");
				break;
			}
		} while (select != 7);

	}

	private static void buffer_sort() {
		int temp[] = new int[7];
		for (int i = 0; i <= point; i++) {
			for (int j = i; j <= point; j++) {
				if (course[i][6] < course[j][6]) {
					temp = course[i];
					course[i] = course[j];
					course[j] = temp;
				}
			}

		}

	}

	private static int Line_serach(int value) {
		int location = -1;
		for (int j = 0; j <= point; j++) {
			if (value == course[j][0]) {
				location = j;
				break;
			}
		}
		return location;
	}

	private static void disp_course() {
		System.out.printf("\n==列印全班各科成績==\n");
		for (int i = 0; i < name.length; i++) {
			System.out.printf("%s\t", name[i]);
		}
		System.out.printf("\n");

		for (int i = 0; i <= point; i++) {
			for (int j = 0; j < course[i].length; j++) {
				System.out.printf("%d\t", course[i][j]);
			}
			System.out.printf("\n");
		}
	}

	private static void disp_menu() {
		System.out.printf("==三民國中 張老師成績管理系統==\n");
		System.out.printf("(1) 列印全班成績\n");
		System.out.printf("(2) 新增學生成績\n");
		System.out.printf("(3) 刪除學生成績\n");
		System.out.printf("(4) 查詢學生成績\n");
		System.out.printf("(5) 更新學生成績\n");
		System.out.printf("(6) 依平均成績高低列印\n");
		System.out.printf("(7) 離開系統\n");
		System.out.printf("\t請輸入工作選項 => ");

	}

}
