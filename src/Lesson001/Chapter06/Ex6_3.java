package Lesson001.Chapter06;

import java.util.Random;
import java.util.Scanner;

public class Ex6_3 {

	public static void main(String[] args) {
		int maxNum;
		Scanner keyin=new Scanner(System.in);
		char[] str= {'東','南','西','北'};
		int num=0;
		maxNum=0;
		for (int i = 0; i < 4; i++) {
			System.out.printf("請 %c方 擲骰子 (按 Enter 鍵) =>",str[i]);
			keyin.nextLine();
			num=game();
			System.out.printf("%c方擲的是: %d\n",str[i],num);
			
			maxNum=Math.max(maxNum, num);
		}
		
		System.out.printf("\n\n擲出最大的是 = %d",maxNum);
		
	}

	private static int game() {
		Random random = new Random();
		int k, sum=0,ran;
		System.out.printf("\t擲出 => ");
		for (int i = 0; i < 3; i++) {
			ran=1+random.nextInt(6);
			System.out.printf("%d  ",ran);
			sum+=ran;
		}
		System.out.printf("\n");
		return sum;
	}

}
