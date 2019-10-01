package Lesson001.Chapter02;

import java.util.Scanner;

public class Ex2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner(System.in);
		System.out.printf("圓參數計算工具\n");
		System.out.printf("請輸入圓的半徑  => ");
		double radius = keyin.nextDouble();

		System.out.printf("圓半徑 = %.2f 的相關參數如下: \n", radius);
		// 圓週長 circum = 2 * pi * radius
		double circum = 2 * Math.PI * radius;
		// 圓面積 area = pi * radius * radius
		double area = Math.PI * radius * radius;
		// 圓體積 volume = 3/4 * radius * radius * radius;
		double volume = 3d / 4d * Math.PI * radius * radius * radius;

		System.out.printf("圓周長 = %.2f\n", circum);
		System.out.printf("圓面積 = %.2f\n", area);
		System.out.printf("圓體積 = %.2f\n", volume);

	}

}
