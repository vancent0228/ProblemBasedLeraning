package Lesson002.Chapter05;

import java.util.*;

class Article {
	String ID;
	String name;
	int price;
	int storage;
	int safetyStock;
	String unit;
	String maker;
}
public class PM5_1 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		Article goods = new Article();
		
		System.out.printf("**輸入商品資料**\n");
		System.out.printf("請輸入商品編號 =>");
		goods.ID=keyin.nextLine();
		System.out.printf("請輸入單價 =>");
		goods.price=keyin.nextInt();
		System.out.printf("請輸入庫存量 =>");
		goods.storage=keyin.nextInt();
		System.out.printf("請輸入安全庫存量 =>");
		goods.safetyStock=keyin.nextInt();
		keyin.nextLine();
		System.out.printf("請輸入單位 =>");
		goods.unit=keyin.nextLine();
		System.out.printf("請輸入製造商 =>");
		goods.maker=keyin.nextLine();
		
		System.out.printf("\n**印出商品資料**\n\n");
		System.out.printf("商品編號 = %s\n",goods.ID);
		System.out.printf("商品名稱 = %s\n",goods.name);
		System.out.printf("單價 = %d\n",goods.price);
		System.out.printf("庫存量 = %d\n",goods.storage);
		System.out.printf("安全庫存量 = %d\n",goods.safetyStock);
		
		System.out.printf("單位 = %s\n",goods.unit);
		System.out.printf("製造商 = %s\n",goods.maker);

	}

}
