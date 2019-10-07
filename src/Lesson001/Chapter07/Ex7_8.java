package Lesson001.Chapter07;

public class Ex7_8 {

	public static void main(String[] args) {
		int[] a= {45,12,89,76,34,65,77,93};
		int temp;
		int flag=0;
		printArray(a);
		System.out.printf("\n\n");

		for (int i = 0; i < a.length; i++) {
			flag=0;
			System.out.printf("%d  回合",i+1);
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					flag=1;
				}
			}
			if (flag==0)
				break;
			printArray(a);
		}
		System.out.printf("\n\n");
		printArray(a);

	}

	private static void printArray(int[] a) {
		System.out.printf("\n陣列內容 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d  ",a[i]);
		}
		System.out.printf("\n");
	}

}
