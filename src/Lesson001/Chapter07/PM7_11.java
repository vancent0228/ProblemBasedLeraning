package Lesson001.Chapter07;

import java.util.Scanner;

public class PM7_11 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int[] allNum = new int[50];

		int[] spaNum = new int[6];
		int special = 0;

		int[] num = new int[6];
		int[] winNum = new int[6];
		int select = 0;
		do {
			disp_menu();
			select = keyin.nextInt();
			switch (select) {
			case 1:
				special = createSpaNum(allNum, spaNum);
				Show_Spa(spaNum, special);
				break;
			case 2:
				Show_Spa(spaNum, special);
				break;
			case 3:
				for (int ii = 0; ii < 1000000; ii++) {
					createSpaNum(allNum, num);
					// 對獎程式
					int wining = 0;
					int winSpa = 0;
					int k = 0;
					for (int i = 0; i < 6; i++) { // 6個對獎號碼
						for (int j = 0; j < 6; j++) { // 6個開獎號碼
							if (num[i] == spaNum[j]) {
								winNum[k] = num[i];
								wining++;
								k++;
							}
						}

						if (num[i] == special) {
							winSpa = num[i];
							winNum[k] = num[i];
							k++;
						}
					}

					// 比對對獎數目
					if (wining<=4 || winSpa==0) continue;
					System.out.printf("\n對獎號碼 => ");
					disp_Num(num);
					switch (wining) {
					case 0:
					case 1:
					case 2:
						System.out.printf("\n沒有簽中\n");
						break;
					case 3:

						disp_win(winNum, wining);
						if (winSpa == 0)
							System.out.printf("\n簽中普獎\n");
						else
							System.out.printf("\n簽中陸獎\n");
						break;
					case 4:
						disp_win(winNum, wining);
						if (winSpa == 0)
							System.out.printf("\n簽中伍獎\n");
						else
							System.out.printf("\n簽中肆獎\n");
						break;
					case 5:
						disp_win(winNum, wining);
						if (winSpa == 0)
							System.out.printf("\n簽中參獎\n");
						else
							System.out.printf("\n簽中貳獎\n");
						break;
					case 6:
						disp_win(winNum, wining);
						System.out.printf("\n簽中頭獎\n");
						break;

					default:
						break;
					}
				}
				break;

			default:
				break;
			}

		} while (select != 4);

	}

	private static void disp_win(int[] winNum, int wining) {
		System.out.printf("\n中獎號碼 => ");
		for (int i = 0; i < wining; i++) {
			System.out.printf("%4d", winNum[i]);
		}
	}

	private static void Show_Spa(int[] spaNum, int special) {
		System.out.printf("\n本期開獎號碼 => ");
		disp_Num(spaNum);
		System.out.printf("\n特別號 => %d", special);
	}

	private static void disp_Num(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%4d", num[i]);
		}

	}

	private static int createSpaNum(int[] allNum, int[] spaNum) {
		// TODO Auto-generated method stub
		clearNum(allNum);
		clearNum(spaNum);
		int i = 0;
		int value = 0;
		int special = 0;
		while (i < 7) {
			value = (int) (Math.random() * 49) + 1;

			if (allNum[value] == 0) {

				allNum[value] = value;

				if (i < 6)
					spaNum[i] = value;
				else
					special = value;

				i++;
			}
		}
		return special;
	}

	private static void clearNum(int[] allNum) {
		for (int i = 0; i < allNum.length; i++) {
			allNum[i] = 0;
		}

	}

	private static void disp_menu() {
		System.out.printf("\n==歡迎光臨  大樂透對獎系統==\n");
		System.out.printf("\n(1) 產生當期開獎號碼 \n(2) 顯示開獎號碼\n");
		System.out.printf("(3) 產生對獎號碼 \n(4) 離開系統\n");
		System.out.printf("請選擇工作項目 => ");

	}

}
