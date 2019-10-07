package Lesson001.Chapter06;

import java.util.Scanner;

public class Ex6_1 {

	//main 方法開始
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int sum;
		int value1,value2;
		System.out.printf("請輸入第一個整數 => ");
		value1=keyin.nextInt();
		System.out.printf("\n請輸入第二個整數 => ");
		value2=keyin.nextInt();
		
		//呼叫 Add() 函數
		sum=Add(value1,value2);
		System.out.printf("\n\n%d + %d = %d\n",value1,value2,sum);
	}

	private static int Add(int value1, int value2) {
		// TODO Auto-generated method stub
		int sum;
		sum=value1+value2;
		return sum;
	}

}
