package Lesson001.Chapter04;

import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double value=0,squre=0;
		System.out.printf("請輸入一個浮點數 =>");
		value=in.nextDouble();
		if (value>0) {
			squre=Math.sqrt(value);
			System.out.printf("%.2f 的平方根值為  = %.2f\n\n",value,squre);
		}
		System.out.println("程式最後結束了");
	}

}
