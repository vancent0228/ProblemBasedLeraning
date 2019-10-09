package Lesson002.Chapter04;

import java.util.Random;
import java.util.Scanner;

public class PM4_1 {
	
	static int num[]=new int[50];
	static int point;
	
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		Random random = new Random();
		int value;
		int select;
		point = -1;
		for (int i=0;i<30;i++) {
			value=random.nextInt(100);
			point=point+1;
			num[point]=value;
		}
		do {
			disp_menu();
			select = keyin.nextInt();
			switch (select) {
			case 1:
				disp_array();
				break;
			case 2:
				if (point>=50) {
					System.out.printf("陣列已滿無法插入!!\n");
				}else {
					System.out.printf("請輸入欲插入元素 => ");
					value=keyin.nextInt();
					point=point+1;
					num[point]=value;
				}
				break;
			case 3:
				System.out.printf("請輸入欲刪除元素 => ");
				value=keyin.nextInt();
				int location=Linear_serach(value);
				if (location == -1) {
					System.out.printf("陣列內沒有 %d 元素\n",value);
				}else {
					for (int i=location;i<=point;i++)
						num[i]=num[i+1];
				}
				point=point-1;
				break;
			case 4:
				break;

			default:
				System.out.printf("輸入錯誤 !! 請重新輸入\n");
				break;
			}
		} while (select != 4);
		
		
	}

	private static int Linear_serach(int value) {
		int flag=0;
		for (int i = 0; i < point; i++) {
			if (num[i]==value) {
				flag=1;
				return i;
			}
		}
		return -1;
	}

	private static void disp_array() {
		System.out.printf("\n==列印無序陣列內容\n");
		for (int i=0;i<=point;i++) {
			System.out.printf("%2d  ",num[i]);
			if ((i+1)%5==0) System.out.printf("\n");
		}
		System.out.printf("\n");
	}

	private static void disp_menu() {
		System.out.printf("==歡迎光臨 無序陣列管理系統==\n");
		System.out.printf("(1) 列印無序陣列內容\n");
		System.out.printf("(2) 插入陣列元素\n");
		System.out.printf("(3) 刪除陣列元素\n");
		System.out.printf("(4) 離開系統\n");
		System.out.printf("\t請輸入工作選項 => ");
	}

}
