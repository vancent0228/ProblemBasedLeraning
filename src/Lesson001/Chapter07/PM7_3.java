package Lesson001.Chapter07;

import java.util.Scanner;

public class PM7_3 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.printf("\n請輸入大德先生/小姐 姓名 => ");
		String name=keyin.nextLine();
		System.out.printf("\n請輸入捐款金額 => ");
		int value=keyin.nextInt();
		String bigMon=getBigMon(value);
		System.out.printf("\n\n列印收據如下: \n");
		System.out.printf("****真自在遊民收容所\t捐款收據****\n\n");
		System.out.printf("感謝  %s 先生/小姐 大德贊助\n",name);
		System.out.printf("捐款 %d 元整\n",value);
		System.out.printf("總計 = %s整\n",bigMon);
		

	}

	private static String getBigMon(int value) {
		String chinese[] = {"零","壹","貳","參","肆","伍","陸","柒","捌","玖"};
		String doll[]= {"仟","佰","拾","萬","仟","佰","拾","元"};
		int[] num=new int[9];
		int base=10000000;
		int value1=value;
		for (int i = 0; i < 8; i++) {
			num[i]=value1/base;
			value1=value1%base;
			base=base/10;
		}
		String str="";
		for (int i=0;i<8;i++) {
			str=str.concat(chinese[num[i]]).concat(doll[i]);
		}
			
		return str;
	}

}
