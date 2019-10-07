package Lesson001.Chapter07;

public class Ex7_7 {

	public static void main(String[] args) {
		int value;
		int[] num=new int [6];
		int[] snum=new int [50];
		int i=0;
		while (i<6) {
			value=1+(int)(Math.random()*49);
			if (snum[value]==0) {
				snum[value]=value;
				num[i]=value;
				i++;
			}else {
				System.out.printf("\n重複 %d",value);
			}
		}
		System.out.printf("\n\n幸運號碼是 : ");
		for (int j = 0; j < num.length; j++) {
			System.out.printf("%d  ",num[j]);
		}
		System.out.printf("\n");
		
	}

}
