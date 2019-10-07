package Lesson001.Chapter07;

public class Ex7_5 {

	public static void main(String[] args) {
		int score[][] = {{1,2,3},
				{4,5,6},
				{7,8,9}};
		System.out.printf("原陣列內容:\n");
		for (int x = 0; x < score.length; x++) {
			for (int y = 0; y < score[x].length; y++) {
				System.out.printf("\t%2d",score[x][y]);
			}
			System.out.println();
		}
		System.out.printf("\n列印轉移陣列內容:\n");
		for (int x = 0; x < score.length; x++) {
			for (int y = 0; y < score[x].length; y++) {
				System.out.printf("\t%2d",score[y][x]);
			}
			System.out.println();
		}

	}

}
