package Lesson001.Chapter04;

import java.util.Scanner;

/*
	BMI值計算公式:    BMI = 體重(公斤) / 身高2(公尺2)
	例如：一個52公斤的人，身高是155公分，則BMI為 :
	52(公斤)/1.552 ( 公尺2 )= 21.6
	體重正常範圍為  BMI=18.5～24
 */
public class Ex4_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final double base=18d,height=24d;
		double toll,weight,bmi;
		
		System.out.printf("=== 歡迎使用 BMI 評估系統 (18~24) ===\n\n");
		System.out.printf("請輸入客戶身高(公分) => ");
		toll=in.nextDouble()/100;
		System.out.printf("請輸入客戶體重(公斤) => ");
		weight=in.nextDouble();
		bmi=weight/(toll*toll);
		
		System.out.printf("\n\n客戶 BMI = %.4f\n",bmi);
		
		if (bmi<=base)
			System.out.printf("\n您身材太瘦了，需要增胖\n");
		else if (bmi>=height)
			System.out.printf("\n您身材太胖了，需要減重\n");
		else
			System.out.printf("\n恭喜您有一個健美體材\n");
		
		System.out.println("\n== 系統結束，歡迎再次光臨 ==\n");
		


	}

}
