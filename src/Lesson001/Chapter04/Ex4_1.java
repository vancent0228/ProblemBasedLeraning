package Lesson001.Chapter04;

import java.util.Scanner;

public class Ex4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int total,sum1,sum2,sum3,value;
		int item1,item2,item3;
		
		System.out.printf("百事可樂(每瓶 15 元) 購買數量 =>");
		item1=in.nextInt();sum1=item1*15;
		
		System.out.printf("國民便當(每盒 45 元) 購買數量 =>");
		item2=in.nextInt();sum2=item2*45;
		
		System.out.printf("約翰走路(每瓶 312 元) 購買數量 =>");
		item3=in.nextInt();sum3=item3*312;
		
		total=sum1+sum2+sum3;
		System.out.printf("\n*** 列印購物清單 ***\n");
		System.out.printf("------------------------------------\n");
		System.out.printf("|  品名   \t|   單價\t|   數量\t|   小計\t|\n");
		System.out.printf("------------------------------------\n");
		System.out.printf("|百事可樂\t|   15\t|   %d\t|   %d\t|\n",item1,sum1);
		System.out.printf("|國民便當\t|   45\t|   %d\t|   %d\t|\n",item2,sum2);
		System.out.printf("|約翰走路\t|   312\t|   %d\t|   %d\t|\n",item3,sum3);
		System.out.printf("------------------------------------\n");
		System.out.printf("|  總計  \t|   %d\t|   \t|   \t|\n",total);
		System.out.printf("------------------------------------\n");
	}

}
