package Lesson002.Chapter04;

public class Ex4_2 {
	static int[] num=new int[50];
	static int point;
	
	public static void main(String[] args) {
		point = -1;
		for (int i=0;i<40;i++) {
			num[i]=(i+1)*2;
			point++;
		}
		
		System.out.printf("\n==目前序陣列有 %d 筆資料==\n",point+1);
		for (int i=0;i<=point;i++) {
			System.out.printf("%2d ",num[i]);
			if ((i+1)%10==0) System.out.printf("\n");
		}
		System.out.printf("\n");
	}
}
