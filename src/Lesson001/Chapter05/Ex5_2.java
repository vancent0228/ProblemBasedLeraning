package Lesson001.Chapter05;

public class Ex5_2 {

	public static void main(String[] args) {
		//10!
		int count=0,total=1;
		
		for (count = 1; count <= 10; count++) {
			total*=count;
			System.out.printf("\ntotal * %d = %d",count,total);
			
		}

	}

}
