package Lesson001.Chapter06;

import java.util.Random;
import java.util.Scanner;

public class Ex6_4 {
	//宣告類別變數 (整體變數) 
	static String maxName="",minName="";
	static int maxNum=0,minNum=Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
	    String name;
	    int number;
	    System.out.printf("===歡迎光臨大吃小擲骰子遊戲===\n\n");
	    System.out.printf("輸入姓名並擲骰子 (Enter 結束) => ");
	    name=keyin.nextLine();
	    while (name.length()!=0) {
			game(name);
			System.out.printf("領先者 %s 先生 %d 點\n",maxName,maxNum);
			System.out.printf("輸入姓名並擲骰子 (Enter 結束) => ");
			name=keyin.nextLine();
		}
	    System.out.printf("\n\n贏家 %s 先生 %d 點\n",maxName,maxNum);
	    System.out.printf("輸家 %s 先生 %d 點\n",minName,minNum);
	}
	
	static void game(String name) {
		Random random = new Random();
		int k, sum = 0, ran;
		System.out.printf("\t擲出 => ");
		for (int i = 0; i < 3; i++) {
			ran = 1 + random.nextInt(6);
			System.out.printf("%d  ", ran);
			sum += ran;
		}
		System.out.printf("  合計 : %d\n",sum);
		
		if (sum>maxNum) {
			maxName=name;
			maxNum=sum;
		}
		if (sum<minNum) {
			minName=name;
			minNum=sum;
		}
	}

}
