package Lesson001.Chapter02;

import java.util.Scanner;

public class Ex2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner(System.in);
		int value;
		System.out.print("請輸入一個整數 => ");
		value=keyin.nextInt();
		System.out.printf("\t10 進位表示 =%d\n",value);
		System.out.printf("\t16 進位表示 =%X\n",value);
		System.out.printf("\t8 進位表示 =%o\n",value);
		System.out.printf("\t 浮點數表示 =%.2f\n",(float)value);
	}

}
