package Lesson002.Chapter05;

import java.util.*;

class Element2 {
	String name;
	String ID;
	int storage;
	int price;
}

public class PM5_2 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		Element2[] cust = new Element2[20];
		String[][] article = { { "可口餅乾", "A1001" }, { "味全鮮乳", "A1002" }, { "御便當", "A1003" }, { "頻果西打", "A1004" },
				{ "頻果西打", "A1005" }, { "脆笛酥", "A1006" } };
		int select, art, number;
		for (int i = 0; i < 6; i++) {
			cust[i] = new Element2();
			cust[i].name = article[i][0];
			cust[i].ID = article[i][1];
		}
		do {
			mainMenu();
			select = keyin.nextInt();
			if (select == 4) {
				System.out.printf("\n謝謝使用\n");
				System.exit(0);
			}
			switch (select) {
			case 1:
				System.out.printf("\n**盤點庫存量如下**\n");
				System.out.printf("產品編號\t產品名稱\t庫存量\n");
				for (int i = 0; i < 6; i++) {
					System.out.printf("%s\t\t%s\t%d\n", cust[i].ID, cust[i].name, cust[i].storage);
				}
				break;
			case 2:
				dispElement(cust);
				art = keyin.nextInt();
				System.out.printf("請輸入[%s]進貨數量 =>",cust[art-1].name);
				number = keyin.nextInt();
				cust[art - 1].storage = cust[art - 1].storage + number;
				break;
			case 3:
				dispElement(cust);
				art = keyin.nextInt();
				System.out.printf("請輸入 [%s] = (%d) 出貨數量 =>",cust[art-1].name,cust[art-1].storage);
				number = keyin.nextInt();
				if (number > cust[art - 1].storage)
					System.out.printf("庫存(%d)不足,拒絕出貨(%d)\n", cust[art - 1].storage,number);
				else
					cust[art - 1].storage = cust[art - 1].storage - number;
				break;

			default:
				System.out.printf("\n請重新正確選擇 (1~4) != (%d)\n",select);
				break;
			}
		} while (true);
	}

	private static void dispElement(Element2[] cust) {
		for (int i = 0; i < 6; i++) {
			System.out.printf("(%d).%s(%s)=%d\t",i+1, cust[i].name, cust[i].ID, cust[i].storage);
			if ((i+1)%3==0) System.out.printf("\n");
		}
		System.out.printf("\t請輸入產品代碼(1~6) => ");
		
	}

	private static void mainMenu() {
		System.out.printf("\n**歡迎光臨 春嬌超商 庫存管理系統**\n");
		System.out.printf("(1) 盤點庫存量  ");
		System.out.printf("(2) 進貨登錄  ");
		System.out.printf("(3) 出貨管理  ");
		System.out.printf("(4) 離開系統\n");
		System.out.printf("\t請輸入選項 => ");

	}

}
