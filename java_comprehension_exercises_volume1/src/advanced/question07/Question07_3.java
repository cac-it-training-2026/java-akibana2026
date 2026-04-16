package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String stocks_str;
		String amounts_str;
		int prices_sum = 0;

		//1
		int[] stocks = new int[5];
		//2
		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の在庫数:>");
			stocks_str = reader.readLine();
			stocks[i] = Integer.parseInt(stocks_str);
		}

		for (int i = 0; i < 5;) {
			System.out.println(itemNames[i] + "の購入数:>");
			amounts_str = reader.readLine();
			amounts[i] = Integer.parseInt(amounts_str);
			if (amounts[i] > stocks[i]) {
				System.out.println("在庫を超えています。もう一度入力してください。");
				continue;
			}
			stocks[i] -= amounts[i];
			i++;
		}

		//3
		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + ":購入" + amounts[i] + "個");
			System.out.println("在庫" + stocks[i]);
			prices_sum += (amounts[i] * prices[i]);
		}

		System.out.println("合計金額:" + prices_sum + "円");

	}
}
