package Lesson001.Chapter02;

import java.util.Scanner;

public class PM2_6 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		double x,y1,y2;
		System.out.printf("方程式計算工具\n");
		System.out.printf("請輸入變數 x 的數值 =>");
		x=keyin.nextDouble();
		y1=4*x*x+3*x+2;
		y2=x*x+1;
		System.out.printf("4*x*x+3*x+2 = %.2f \n",y1);
		System.out.printf("x*x+1=%.2f \n",y2);
		
		
	}
}
