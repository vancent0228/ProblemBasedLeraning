package Lesson001.Chapter06;

import java.util.Scanner;

public class Ex6_5 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		long total,num;
		System.out.printf("請輸入一個整數 => ");
		num=keyin.nextLong();
		total=level(num);
		System.out.printf("1*2*3*...,%d=%d\n",num,total);
		

	}

	private static long level(long k) {
		long sum;
		if (k<=1) {
			return 1;
		}else {
			sum=k*level(k-1);
			System.out.printf("%d * level(%d-1)=%d\n",k,k,sum);
			return sum;
		}
		
	}

}
