package Lesson001.Chapter07;

import java.util.Scanner;

public class PM7_7 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int score[][]= {
				{411101,70},
				{411102,80},
				{411103,75},
				{411104,90},
				{411105,85},
				{411106,65},
				{411107,83},
				{411108,78}};
		int flag=0;
		int num=0;
		System.out.printf("==成績查詢系統==\n\n");
		System.out.printf("請輸入學生學號 => ");
		num=keyin.nextInt();
		for (int i = 0; i < score.length; i++) {
			if (score[i][0]==num) {
				System.out.printf("\n學號=%d, 成績=%d",score[i][0],score[i][1]);
				flag=1;
				break;		
			}
		}
		if (flag==0) {
			System.out.printf("\n沒有學號 = %d 的資料",num);
		}
	}

}
