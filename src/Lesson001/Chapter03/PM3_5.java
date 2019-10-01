package Lesson001.Chapter03;

import java.util.Scanner;

public class PM3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float value_F,value_C;
		Scanner in = new Scanner(System.in);
		System.out.printf("*** 攝氏/華氏溫度轉換工具 ***\n");
		System.out.printf("請輸入華氏溫度 => ");
		value_F=in.nextFloat();
		value_C=(value_F-32)*5f/9f;
		System.out.printf("華氏溫度 %.2f 度 = 攝氏溫度 %.2f 度",value_F,value_C);
		System.out.printf("\n\n請輸入攝氏溫度 => ");
		value_C=in.nextFloat();
		value_F=32f+(9f*value_C)/5f;
		System.out.printf("攝氏溫度 %.2f 度 = 華氏溫度 %.2f 度",value_C,value_F);
	}

}
