package Lesson002.Chapter06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex6_2 {

	public static void main(String[] args) throws IOException {
		Scanner keyin = new Scanner(System.in);
		Employee[] worker = new Employee[20];

		String file = "Human.data";
		BufferedWriter data = new BufferedWriter(new FileWriter(file));
		int k = 0;
		String sel;

		do {
			System.out.printf("\n是否繼續輸入員工資料 (yes/no) => ");
			sel = keyin.nextLine();
			if (sel.equals("no") == true)
				break;
			worker[k] = new Employee();
			System.out.printf("**輸入員工資料**\n");
			System.out.printf("輸入員工姓名 => ");
			worker[k].name = keyin.nextLine();
			System.out.printf("輸入所屬部門  => ");
			worker[k].depart = keyin.nextLine();
			System.out.printf("輸入員工代號  => ");
			worker[k].ID = keyin.nextInt();
			System.out.printf("輸入員工底薪  => ");
			worker[k].payment = keyin.nextInt();
			System.out.printf("輸入薪資加級  => ");
			worker[k].duty = keyin.nextInt();
			keyin.nextLine();
			k++;
		} while (true);

		// --write
		System.out.printf("\n**將員工資料輸出到 Human.data 檔案內**\n");
		for (int i = 0; i < k; i++) {
			data.write(worker[i].ID + "\t");
			data.write(worker[i].name + "\t");
			data.write(worker[i].depart + "\t");
			data.write(worker[i].payment + "\t");
			data.write(worker[i].duty + "\n");
		}
		data.close();
		System.out.printf("\n**輸出完畢**\n");

		// --read
		System.out.printf("==由 Human.data讀取並顯示==\n");
		String inData;
		File fileID = new File(file);
		if (fileID.exists()) {
			BufferedReader data_R = new BufferedReader(new FileReader(fileID));
			System.out.printf("代號\t姓名\t部門\t底薪\t加級\n");
			while ((inData = data_R.readLine()) != null)
				System.out.printf("%s\n", inData);
			data_R.close();
		}else System.out.printf("\n%s 檔案讀取錯誤\n",file);
		System.out.printf("\n==Human.data輸入完畢==\n");

	}

}
