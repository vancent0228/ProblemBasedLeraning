package Lesson001.Chapter02;

public class Ex2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price1,price2,num1,num2;	//宣告整數變數
		String name1,name2;	//宣告字串變數
		name1="酥餅";price1=50;num1=20;
		name2="脆笛酥";price2=30;num2=100;
		
		System.out.print(name1+"\t"+num1+"個\t"+price1+"元/個    合計 = ");
		System.out.print(price1*num1+"元");
		System.out.print('\n');
		System.out.print(name2+"\t"+num2+"個\t"+price2+"元/個    合計 = ");
		System.out.print(price2*num2+"元");
	}

}
