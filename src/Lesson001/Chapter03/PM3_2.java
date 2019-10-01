package Lesson001.Chapter03;

import java.util.Scanner;

public class PM3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner(System.in);
		int total=0,recept,value,value1,handre,fifty,ten,five,one;
		String[] items= {"衛生紙","口香糖","可樂","熱狗"};
		int prices[] = {32,12,18,17};
		System.out.printf("**** 超商找錢工具 ****\n");
		for (int i = 0; i < prices.length; i++) {
			System.out.printf(items[i]+"(每包"+prices[i]+"元) 購買數量 =>");
			total+=prices[i]*keyin.nextInt();
		}
		System.out.printf("請輸入繳納金額(大於消費額 %d) => ",total);
		recept=keyin.nextInt();
		
		value=recept-total;
		value1=value;
		
		handre=value/100;
		value-=handre*100;
		
		fifty=value/50;
		value-=fifty*50;
		
		ten = value/10;
		value-=ten*10;
		
		five=value/5;
		value-=five*5;
		
		one=value;
		System.out.printf("應找金額 =%d 各種零錢數量如下:\n",value1);
		System.out.printf("\t100 元零錢 =%d 張\n",handre);
		System.out.printf("\t50 元硬幣 =%d 個\n",fifty);
		System.out.printf("\t10 元硬幣 =%d 個\n",ten);
		System.out.printf("\t5 元硬幣 =%d 個\n",five);
		System.out.printf("\t1 元硬幣 =%d 個\n",one);
		
	

	}

}
