package Lesson001.Chapter07;

public class PM7_9 {

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

		int[] temp = new int[2];
		for (int i = 0; i < score.length; i++) {
			for (int j = i+1; j < score.length; j++) {
				if(score[i][1]<score[j][1]) {
					temp=score[i];
					score[i]=score[j];
					score[j]=temp;
				}
			}
			
		}
		
		System.out.printf("==列印排序後成績單==\n\n");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d = %d\n",score[i][0],score[i][1]);
		}
	}

}
