package Lesson001.Chapter04;

import java.util.Scanner;

public class PM4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String name;
		int base=0;
		int extra=0;
		int extra_pay=0;
		int pay=0;
		System.out.printf("請輸入員工姓名 =>");
		name=in.nextLine();
		System.out.printf("請輸入底薪 =>");
		base=in.nextInt();
		System.out.printf("請輸入加班時數 =>");
		extra=in.nextInt();
		
		//輸入底薪後，判斷是否低於 16800，如是則設定成16800
		if (base<16800) base=16800;
		//輸入加班時數 判斷是否高於 45，如是則設定成 45
		if (extra>45) extra=45;
		
		//計算加班費
		extra_pay=(int)Math.round(((double)base/(30*8))*1.333*extra);
		pay=base+extra_pay;
		System.out.printf("\n( 底薪=%d + 加班費=%d ) = 本月薪資=%d\n",base,extra_pay,pay);
		
	}

}
