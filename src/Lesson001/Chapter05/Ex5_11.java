package Lesson001.Chapter05;

import java.util.Scanner;

public class Ex5_11 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int first,number,now=0,day;
		System.out.printf("請輸入該月 1 日星期幾 ( 1 ~ 7 ) => ");
		first=keyin.nextInt();
		System.out.printf("請輸入該月的天數 (28 ~ 31 ) => ");
		number=keyin.nextInt();
		System.out.printf("\tMon\tTue\tWed\tThu\tFri\tSat\tSun\n");
		for (int i = 0; i < first; i++) {
			System.out.printf("\t");
			now++;
		}
		day=1;
		while (day<=number) {
			System.out.printf("\t%d",day);
			now++;
			if (now%7 == 0) {
				System.out.printf("\n");
				now=0;
			}
			day++;
		}
		while (now<7) {
			System.out.printf("\t");
			now++;
		}
	}

}
