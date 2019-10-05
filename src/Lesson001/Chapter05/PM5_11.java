package Lesson001.Chapter05;

import java.util.Scanner;

public class PM5_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int save; 
		System.out.printf("***退休金試算表(請提早準備)***\n");
		System.out.printf("假設60歲退休、活到80歲退休生活\n");
		System.out.printf("退休后每月生活費、幾歲開始儲存、每月應存金額\n");
		System.out.printf("\t\t2 萬\t3 萬\t4 萬\t5 萬");
		for (int i = 30; i <= 45; i+=5) {
			System.out.printf("\n\t%d 歲",i);
			for (int j = 2; j <= 5; j++) {
				System.out.printf("\t%.2f",(double)(20*j)/(60-i));
			}
		}
	}
}
