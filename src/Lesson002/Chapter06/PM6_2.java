package Lesson002.Chapter06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PM6_2 {

	public static void main(String[] args) throws IOException {
		Employee[] worker = new Employee[20];
		String file = "Human.data";
		String inData;
		int k = 0;
		File fileID = new File(file);
		// --read
		System.out.printf("==由 Human.data讀取並顯示==\n");
		if (fileID.exists()) {
			BufferedReader data_R = new BufferedReader(new FileReader(fileID));
			System.out.printf("代號\t姓名\t部門\t底薪\t加級\n");
			while ((inData = data_R.readLine()) != null) {
				Scanner s = new Scanner(inData).useDelimiter("\t");
				worker[k]=new Employee();
				worker[k].ID = s.nextInt();
				worker[k].name = s.next();
				worker[k].depart = s.next();
				worker[k].payment = s.nextInt();
				worker[k].duty = s.nextInt();
				k++;
			}

			//System.out.printf("%s\n", inData);
			data_R.close();
		} else
			System.out.printf("\n%s 檔案讀取錯誤\n", file);
		System.out.printf("\n==Human.data輸入完畢==\n");
		
		//--cal
		int value,tax;
		System.out.printf("\n\n**印出員工薪資表**\n");
		System.out.printf("員工資料\t\t薪資總額\t預扣稅額\t應領薪資\n");
		for (int i=0;i<k;i++) {
			System.out.printf("%s",worker[i].name);
			System.out.printf("(%d",worker[i].ID);
			System.out.printf("%s)",worker[i].depart);
			value=worker[i].payment+worker[i].duty;
			System.out.printf("  %d\t\t",value);
			tax=(int)(value*0.1);
			System.out.printf("%d\t\t",tax);
			value=value-tax;
			System.out.printf("%d\n",value);
		}

	}

}
