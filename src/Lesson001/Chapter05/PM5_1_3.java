package Lesson001.Chapter05;

public class PM5_1_3 {

	public static void main(String[] args) {
		int count,sum;
		sum=0;
		for (count = 0; count <=1000; count++) {
			if (count%2==0)
			sum+=count;
		}
		System.out.printf("0+2+4...+1000=%d\n",sum);

	}

}
