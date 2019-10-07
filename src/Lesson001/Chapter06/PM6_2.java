package Lesson001.Chapter06;

import java.util.Scanner;

public class PM6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.printf("==曼波舞步表演系統==\n\n");
		System.out.printf("請輸入表演級數 => ");
		int n=in.nextInt();
		
		for (int k=1;k<=n;k++) {
			System.out.printf("第 %d 階 舞步 => ",k);
			front_dance(k);
			back_dance(k);
			System.out.printf("\n");
		}
	}

	private static void back_dance(int k) {
		if (k<=1)
			System.out.printf("1 ");
		else {
			System.out.printf("%d ",k);
			back_dance(k-1);
		}
	}

	private static void front_dance(int k) {
		if (k<=1)
			System.out.printf("1 ");
		else {
			front_dance(k-1);
			System.out.printf("%d ",k);
		}
	}

}
