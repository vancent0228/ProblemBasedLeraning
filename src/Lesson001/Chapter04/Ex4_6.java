package Lesson001.Chapter04;

import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		float op1,op2,result=0f;
		String oper_st;
		char oper;
		System.out.println("== 歡迎使用 + - * / 計算器 ==");
		System.out.printf("\n\n請輸入(如: 45 + 28) => ");
		op1=keyin.nextFloat();
		oper_st=keyin.next();
		oper=oper_st.charAt(0);
		op2=keyin.nextFloat();
		
		switch (oper) {
		case '+':
			result=op1+op2;
			break;
		case '-':
			result=op1-op2;
			break;
		case '*':
			result=op1*op2;
			break;
		case '/':
			result=op1/op2;
			break;

		default:
			System.out.println("錯誤輸入\n");
			System.exit(0);
		}
		System.out.printf("%.2f %c %.2f = %.2f",op1,oper,op2,result);
	}

}
