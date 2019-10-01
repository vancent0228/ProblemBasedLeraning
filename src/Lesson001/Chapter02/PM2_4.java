package Lesson001.Chapter02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PM2_4 {

	public static void main(String[] args) throws IOException {
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));

		final float PRICE = 28.50F;
		final String oilName = "95 無鉛";
		int qty, sum;

		System.out.printf("目前 " + oilName + " 汽油每公升 " + PRICE + " 元\n");
		System.out.printf("請輸入加油數量 =>");
		qty = Integer.parseInt(keyin.readLine());
		sum=Math.round(qty * PRICE);
		System.out.printf("應收金額  = " + sum);

	}

}
