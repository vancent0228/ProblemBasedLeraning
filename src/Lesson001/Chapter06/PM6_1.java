package Lesson001.Chapter06;

import java.util.Random;
import java.util.Scanner;

public class PM6_1 {

	public static void main(String[] args) {
		int maxNum;
		Scanner keyin = new Scanner(System.in);
		int num = 0;
		maxNum = 0;
		String name="", maxName="";
		for (int i = 0; i < 4; i++) {
			System.out.printf("請玩家輸入姓名並擲骰子 => ");
			name = keyin.nextLine();
			num = game();
			 System.out.printf("  合計 : %d\n",num);

			if (maxNum<num) {
				maxNum=num;
				maxName=name;
			}
		}

		System.out.printf("\n\n恭喜!!  %s 先生 擲出 %d 贏得此局 ",maxName, maxNum);

	}

	private static int game() {
		Random random = new Random();
		int k, sum = 0, ran;
		System.out.printf("\t擲出 => ");
		for (int i = 0; i < 3; i++) {
			ran = 1 + random.nextInt(6);
			System.out.printf("%d  ", ran);
			sum += ran;
		}
		return sum;
	}

}
