package Lesson002.Chapter05;

import java.util.Scanner;

class Item2 {
	String name;
	int price;
	int calory;
}

class Fare_item{
	int No;
	String name;
	int price;
	int calory;
}

public class Ex5_5_2 {
	static Item2[] Menu = new Item2[100];
	static int Item_No = 0;
	static Fare_item[] Fare = new Fare_item[20];
	static int Fare_No=0;
	
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String name[] = { "蠔油香菇", "蒜泥白肉", "筍干控肉", "五味花枝", "紅燒鮮魚", "麻婆豆腐", "白玉珍丸", "快炒青菜", "青菜豆腐湯", "水晶蝦餃", "紅油炒手",
				"蜜汁叉燒酥", "藕斷絲連", "龍門炒米粉", "瑤柱炒飯", "龍蝦鮮麵", "白飯", "足料觀湯", "香菜皮蛋湯", "酸辣海鮮湯", "清湯", "南瓜西米露" };
		int price[] = { 300, 250, 320, 200, 400, 100, 150, 100, 100, 200, 200, 200, 200, 300, 300, 400, 20, 500, 200,
				200, 20, 150 };
		int calory[] = { 800, 500, 700, 600, 600, 200, 300, 150, 100, 300, 400, 400, 300, 500, 500, 400, 100, 800, 300,
				300, 10, 200 };
		
		for (int i = 0; i < name.length; i++) {
			Menu[i]=new Item2();
			Menu[i].name=name[i];
			Menu[i].price=price[i];
			Menu[i].calory=calory[i];
		}
		//--
		Item_No=name.length;
		//給予菜單初值結束、點菜作業開始
		int table_No,count,item,sel;
		int total_m=0,total_c=0;
		System.out.printf("請輸入桌次 => ");
		table_No=keyin.nextInt();
		for(int i=0;i<Item_No;i++) {
			System.out.printf("(%d)%s  ",(i+1),Menu[i].name);
			if ((i+1)%5==0)
				System.out.printf("\n");
		}
		System.out.printf("(0) 結束點菜\n");
		count=0;
		do {
			System.out.printf("\n請輸入菜名的編號 => ");
			item=keyin.nextInt();
			
			if (item==0) break;
			
			Fare[Fare_No]=new Fare_item();
			Fare[Fare_No].No=table_No;
			Fare[Fare_No].name=Menu[item-1].name;
			Fare[Fare_No].price=Menu[item-1].price;
			Fare[Fare_No].calory=Menu[item-1].calory;
			total_m+=Fare[Fare_No].price;
			total_c+=Fare[Fare_No].calory;
			Fare_No++;
			count++;
			System.out.printf("\n累計 %d 元，卡洛里、請輸入菜名的編號 => ",total_m,total_c);
		} while (true);
		
		System.out.printf("\n%d 桌顧客菜單如下 : \n",table_No);
		System.out.printf("%s\t\t%s\t%s\n","菜單","價格","卡路里");
		for (int i = 0; i < count; i++) {
			System.out.printf("%s\t\t%d\t%d\n",Fare[i].name,Fare[i].price,Fare[i].calory);
		}
		System.out.printf("%s\t\t%s%d\t%s%d\n","總計","總價格:",total_m,"總熱量:",total_c);

		System.out.printf("\n廚房增加 菜單如下 : \n",table_No);
		for (int i = 0; i < count; i++) {
			System.out.printf("%3d桌次\t%s\n",Fare[i].No,Fare[i].name);
		}
		
	}

}
