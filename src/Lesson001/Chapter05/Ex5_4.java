package Lesson001.Chapter05;

import java.util.Scanner;

public class Ex5_4 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int total=0,cost;
		
		System.out.printf("歡迎光臨 == 春嬌柑仔店 == \n\n");
		do {
			System.out.printf("已購買 %d 請輸入產品價格 (0 結束) => ",total);
			cost=keyin.nextInt();
			total+=cost;
		} while (cost!=0);
		
		System.out.printf("人客您總共買 %d 元 謝謝!! 愛過來喔",total);
	}

}
