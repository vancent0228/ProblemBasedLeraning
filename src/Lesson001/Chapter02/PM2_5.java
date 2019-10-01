package Lesson001.Chapter02;
import java.util.Scanner;

public class PM2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner(System.in);
		String position;
		String name;
		String tel;
		System.out.printf("請輸入職位名稱 =>");
		position=keyin.nextLine();
		System.out.printf("請輸入姓名 =>");
		name=keyin.nextLine();
		System.out.printf("請輸入電話 =>");
		tel=keyin.nextLine();
		
		System.out.printf("------------------------------\n");
		System.out.printf("台灣遊戲軟體發展協會\n");
		System.out.printf("%s\n",position);
		System.out.printf("\n");
		System.out.printf("		%s\n",name);
		System.out.printf("\n");
		System.out.printf("電話: %s\n",tel);
		System.out.printf("地址: 高雄縣烏松鄉澄清路 840 號\n");
		System.out.printf("------------------------------\n");
		
	}

}
