package Lesson002.Chapter05;

import java.util.*;

public class Ex5_3 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		Employee[] worker;
		worker=new Employee[20];
		int value,tax,k=0;
		String sel,temp;
		do {
			System.out.printf("是否繼續輸入員工資料 (y/n) =>");
			sel=keyin.nextLine();
			if (sel.equals("n")) break;
			if (k<20) {
				worker[k]=new Employee();
				System.out.printf("\n**輸入員工資料**\n");
				System.out.printf("輸入員工姓名 =>");
				worker[k].name=keyin.nextLine();
				System.out.printf("輸入所屬部門 =>");
				worker[k].depart=keyin.nextLine();
				System.out.printf("輸入員工代號 =>");
				worker[k].ID=keyin.nextInt();
				System.out.printf("輸入員工底薪 =>");
				worker[k].payment=keyin.nextInt();
				System.out.printf("輸入薪資加級 =>");
				worker[k].duty=keyin.nextInt();
				keyin.nextLine();
				k++;
			}else {
				System.out.printf("\n員工人數已滿\n");
			}
			
			//==
			System.out.printf("\n\n**印出員工薪資表**\n");
			System.out.printf("員工資料\t\t薪資總額\t預扣稅額\t應領薪資\n");
			for (int i=0;i<k;i++) {
				System.out.printf("%s",worker[i].name);
				System.out.printf("(%d",worker[i].ID);
				System.out.printf("%s)",worker[i].depart);
				value=worker[i].payment+worker[i].duty;
				System.out.printf("  %d\t\t",value);
				tax=(int)(value*0.1);
				System.out.printf("%d\t\t",tax);
				value=value-tax;
				System.out.printf("%d\n",value);
			}
		} while (true);
		
	}

}
