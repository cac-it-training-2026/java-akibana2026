package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//1
		String[] itemNames = new String[5];
		String[] itemPrice_str = new String[5];
		int[] Prices = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("商品" + (i + 1) + "を入力してください:>");
			itemNames[i] = reader.readLine();
		}

		//2

		System.out.println("各商品の単価を順に入力してください:");

		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の単価:>");
			itemPrice_str[i] = reader.readLine();
			Prices[i] = Integer.parseInt(itemPrice_str[i]);
		}

		//3
		System.out.println("登録商品一覧");

		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + ":" + Prices[i] + "円");
		}
	}

}
