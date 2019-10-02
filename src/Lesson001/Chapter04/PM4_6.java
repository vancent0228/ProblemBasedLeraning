package Lesson001.Chapter04;

import java.util.Scanner;

public class PM4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner(System.in);
		String key;
		int status;
		System.out.printf("歡迎使用肺結核自我診斷系統，請依序回答問題\n");
		System.out.printf("=============================================\n");
		status = 0;
		System.out.printf("=== 感染期現象詢問 ===\n");
		System.out.printf("您最近是否咳嗽現象 (y/n) => ");
		key = keyin.nextLine();
		if (key.equals("y"))
			status++;
		System.out.printf("您最近是否咳痰現象 (y/n) => ");
		key = keyin.nextLine();
		if (key.equals("y"))
			status++;
		System.out.printf("您最近是否疲倦現象 (y/n) => ");
		key = keyin.nextLine();
		if (key.equals("y"))
			status++;
		System.out.printf("您最近是否體重減輕 (y/n) => ");
		key = keyin.nextLine();
		if (key.equals("y"))
			status++;

		if (status < 3)
			System.out.println("恭喜您，未受感染");
		else {
			status = 0;
			System.out.printf("=== 發病期現象詢問 ===\n");
			System.out.printf("您最近是否胸悶現象 (y/n) => ");
			key = keyin.nextLine();
			if (key.equals("y"))
				status++;
			System.out.printf("您最近是否胸痛現象 (y/n) => ");
			key = keyin.nextLine();
			if (key.equals("y"))
				status++;
			System.out.printf("您最近是否呼吸困難現象 (y/n) => ");
			key = keyin.nextLine();
			if (key.equals("y"))
				status++;

			if (status < 2)
				System.out.println("您僅受感染未發病，盡快就醫");
			else {
				status = 0;
				System.out.printf("=== 危險期現象詢問 ===\n");
				System.out.printf("您最近是否午後發燒現象 (y/n) => ");
				key = keyin.nextLine();
				if (key.equals("y"))
					status++;
				System.out.printf("您最近是否夜間盜汗現象 (y/n) => ");
				key = keyin.nextLine();
				if (key.equals("y"))
					status++;
				System.out.printf("您最近是否呼吸咳血現象 (y/n) => ");
				key = keyin.nextLine();
				if (key.equals("y"))
					status++;

				if (status < 2)
					System.out.println("您已進入發作期，盡快就醫");
				else {
					System.out.println("您已進入危險期，必須隔離就醫");
				}

			}

		}

	}

}
