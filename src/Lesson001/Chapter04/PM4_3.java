package Lesson001.Chapter04;

import java.util.Random;
import java.util.Scanner;

public class PM4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random ra = new Random();

		String user1, user2;
		int num1, num2, num3;
		int sum1, sum2;

		System.out.printf("\n請輸入第一個玩家的姓名(開始擲骰子) => ");
		user1 = in.nextLine();
		num1 = 1 + ra.nextInt(6);
		num2 = 1 + ra.nextInt(6);
		num3 = 1 + ra.nextInt(6);
		sum1 = num1 + num2 + num3;
		System.out.printf("\n%s 先生/小姐 擲骰子是 %d %d %d 合計 = %d ", user1, num1, num2, num3, sum1);

		System.out.printf("\n請輸入第二個玩家的姓名(開始擲骰子) => ");
		user2 = in.nextLine();
		num1 = 1 + ra.nextInt(6);
		num2 = 1 + ra.nextInt(6);
		num3 = 1 + ra.nextInt(6);
		sum2 = num1 + num2 + num3;
		System.out.printf("\n%s 先生/小姐 擲骰子是 %d %d %d 合計 = %d ", user2, num1, num2, num3, sum2);

		if (sum1 == sum2) {
			System.out.println("\n\n平局");
		} else {
			System.out.printf("\n\n恭喜 %s 先生/小姐嬴了此局\n",
					(sum1>sum2) ? user1:user2
					);
		}	}

}
