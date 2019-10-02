package Lesson001.Chapter03;

import java.util.Scanner;

public class PM3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fanXian="東西南北";
		char[] fanXins=fanXian.toCharArray();
		int max=0,val=0;
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < fanXins.length; i++) {
			System.out.printf("請輸入%c方所擲數目 (3~18) => ",fanXins[i]);
			do {
				val=in.nextInt();
			} while (val<3 || val>18);
			max=Math.max(max, val);
		}
		System.out.println("最大數目 =>"+max);
	}

}
