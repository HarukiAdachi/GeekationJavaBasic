package basicSyntax;

import java.util.ArrayList;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int Num1 = 350;
		int Num2 = 175;

		ArrayList<Integer> results = new ArrayList<Integer>();

		results.add(addition(Num1, Num2));
		results.add(subtraction(Num1, Num2));
		results.add(multiplication(Num1, Num2));
		results.add(division(Num1, Num2));

		for (int result : results) {
			resulter(result);
		}
	}

	public static int addition(int Num1, int Num2) {
		int add = Num1 + Num2;
		return add;

	}

	public static int subtraction(int Num1, int Num2) {
		int sub = Num1 - Num2;
		return sub;

	}

	public static int multiplication(int Num1, int Num2) {
		int mul = Num1 * Num2;
		return mul;

	}

	public static int division(int Num1, int Num2) {
		int div = Num1 / Num2;
		return div;

	}

	public static void resulter(int result) {
		System.out.println("計算結果は" + result + "です。");
	}

}
