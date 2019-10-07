package Lesson001.Chapter06;

import java.util.Scanner;

public class Ex6_2 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int max=0,min=Integer.MAX_VALUE;
		int value;
		for (int i = 0; i < 5; i++) {
			System.out.printf("請輸入 第%d 個 整數 => ",i+1);
			value=keyin.nextInt();
			max=Max(max,value);
			min=Min(min,value);
		}
		System.out.printf("\n最大數值是 %d\n",max);
		System.out.printf("\n最小數值是 %d\n",min);

	}

	private static int Min(int min, int value) {
		// TODO Auto-generated method stub
		return (min<value)?min:value;
	}

	private static int Max(int max, int value) {
		// TODO Auto-generated method stub
		return (max>value)?max:value;
	}

}
