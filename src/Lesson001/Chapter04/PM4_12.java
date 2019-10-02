package Lesson001.Chapter04;

import java.util.Scanner;

public class PM4_12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testMid,testEnd,testCom,score;
		char ans;
		
		System.out.printf("請輸入期中考成績 (30%%) => ");
		testMid=in.nextInt();
		System.out.printf("請輸入期未考成績 (30%%) => ");
		testEnd=in.nextInt();
		System.out.printf("請輸入平常成績 (40%%) => ");
		testCom=in.nextInt();
		
		score=(int)(testMid*0.3+testEnd*0.3+testCom*0.4);
		if (score>=90) ans='A';
		else if (score>=80 && score<90) ans='B';
		else if (score>=70 && score<80) ans='C';
		else if (score>=60 && score<70) ans='D';
		else ans='E';	
		
		System.out.printf("\n\n\t總成績 %d分 評量為 %c",score,ans);

	}

}
