package Lesson001.Chapter04;

import java.util.Scanner;

public class PM4_7 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int value=0;
		char chinese;
		System.out.println("== 歡迎使用數字轉換國字系統 ==");
		System.out.printf("請輸入一個整數數字 =>");
		value=keyin.nextInt();
		switch (value) {
		case 1:
			chinese='壹';
			break;
		case 2:
			chinese='貳';
			break;
		case 3:
			chinese='叁';
			break;
		case 4:
			chinese='肆';
			break;
		case 5:
			chinese='伍';
			break;
		case 6:
			chinese='陸';
			break;
		case 7:
			chinese='柒';
			break;
		case 8:
			chinese='捌';
			break;
		case 9:
			chinese='玖';
			break;
		case 0:
			chinese='零';
			break;

		default:
			System.out.println("輸入錯誤");
			return;
		}
		
		System.out.printf(" %d <=> %c",value,chinese);

	}

}
