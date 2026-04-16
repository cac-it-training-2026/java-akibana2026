package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		//1
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String stocks_str;
		String amounts_str;
		int prices_sum = 0;

		int[] stocks = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の在庫数:>");
			stocks_str = reader.readLine();
			stocks[i] = Integer.parseInt(stocks_str);
		}

		for (int i = 0; i < 5;) {
			System.out.print(itemNames[i] + "の購入数:>");
			amounts_str = reader.readLine();
			amounts[i] = Integer.parseInt(amounts_str);
			if (amounts[i] > stocks[i]) {
				System.out.println("在庫を超えています。もう一度入力してください。");
				continue;
			}
			stocks[i] -= amounts[i];
			i++;
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + ":購入" + amounts[i] + "個");
			System.out.println("在庫" + stocks[i]);
			prices_sum += (amounts[i] * prices[i]);
		}

		System.out.println("割引前合計:" + prices_sum + "円");

		//1
		if (prices_sum >= 5000) {
			prices_sum *= 0.9;
			System.out.println("割引適用（10%OFF）:" + prices_sum + "円");
		}

		//2
		prices_sum *= 1.1;
		System.out.println("税込合計:" + prices_sum + "円");

	}

}
