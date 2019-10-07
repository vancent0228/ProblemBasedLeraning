package Lesson001.Chapter06;

import java.util.Scanner;

public class Ex6_7 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String name,key;
		int hash_pas;
		String passwd1,passwd2;
		int value1,value2;
		System.out.printf("請輸入使用者名稱 => ");
		name = keyin.nextLine();
		
		System.out.printf("請輸入密碼明文 => ");
		passwd1=keyin.nextLine();
		value1=1+(int)(Math.random()*999);
		key=String.valueOf(value1);
		System.out.printf("產生鹽亂數 = %s 儲存於電腦系統內\n",key);
		passwd2=passwd1.concat(key);
		System.out.printf("密碼明文與鹽組合 = %s\n",passwd2);
		hash_pas=passwd2.hashCode();
		System.out.printf("%s 密碼雜湊 =%d\n",name,hash_pas);
		
		System.out.printf("\n請輸入密碼 (驗證密碼是否正確) => ");
		passwd1 = keyin.nextLine();
		System.out.printf("由系統中取出鹽 =%s\n",key);
		passwd2=passwd1.concat(key);
		System.out.printf("輸入密碼與鹽結合後 =%s\n",passwd2);
		value2=passwd2.hashCode();
		System.out.printf("輸入密碼雜湊值 =%d\n",value2);
		if (value2==hash_pas) {
			System.out.printf("%s 密碼設定正確，該帳戶可使用\n",name);
		}else {
			System.out.printf("%s 密碼設定不正確，請重新設定\n",name);
		}
		

	}

}
