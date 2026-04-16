package basic.question06;

import java.io.IOException;

public class Question06_1 {

	public static void main(String[] args) throws IOException {

		//1
		String[] messages = { "こんにちは", "Javaの学習中", "繰り返しの演習", "頑張ります" };
		//2
		for (int i = 0; i < 4; i++) {
			System.out.println(messages[i]);
		}
		//3
		System.out.println("繰り返し処理が終了しました。");
	}
}
