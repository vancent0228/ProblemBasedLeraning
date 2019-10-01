package Lesson001.Chapter03;

import java.util.Scanner;

public class PM3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float times,hour,minute,second,total,units;
		Scanner in = new Scanner(System.in);
		System.out.printf("*** 手機通話費計算工具 ***\n");
		System.out.printf("\n請輸入通話時間(時 分 秒) => ");
		hour=in.nextFloat();
		minute=in.nextFloat();
		second=in.nextFloat();
		
		times=(hour*60f+minute)*60f+second;
		System.out.printf("\n通話時間總共 %.0f 秒\n",times);
		System.out.printf("\n請輸入每秒計費(如 0.5) => ");
		units=in.nextFloat();
		total=units*times;
		System.out.printf("\n通話費總共 %.0f 元\n",total);
		
		
		
		
	}

}
