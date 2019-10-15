package Lesson002.Chapter04;

import java.util.Scanner;

public class PM4_4 {
	static String Queue[] = new String[50];
	static int Rear;
	static int Front = 0;

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		Rear = -1;
		String customer;
		int select;

		do {
			disp_menu();
			select = keyin.nextInt();
			switch (select) {
			case 1:
				disp_Queue();
				break;
			case 2:
				System.out.printf("請輸入客戶姓名 => ");
				customer = keyin.next();
				if (enQueue(customer)) {
					System.out.printf("%s 已掛號成功\n", customer);
				} else {
					System.out.printf("目前掛號已滿請稍候再掛!! \n");
				}
				break;
			case 3:
				if (emptyQueue()) {
					System.out.printf("目前沒有客戶掛號\n");
				}else {
					customer=deQueue();
					System.out.printf("請 %s 先生/小姐 進入看診室\n",customer);
				}
				break;
			case 4:
				System.out.printf("謝謝使用 歡迎在來\n");
				System.exit(0);
				break;
			default:
				System.out.printf("輸入錯誤 %d !! 請重新輸入\n ", select);
				break;
			}
		} while (true);
	}

	private static String deQueue() {
		String customer=Queue[Front];
		for (int i=Front;i<Rear;i++) {
			Queue[i]=Queue[i+1];
		}
		Rear--;
		return customer;
	}

	private static boolean emptyQueue() {
		return Rear<0;
	}

	private static boolean enQueue(String customer) {
		boolean flag = false;
		if (Rear >= 50) {
			flag = false;
		} else {
			Rear++;
			Queue[Rear]=customer;
			flag=true;
		}
		return flag;
	}

	private static void disp_Queue() {
		System.out.printf("\n==目前有 %d 位客戶掛號==\n", Rear + 1);
		for (int i = 0; i <= Rear; i++) {
			System.out.printf("(%2d) %s \n", i + 1, Queue[i]);
		}

	}

	private static void disp_menu() {
		System.out.printf("==歡迎光臨 甄美麗掛號系統==\n");
		System.out.printf("(1) 列印目前掛號客戶名單\n");
		System.out.printf("(2) 客戶掛號\n");
		System.out.printf("(3) 醫生看診客戶\n");
		System.out.printf("(4) 離開系統\n");
		System.out.printf("\t請輸入工作選項 => ");

	}

}
