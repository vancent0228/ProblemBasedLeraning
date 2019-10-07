package Lesson001.Chapter07;

import java.util.Scanner;

public class PM7_5 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String[][] poem = new String[4][5];
		String data;
		for (int i = 0; i < 4; i++) {
			System.out.printf("請輸入第 %d 句(五個字)=>", i + 1);
			data = keyin.next();
			Scanner s = new Scanner(data).useDelimiter("");
			for (int j = 0; j < 5; j++) {
				poem[i][j] = s.next();
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%s ", poem[i][j]);
			}
			System.out.printf("\n\n");
		}

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 4; i++) {
				System.out.printf("%s ", poem[i][j]);
			}
			System.out.printf("\n");
		}
	}

}
