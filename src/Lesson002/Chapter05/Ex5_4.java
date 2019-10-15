package Lesson002.Chapter05;

import java.util.*;

class Element {
	String name;
	int price;
	int qty;
	int sum;
}

public class Ex5_4 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		Element[] cust = new Element[20];
		int select, k, no, total;
		k = 0;
		do {
			dispElement();
			select = keyin.nextInt();
			if (select == 7) {
				System.out.printf("\n\n謝謝使用 結算金額中 ....\n");
				break;
			}
			System.out.printf("\t購買數量 =>");
			no = keyin.nextInt();
			switch (select) {
			case 1:
				cust[k] = new Element();
				cust[k].name = "可口餅乾";
				cust[k].price = 20;
				cust[k].qty = no;
				k++;
				break;
			case 2:
				cust[k] = new Element();
				cust[k].name = "味全鮮乳";
				cust[k].price = 30;
				cust[k].qty = no;
				k++;
				break;
			case 3:
				cust[k] = new Element();
				cust[k].name = "御便當";
				cust[k].price = 50;
				cust[k].qty = no;
				k++;
				break;
			case 4:
				cust[k] = new Element();
				cust[k].name = "黑松汽水";
				cust[k].price = 20;
				cust[k].qty = no;
				k++;
				break;
			case 5:
				cust[k] = new Element();
				cust[k].name = "頻果西打";
				cust[k].price = 30;
				cust[k].qty = no;
				k++;
				break;
			case 6:
				cust[k] = new Element();
				cust[k].name = "脆迪酥";
				cust[k].price = 20;
				cust[k].qty = no;
				k++;
				break;
			default:
				System.out.printf("請重新正確選擇\n");
				break;
			}
		} while (k < 20);

		// total
		total = 0;
		for (int i = 0; i < k; i++) {
			cust[i].sum = cust[i].price * cust[i].qty;
			total += cust[i].sum;
		}

		// display list
		System.out.printf("\n**購買清單如下**\n");
		System.out.printf("品名\t\t單價\t數量\t小計\n");
		for (int i = 0; i < k; i++) {
			System.out.printf("%s\t\t%4d\t%4d\t%4d\n", cust[i].name, cust[i].price, cust[i].qty, cust[i].sum);
		}
		System.out.printf("\n總計 = %d\n", total);
	}

	private static void dispElement() {
		System.out.printf("\n**歡迎光臨  春嬌超商  請選擇購買商品**\n");
		System.out.printf("(1) 可口餅乾 20 元\t");
		System.out.printf("(2) 味全鮮乳 30 元\t");
		System.out.printf("(3) 御便當 50 元\n");
		System.out.printf("(4) 黑松汽水 20 元\t");
		System.out.printf("(5) 頻果西打 30 元\t");
		System.out.printf("(6) 脆迪酥 20 元\n");
		System.out.printf("(7) 結算金額\n");
		System.out.printf("\t請輸入選項 => ");
	}

}
