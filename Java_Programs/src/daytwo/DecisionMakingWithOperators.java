package daytwo;

public class DecisionMakingWithOperators {
	public static void main(String[] args) {
		int x = 8, y = 7;
		int a = 10;
		int b = 11;

		if (x >= y) {
			System.out.println("X is greater than Y");
		} else {
			System.out.println("Y is Greater Than X");
		}

		if (!(a < b) || (a == b)) {
			System.out.println("Condition is TRUE");
		} else

		{
			System.out.println("Condition is FALSE");
		}
	}
}
