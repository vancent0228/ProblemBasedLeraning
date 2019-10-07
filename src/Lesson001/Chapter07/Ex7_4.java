package Lesson001.Chapter07;

public class Ex7_4 {

	public static void main(String[] args) {
		int score[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int x;
		int y;
		for (x = 0; x < score.length; x++) {
			for (y = 0; y < score[x].length; y++) {
				System.out.printf("\t%2d",score[x][y]);
			}
			System.out.println();
		}
		
	}

}
