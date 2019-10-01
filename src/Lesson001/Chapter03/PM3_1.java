package Lesson001.Chapter03;

import java.util.Scanner;

public class PM3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner(System.in);
		String[] kes= {"電腦概論","程式設計","離散數學","國文","英文"};
		int[] fens= {2,3,3,2,2};
		int value=0,sum=0;
		double ave;
		for (int i = 0; i < fens.length; i++) {
			System.out.printf("請輸入"+kes[i]+"成績("+fens[i]+") => ");
			value=keyin.nextInt();
			sum+=value*fens[i];
		}
		ave=sum/12.0f;
		System.out.printf("學期總平均分數 =%.2f\n",ave);
		System.out.printf("四捨五入后成績 =%d\n",Math.round(ave));
	}

}
