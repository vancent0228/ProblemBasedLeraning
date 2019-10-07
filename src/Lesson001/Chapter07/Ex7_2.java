package Lesson001.Chapter07;

public class Ex7_2 {

	public static void main(String[] args) {
		double course[] = {78.8,72.3,61,56,87,66.3,74.5,88,76,58};
		
		double sum=0,ave;
		//print
		for (int i = 0; i < course.length; i++) {
			System.out.printf("%.2f  ",course[i]);
			sum+=course[i];
		}
		System.out.println();
		ave=sum/course.length;
		System.out.printf("\n最近 %d 天的平均價 = %.2f",course.length,ave);
	}

}
