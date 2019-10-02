package Lesson001.Chapter04;

import java.util.Scanner;

public class PM4_8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String sex;
		float normal=0,weight,toll,adj;
		
		System.out.printf("請輸入性別(男/女) =>");
		sex=in.nextLine();
		System.out.printf("請輸入身高(cm) =>");
		toll=in.nextFloat();
		System.out.printf("請輸入體重(kg) =>");
		weight=in.nextFloat();
		
		if (sex.equals("男")) {
			normal=(toll-80)*0.7f;
		}else if(sex.equals("女")) {
			normal=(toll-70)*0.6f;
		}
		
		if (normal!=weight) {
			if (normal<weight)
				System.out.printf("\n您過重 應該減肥 %.2f公斤",weight-normal);
			else
				System.out.printf("\n您過輕 應該增重 %.2f公斤",normal-weight);
		}else System.out.println("\n您的體重符合標準!!");
		
		

	}

}
