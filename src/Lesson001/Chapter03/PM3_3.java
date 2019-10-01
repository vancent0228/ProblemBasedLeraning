package Lesson001.Chapter03;

import java.util.Scanner;

public class PM3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner(System.in);
		int total=50,hits=15;
		int numbers=0,bingles=0;
		float batting=(float)hits/total;
		for (int i = 0; i < 2; i++) {
		System.out.printf("目前打擊=%d數  安打=%d、打擊率是 %.4f\n",total,hits,batting);
		System.out.printf("\t請輸入第%d場 (打擊次數  安打次數) => ",i+1);
		numbers=keyin.nextInt();
		bingles=keyin.nextInt();
		total+=numbers;
		hits+=bingles;
		batting=(float)hits/total;
		}
		System.out.printf("目前打擊=%d數  安打=%d、打擊率是 %.4f\n",total,hits,batting);

	}

}
