package basic.question03;

/**
 * 第6章 演算子
 */

public class Question03_2 {

	public static void main(String[] args) {
		//1
		int basePrice = 1200;
		//2
		int tickets = 3;
		//3
		int reducedPrice = basePrice - 200;
		//4
		int reducedTickets = --tickets;
		//5
		int totalPrice = reducedPrice * reducedTickets;
		//6
		double taxRate = 1.1;
		//7
		int totalWithTax = (int) (totalPrice * taxRate);
		//8
		System.out.println("購入可能枚数は" + reducedTickets + "枚です。");
		System.out.println("値下げ後の1枚あたりの料金は" + reducedPrice + "円です。");
		System.out.println("合計金額（税抜）は" + totalPrice + "です。");
		System.out.println("合計金額（税込）は" + totalWithTax + "です。");
	}
}
