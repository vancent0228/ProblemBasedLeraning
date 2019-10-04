package Lesson001.Chapter05;

import java.util.Random;
import java.util.Scanner;

public class PM5_9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random ra =new Random();
		
		int base=1;
		int flag=1;
		int ran1,ran2,value,answer;
		
		System.out.printf("==歡迎進入心算過五關評量系統\n");
		for (int count = 1; count <=5; count++) {
			base*=5;
			ran1=ra.nextInt(base);
			ran2=ra.nextInt(base);
			value=ran1+ran2;
			System.out.printf("第 %d 關 輸入 %d + %d = ",count,ran1,ran2);
			answer=in.nextInt();
			if (answer != value) {
				System.out.printf("錯了!! 答案是 %d \n",value);
				System.out.printf("您已完成 第 %d 關\n",count-1);
				flag=0;
				break;
			}
		}
		if (flag==1) {
			System.out.printf("恭喜通過五關測試\n");
		}else {
			System.out.printf("加油!! 再來一次\n");
		}
			

	}

}
