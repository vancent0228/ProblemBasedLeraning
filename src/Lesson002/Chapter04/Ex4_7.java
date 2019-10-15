package Lesson002.Chapter04;

import java.util.Scanner;

public class Ex4_7 {
	static String Stack[] = new String[50];
	static int Top;
	
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		Top = -1;
		String step;
		String path[] = {"D0","D9","D8","D7","E7",
				"F7","G7","H7","I7","J7",
				"K7","K6","L6","L5","L4",
				"L3","L2","M2","N2","N3",
				"N4","N5","N6","N7","N8",
				"O8","P8","P7","P6","P5",
				"P4","P3","P2","P1","Q1"};
		int select;
		do {
			disp_menu();
			select=keyin.nextInt();
			switch (select) {
			case 1:
				disp_Stack();
				break;
			case 2:
				for (int i = 0; i < path.length; i++) {
					step=path[i];
					if (push(step)) {
						System.out.printf("%s ==>",step);
					}else {
						System.out.printf("目前路徑已滿請回頭!!\n");
						break;
					}
					if ((i+1)%5==0) System.out.printf("\n");
				}
				System.out.printf("總共走了 %d 路徑\n",Top+1);
				break;
			case 3:
				int k=0;
				while (Top>=0) {
					step=pop();
					System.out.printf("%s ==>",step);
					k++;
					if (k%5==0) System.out.printf("\n");
				}
				System.out.printf("\n回程路徑已結束\n");
				break;
			case 4:
				System.out.printf("\n謝謝使用\n");
				System.exit(0);
				break;
			default:
				System.out.printf("\n輸入錯誤!! 請重新輸入\n");
				break;
			}
			
		} while (true);
		}

	private static String pop() {
		String step=Stack[Top];
		Top--;
		return step;
	}

	private static boolean push(String step) {
		if (Top>50) {
			return false;
		}else {
			Top++;
			Stack[Top]=step;
			return true;
		}
	}

	private static void disp_Stack() {
		System.out.printf("\n==到目前經過 %d 個路徑==\n",Top+1);
		for (int i = 0; i <=Top; i++) {
			System.out.printf("(%2d)%s",i+1,Stack[i]);
			if ((i+1)%5==0)System.out.printf("\n");
		}
		
	}

	private static void disp_menu() {
		System.out.printf("\n==歡迎光臨 走迷宮演練==\n");
		System.out.printf("(1) 列印已走過的路線\n");
		System.out.printf("(2) 迷宮去程開始\n");
		System.out.printf("(3) 迷宮回程開始\n");
		System.out.printf("(4) 離開系統\n");
		System.out.printf("\t請輸入工作選項 ==> ");
	}
}
