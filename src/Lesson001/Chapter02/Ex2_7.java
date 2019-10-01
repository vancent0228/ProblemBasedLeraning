package Lesson001.Chapter02;

import java.util.Scanner;

public class Ex2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner(System.in);
		String name;
		int age;
		double money;
		System.out.printf("請輸入客戶資料(姓名 年齡 消費金額) => ");
		name=keyin.next();
		age=keyin.nextInt();
		money=keyin.nextDouble();
		
		System.out.printf("客戶資料如下:\n");
		System.out.printf("客戶姓名: %s\n",name);
		System.out.printf("客戶年齡: %d\n",age);
		System.out.printf("消費金額: %.2f\n",money);
	}

}
