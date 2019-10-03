package Lesson001.Chapter05;

import java.util.Scanner;

public class Ex5_3 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		long sum=0,pro=1,value,k;
		System.out.printf("請輸入一個整數 =>");
		value=keyin.nextLong();
		k=1;
		while(k<=value) {
			sum+=k;
			pro*=k;
			k++;
		}
		System.out.printf("1+2+3+4+...+%d=%d\n",value,sum);
		System.out.printf("1*2*3*4*...*%d=%d\n",value,pro);
	}

}
