package Lesson001.Chapter02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PM2_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		int value1;
		int value2;
		int sum;
		System.out.printf("請輸入第一個整數 =>");
		value1=Integer.parseInt(keyin.readLine());
		System.out.printf("請輸入第二個整數 =>");
		value2=Integer.parseInt(keyin.readLine());
		sum=value1+value2;
		System.out.printf("%d + %d = %d",value1,value2,sum);
		

	}

}
