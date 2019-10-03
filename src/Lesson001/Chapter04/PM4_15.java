package Lesson001.Chapter04;

import java.util.Scanner;

public class PM4_15 {

	public static void main(String[] args) {
		String name;
		int saleMoney = 0, base = 0, bonus = 0, salary = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.printf("請輸入業務員姓名 => ");
		name=in.nextLine();
		System.out.printf("請輸入業務員銷售金額(萬元) => ");
		saleMoney=in.nextInt();
		
		base=16500;
		
		if (saleMoney<10) {
			bonus=0;
		}else {
			bonus=5000+((saleMoney-10)/5)*5000;
		}
		System.out.printf("\n員工姓名 = %s\n",name);
		System.out.printf("\n底薪 = %d\n",base);
		System.out.printf("\n獎金 = %d\n",bonus);

		
		salary=base+bonus;
		System.out.printf("\n本月薪資 = %d\n",salary);

	}

}
