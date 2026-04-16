package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String sellFlag_str;
		//1
		int amountBooks = 0;
		//2
		int sellFlag = 0;
		//3
		int bookPrice = 200;
		//4
		System.out.println("本を売却します。");
		//5
		do {
			amountBooks++;
			System.out.println("売却する本の冊数を1つ増やしますか?");
			System.out.println("はい:0、いいえ:1>");
			sellFlag_str = reader.readLine();
			sellFlag = Integer.parseInt(sellFlag_str);
		} while (sellFlag == 0);
		//6
		System.out.println("売却する本の冊数は" + amountBooks + "冊です。");
		//7
		System.out.println("売却した本の合計金額は" + (amountBooks * bookPrice) + "円です。");

	}

}
