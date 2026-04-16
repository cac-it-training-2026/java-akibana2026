package basic.question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第8章 条件分岐
 */

public class Question05_1 {

	public static void main(String[] args) throws IOException {

		//1
		System.out.println("年齢を入力してください。");
		//2
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String age_str = reader.readLine();
		int age = Integer.parseInt(age_str);
		//3
		if (age < 20) {
			System.out.println("20歳未満なので、お酒の提供ができません。");
		} else {
			System.out.println("20歳以上なので、お酒を提供することが可能です。");

		}
	}
}
