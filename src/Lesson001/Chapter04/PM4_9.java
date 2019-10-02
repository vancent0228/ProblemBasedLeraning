package Lesson001.Chapter04;

import java.util.Scanner;

public class PM4_9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float number=0,money=0;
		System.out.printf("請輸入公里數=>");
		number=in.nextFloat();
		if (number<=3f)
			money=70f;
		else
			money=70f+(int)((number-3f)/0.5f)*10f;
		
		System.out.printf("搭車費用為 => %.0f元",money);
	}

}
