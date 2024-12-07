package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a = 98;
		int b = 54;

		boolean Bigger = (a > b);

		System.out.println(Bigger);

		boolean isSunny = true;
		boolean isWorm = true;

		boolean result = (isSunny && isWorm);

		System.out.println(result);

		int x = 20;
		int y = 90;

		boolean evenNum = (x >= 0 && y % 2 == 0);

		System.out.println(evenNum);

		boolean hasPermission = false;

		System.out.println(hasPermission == false);

	}

}
