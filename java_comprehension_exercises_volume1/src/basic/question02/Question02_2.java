package basic.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第5章 入出力
 */

public class Question02_2 {

	public static void main(String[] args) throws IOException {
		//1
		System.out.println("商品の名前と値段を入力してください。");
		//2
		System.out.println("名前:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String itemName = reader.readLine();
		//3
		System.out.println("値段:");
		String itemPrice_str = reader.readLine();
		int itemPrice = Integer.parseInt(itemPrice_str);
		//4
		System.out.println("商品の名前は" + itemName + "です。");
		System.out.println("商品の値段は" + itemPrice + "円です。");
	}
}
