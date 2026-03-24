package om.interview.test;

public class IntegerOVerflow {

	public static void main(String[] args) {

		int a = Integer.MAX_VALUE;

		System.out.println("a: " + a);

		int b = a + 1;

		System.out.println("b: " + b);//b will be negative because of integer overflow

		int c = a - 1;

		System.out.println("c: " + c);//c will be 2147483646 because it is one less than the maximum value of integer
	}

}
