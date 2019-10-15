package Lesson002.Chapter05;

public class Ex5_2 {

	public static void main(String[] args) {
		int tax;
		Employee emp = new Employee();
		emp.name="張大名";
		emp.depart="製造部";
		emp.ID=43210;
		emp.payment=50000;
		emp.duty=15000;
		
		System.out.printf("**列印員工稅額**\n");
		System.out.printf("員工代號 = %d\n",emp.ID);
		System.out.printf("員工姓名 = %s\n",emp.name);
		System.out.printf("所屬部門 = %s\n",emp.depart);
		System.out.printf("薪資 = %d\n",emp.payment+emp.duty);
		tax=(int)((emp.payment+emp.duty)*0.1);
		System.out.printf("預扣稅額 = %d\n",tax);
		

	}

}
