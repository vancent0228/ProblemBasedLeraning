package Lesson001.Chapter07;

public class PM7_1 {

	public static void main(String[] args) {
		double course[] = {78.8,72.3,61,56,87,66.3,74.5,88,76,58};
		
		double max=0,min=0;
		//print
		max=course[0];
		min=course[course.length-1];
		for (int i = 0; i < course.length; i++) {
			System.out.printf("%.2f  ",course[i]);
			max=Math.max(max, course[i]);
			min=Math.min(min, course[i]);
		}
		System.out.println();
		System.out.printf("\n最近 %d 天的最高價格 = %.2f",course.length,max);
		System.out.printf("\n最近 %d 天的最低價格 = %.2f",course.length,min);
	}

}
