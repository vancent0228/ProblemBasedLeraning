package Lesson002.Chapter05;

import java.util.Scanner;
class Employee {
	int ID;
	String name;
	String depart;
	int payment;
	int duty;
}
public class Ex5_1 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		// new a emp
		Employee emp = new Employee();
		System.out.printf("**輸入員工資料**\n\n");
		System.out.printf("輸入員工姓名 => ");
		emp.name=keyin.nextLine();
		System.out.printf("輸入員工部門 => ");
		emp.depart=keyin.nextLine();
		System.out.printf("輸入員工代號 => ");
		emp.ID=keyin.nextInt();
		System.out.printf("輸入員工底薪 => ");
		emp.payment=keyin.nextInt();
		System.out.printf("輸入薪資加級 => ");
		emp.duty=keyin.nextInt();
		
		System.out.printf("\n**印出員工資料**\n");
		System.out.printf("員工代號 = %d\n",emp.ID);
		System.out.printf("員工姓名 = %s\n",emp.name);
		System.out.printf("所屬部門 = %s\n",emp.depart);
		System.out.printf("底    薪 = %d\n",emp.payment);
		System.out.printf("職務加級 = %d\n",emp.duty);

	}

}
