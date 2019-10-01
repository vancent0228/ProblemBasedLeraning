package Lesson001.Chapter03;

import java.util.Scanner;

public class Ex3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin=new Scanner(System.in);
		float val1,val2,val3;
		float max,min;
		System.out.printf("*** 三個浮點數比較大小工具 ***\n");
		System.out.printf("請輸入三個浮點數(val1 val2 val3) => ");
		val1=keyin.nextFloat();
		val2=keyin.nextFloat();
		val3=keyin.nextFloat();
		max=Math.max(Math.max(val1,val2),val3);
		min=Math.min(Math.min(val1,val2),val3);
		System.out.printf("最大數 => %.2f\n",max);
		System.out.printf("最小數 => %.2f\n",min);
	}

}
