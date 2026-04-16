package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//1
		int amount = 0;
		//2
		int price = 100;
		//3
		System.out.println("鉛筆を購入しますか?");
		System.out.println("はい：0、いいえ:1>");
		//4
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buyFlag_str = reader.readLine();
		int buyFlag = Integer.parseInt(buyFlag_str);
		//5
		while (buyFlag == 0) {
			amount++;
			System.out.println("購入する鉛筆の本数を1つ増やしますか？");
			System.out.println("はい：0、いいえ:1>");
			buyFlag_str = reader.readLine();
			buyFlag = Integer.parseInt(buyFlag_str);
		}

		System.out.println("購入した鉛筆の本数は" + amount + "本です。");
		System.out.println("購入した鉛筆の合計金額は" + (amount * price) + "円です。");
	}

}
