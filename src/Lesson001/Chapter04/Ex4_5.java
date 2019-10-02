
package Lesson001.Chapter04;

import java.util.Scanner;

public class Ex4_5 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String key;
		System.out.printf("歡迎使用醫療診斷系統，請依序回答問題\n");
		System.out.printf("=============================================\n");
		System.out.printf("請問您最近是否發燒 (y/n) => ");
		key = keyin.nextLine();
		if (key.equals("y")) {
			System.out.printf("請問您最近是否咳嗽 (y/n) => ");
			key = keyin.nextLine();
			if (key.equals("y")) {
				System.out.printf("請問您最近是否疲倦 (y/n) => ");
				key = keyin.nextLine();
				if (key.equals("y")) {
					System.out.printf("先生/小姐您已經感冒了 !!!\n");
				} else {
					System.out.printf("請問您是否血壓升高 (y/n) => ");
					key = keyin.nextLine();
					if (key.equals("y")) {
						System.out.printf("請問您最近是否口乾 (y/n) => ");
						key = keyin.nextLine();
						if (key.equals("y"))
							System.out.println("先生/小姐您可能得肝病 !!!");
						else
							System.out.println("有可能僅有感冒而已 ???");

					} else {
						System.out.printf("請問您最近是否盜汗 (y/n) => ");
						key = keyin.nextLine();
						if (key.equals("y"))
							System.out.println("先生/小姐您可能得肺病 !!!");
						else
							System.out.println("需要由其他系統進一步檢查 !!!");
					}

				}

			} else
				System.out.println("有發燒無咳嗽，請到別科門診 !!!");

		} else
			System.out.println("應該是健康身體");
	}

}
