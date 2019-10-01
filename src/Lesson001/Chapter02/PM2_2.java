package Lesson001.Chapter02;

import java.text.DecimalFormat;

public class PM2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price1, price2, num1, num2; // 宣告整數變數
		String name1, name2; // 宣告字串變數
		name1 = "酥餅";
		price1 = 50;
		num1 = 20;
		name2 = "脆笛酥";
		price2 = 30;
		num2 = 100;

		int sum1 = price1 * num1;
		int sum2 = price2 * num2;
		// 建構時決定資料輸出格式
		// #字號當為小數後面為0時會自動去除
		DecimalFormat formatter = new DecimalFormat("'新台幣NT$'#,###,###");

		System.out.printf("品名\t數量\t單價\t小計\n");
		System.out.printf("============================\n");
		System.out.printf("%s\t%d\t%d\t%d\n", name1, num1, price1, sum1);
		System.out.printf("%s\t%d\t%d\t%d\n", name2, num2, price2, sum2);
		System.out.printf("============================\n");
		System.out.printf("總計 = %s\n", formatter.format(sum1 + sum2));

	}

}
