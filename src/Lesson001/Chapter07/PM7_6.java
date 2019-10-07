package Lesson001.Chapter07;

public class PM7_6 {

	public static void main(String[] args) {
		int score[][]= {
				{411101,70},
				{411102,80},
				{411103,75},
				{411104,90},
				{411105,85},
				{411106,65},
				{411107,83},
				{411108,78}};
		int[] max= {0,0};
		int[] min= {0,999};
		
		for (int i = 0; i < score.length; i++) {
			if (score[i][1]>max[1]) {
				max[0]=score[i][0];
				max[1]=score[i][1];
				}
			if (score[i][1]<min[1]) {
				min[0]=score[i][0];
				min[1]=score[i][1];
				}
		}
		
		System.out.printf("\n\n最高者 %d 成績=%d\n",max[0],max[1]);
		System.out.printf("\n\n最低者 %d 成績=%d\n",min[0],min[1]);
		
	}


}
