package Lesson001.Chapter05;

public class PM5_8 {

	public static void main(String[] args) {
		int i=1;
		while (i<=9) {
			int j=2;
			while (j<=9) {
				System.out.printf("%2d*%1d=%2d",j,i,i*j);
				j++;
			}
			i++;
			System.out.printf("\n");
		}

	}

}
