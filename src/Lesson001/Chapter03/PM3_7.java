package Lesson001.Chapter03;

import java.util.Scanner;

public class PM3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		final String[] symptoms= {"發燒","筋骨酸痛","感冒","嗜睡"};
		final int[] weights= {8,6,4,3};
		
		int sum=0,val=0,weight=0;
		float value=0;
		
		System.out.printf("*** 登革熱自我診斷系統 ***\n");
		System.out.printf("請輸入各種症狀明顯度如何 (0~10)\n");
		System.out.printf("\t如: 不明顯(0),稍明顯(4),明顯(6),很明顯(10)\n");
		
		for (int i = 0; i < weights.length; i++) {
			do {
				System.out.printf("\n請輸入"+symptoms[i]+"症狀明顯否(0~10) =>");
				val=in.nextInt();
			} while (!(val>=0 && val<=10));
			sum+=val*val*weights[i];
			weight+=weights[i];
		}
		
		value=(float)Math.sqrt(sum/(double)weight);
		System.out.printf("\n您感染登革熱指數為(0~10) = %.2f",value);
		

	}

}
