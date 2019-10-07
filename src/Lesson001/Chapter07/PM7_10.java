package Lesson001.Chapter07;

public class PM7_10 {
	public static void main(String[] args) {
		int score[][]= {
				{492101,80,90,78,72,0},
				{492102,90,67,54,46,0},
				{492103,71,64,83,53,0},
				{492104,68,89,73,73,0},
				{492105,56,72,53,49,0},
				{492106,96,65,78,83,0},
				{492107,49,62,91,68,0}};
		//ave all
		for (int i = 0; i < score.length; i++) {
			score[i][5]=(
					score[i][1]+
					score[i][2]+
					score[i][3]+
					score[i][4]
					)/4;
		}
		
		//sort
		int[] temp = new int[6];
		for (int i = 0; i < score.length; i++) {
			for (int j = i+1; j < score.length; j++) {
				if (score[i][5]<score[j][5]) {
					temp=score[i];
					score[i]=score[j];
					score[j]=temp;
				}
			}
			
		}
		//print
		System.out.printf("學號\t程式\t資訊\t資料\t統計\t總平均\n");
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.printf("\n");
		}

	}
}
