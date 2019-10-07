package Lesson001.Chapter07;

public class PM7_8 {

	public static void main(String[] args) {
		float stock[] = { 78, 72, 61, 56, 87, 66, 74, 88, 76, 58, 65, 57, 90, 78, 67, 89, 56, 77, 56, 87, 67, 80, 77, 86,
				67, 75, 86, 98, 88, 78 };
		System.out.printf("排序前 :\n");
		disp_stock(stock);
		swap(stock);
		System.out.printf("排序後 :\n");
		disp_stock(stock);
	}

	private static void swap(float[] stock) {
		// TODO Auto-generated method stub
		float temp = 0;
		for (int i = 0; i < stock.length; i++) {
			for (int j = i + 1; j < stock.length; j++) {
				if (stock[i] > stock[j]) {
					temp = stock[i];
					stock[i] = stock[j];
					stock[j] = temp;
				}

			}

		}
	}

	private static void disp_stock(float[] stock) {
		for (int i = 0; i < stock.length; i++) {
			System.out.printf("%.2f ", stock[i]);
			if ((i + 1) % 10 == 0)
				System.out.printf("\n");
		}

	}

}
