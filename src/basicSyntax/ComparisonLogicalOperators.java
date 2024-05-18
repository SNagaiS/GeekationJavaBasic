package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {

		int a = 496;
		int b = 28;
		boolean ab = (a > b);
		System.out.println(ab);

		boolean isSunny = true;
		boolean isWarm = true;
		System.out.println(isSunny && isWarm);

		int x = 75;
		int y = 48;
		boolean xy = (x >= 0 && (y % 2 == 0));
		System.out.println(xy);

		boolean hasPermission = !(false);
		System.out.println(hasPermission);
	}

}
