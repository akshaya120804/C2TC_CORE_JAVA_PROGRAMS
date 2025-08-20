package daytwo;

public class OperatorsDemo {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		int x = 10;
		System.out.println("a and b value before the operations: " + a + " " + b);

		++a;
		int c = ++a + b + a--;
		System.out.println("c value after the operations: " + c);

		int d = c++ + a + b--;
		System.out.println("d value after the operations: " + d);

		System.out.println("a,b,c,d values after the operations: " + a + " " + b + " " + c + " " + d);
		
		System.out.println("\nTernary Operator :");
		int y = (20 == x) ? 1 : 0;	
		System.out.println(y);
		System.out.println("x : "+x);
	}
}
