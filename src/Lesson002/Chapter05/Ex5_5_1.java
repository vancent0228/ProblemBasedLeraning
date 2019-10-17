package Lesson002.Chapter05;

class Item {
	String name;
	int price;
	int calory;
}

public class Ex5_5_1 {
	static Item[] Menu = new Item[100];

	public static void main(String[] args) {
		String name[] = { "蠔油香菇", "蒜泥白肉", "筍干控肉", "五味花枝", "紅燒鮮魚", "麻婆豆腐", "白玉珍丸", "快炒青菜", "青菜豆腐湯", "水晶蝦餃", "紅油炒手",
				"蜜汁叉燒酥", "藕斷絲連", "龍門炒米粉", "瑤柱炒飯", "龍蝦鮮麵", "白飯", "足料觀湯", "香菜皮蛋湯", "酸辣海鮮湯", "清湯", "南瓜西米露" };
		int price[] = { 300, 250, 320, 200, 400, 100, 150, 100, 100, 200, 200, 200, 200, 300, 300, 400, 20, 500, 200,
				200, 20, 150 };
		int calory[] = { 800, 500, 700, 600, 600, 200, 300, 150, 100, 300, 400, 400, 300, 500, 500, 400, 100, 800, 300,
				300, 10, 200 };
		
		for (int i = 0; i < name.length; i++) {
			Menu[i]=new Item();
			Menu[i].name=name[i];
			Menu[i].price=price[i];
			Menu[i].calory=calory[i];
		}
		
		System.out.printf("%s\t\t%s\t%s\n","菜單","價格","卡路里");
		for (int i = 0; i < name.length; i++) {
			System.out.printf("%s\t\t%d\t%d\n",Menu[i].name,Menu[i].price,Menu[i].calory);
		}

	}

}
