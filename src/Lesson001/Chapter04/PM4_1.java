package Lesson001.Chapter04;

import java.util.Scanner;

public class PM4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs1 = { "姓名", "性別(男:1,女:0)", "年齡", "地址", "身高", "體重" };
		String[] strs2 = new String[strs1.length];
		char[] sexs = { '女', '男' };
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < strs1.length; i++) {
			System.out.printf("請輸入客戶" + strs1[i] + " =>");
			strs2[i] = in.nextLine();
		}

		System.out.printf("\n\n列印客戶資料如下:\n");
		for (int i = 0; i < strs1.length; i++) {
			if (i == 1)
				System.out.printf("客戶%s = %s性\n", strs1[i], sexs[Integer.valueOf(strs2[i])]);
			else
				System.out.printf("客戶%s = %s\n", strs1[i], strs2[i]);
		}
	}

}
