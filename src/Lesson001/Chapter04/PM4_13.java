package Lesson001.Chapter04;

import java.util.Scanner;

public class PM4_13 {

	public static void main(String[] args) {
		double hour, fee;
		Scanner in = new Scanner(System.in);
		
		System.out.printf("請輸入停車時間(小時) => ");
		hour=in.nextDouble();
		
		if (hour<0.5) {
			System.out.printf("\n 停車時間=%.1f 不足半小時不收費!!\n",hour);
		}else if (hour>=0.5 && hour<=2) {
			System.out.printf("\n 停車時間=%.1f 2小時以內皆為50元!!\n",hour);
		}else {
			hour=Math.ceil(hour);
			fee=50+(hour-2)*20;
			System.out.printf("\n 停車時間=%.1f 費用為:%.0f元!!\n",hour,fee);
		}

	}

}
