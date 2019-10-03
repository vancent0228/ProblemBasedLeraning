package Lesson001.Chapter05;

import java.util.Random;
import java.util.Scanner;

public class PM5_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random random=new Random();
		int value=0,value2=0,ran1=0,ran2=0,correct=0;
		for (int count = 1; count <= 10; count++) {
			ran1=1+random.nextInt(9);
			ran2=1+random.nextInt(9);
			value=ran1*ran2;
			System.out.printf("\n請輸入 %d * %d = ",ran1,ran2);
			value2=in.nextInt();
			if (value2==value)
				correct++;
			else
				System.out.printf("\n錯了!! 答案是 %d\n",value);
		}
		System.out.printf("\n您得到 %d 分",correct*10);

	}

}
