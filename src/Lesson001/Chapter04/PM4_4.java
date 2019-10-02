package Lesson001.Chapter04;

import java.util.Scanner;

public class PM4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a, b, c, sum, pay;
		System.out.printf("購買全票張數 (250元)=>");
		a = in.nextInt();
		System.out.printf("購買優待票張數 (200元)=>");
		b = in.nextInt();
		System.out.printf("購買半票張數 (150元)=>");
		c = in.nextInt();

		sum = a * 250 + b * 200 + c * 150;
		System.out.printf("總計金額 => %d\n\n", sum);

		System.out.printf("請輸入客戶繳納金額 =>");
		pay = in.nextInt();

		System.out.printf("\n總計 %d, 繳納 %d 餘額 %d",sum,pay,pay-sum);
		if (pay >= sum) {
			int total,recept,value,value1,handre,fifty,ten,five,one;
			value=pay-sum;
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
			System.out.printf("\n\n應找金額 =%d 各種零錢數量如下:\n",value1);
			System.out.printf("\t100 元零錢 =%d 張\n",handre);
			System.out.printf("\t50 元硬幣 =%d 個\n",fifty);
			System.out.printf("\t10 元硬幣 =%d 個\n",ten);
			System.out.printf("\t5 元硬幣 =%d 個\n",five);
			System.out.printf("\t1 元硬幣 =%d 個\n",one);

		} else {
			System.out.printf("\n\n金額不足請下次再來，謝謝 !!");
		}

	}

}
