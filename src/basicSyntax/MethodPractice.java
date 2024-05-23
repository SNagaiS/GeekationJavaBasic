package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 23;
		int b = 29;
		result(sum(a, b));
		result(diff(a, b));
		result(product(a, b));
		result(quotient(a, b));
	}

	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int diff(int a, int b) {
		int diff = a - b;
		return diff;
	}

	public static int product(int a, int b) {
		int product = a * b;
		return product;
	}

	public static int quotient(int a, int b) {
		int quotient = a / b;
		return quotient;
	}

	//メソッド5
	public static void result(int ans) {
		System.out.println("計算結果は" + ans + "です。");
	}
}
