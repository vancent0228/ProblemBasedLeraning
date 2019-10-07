package Lesson001.Chapter07;

import java.util.Scanner;

public class Ex7_10 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int a[][],value,flag,low,high,mid;
		a=new int[50][2];
		int number= 411101;
		for (int i = 0; i < a.length; i++) {
			a[i][0]=number+i;
			a[i][1]=(int)(Math.random()*101);
		}
		
		//print all
		System.out.printf("===411101~411150成績列印===\n");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4d",a[i][1]);
			if ((i+1)%10==0) System.out.printf("\n");
			
		}
		
		//2 dived
		System.out.printf("請輸入欲尋找的學生學號 => ");
		value=keyin.nextInt();
		
		//seek
		low =0;high=49;mid=0;
		flag=0;
		while ((low=1)<high) {
			mid=(low+high)/2;
			if (value==a[mid][0]) {
				flag=1;
				break;
			}
			else if (value>a[mid][0])
				low=mid;
			else
				high=mid;
				
		}
		
		if (flag==1)
			System.out.printf("學號 %d 成績是 %d\n",a[mid][0],a[mid][1]);
		else
			System.out.printf("沒有 %d 學號學生\n",value);
		
	}

}
