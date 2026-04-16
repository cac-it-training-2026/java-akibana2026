package basic.question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第7章 配列
 */

public class Question04_2 {

	public static void main(String[] args) throws IOException {

		//1
		int[] ageGroup = { 23, 33, 26, 21, 25, 22 };
		//2
		System.out.println("4番目の人の年齢を入力してください。");
		//3
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String temporaryAge_str = reader.readLine();
		int temporaryAge = Integer.parseInt(temporaryAge_str);
		//4
		ageGroup[3] = temporaryAge;
		//5
		System.out.println("4番目の人の年齢は" + ageGroup[3] + "歳です。");
		//6
		System.out.println("人数は" + ageGroup.length + "人です。");
	}

}
