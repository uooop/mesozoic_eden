package week4;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = 2;
		byte b2 = 3;
		// byte b3 = b1 + b2;
		byte b4 = (byte) (b1 + b2);

		boolean a = false, b = false, c = false;
		boolean bool = (a = true) || (b = true) && (c = true);
		// System.out.println(a + "," + b + "," + c);

		boolean q1 = false, q2 = true;
		boolean res = q1 & (q2 = false);
		// System.out.println(q1 + " " + q2 + " " + res);

		boolean a1 = (5 > 1) ^ (10 < 20);
		boolean a2 = (5 > 10) ^ (10 < 20);
		boolean a3 = (5 > 10) ^ (10 < 2);
		boolean a4 = (5 > 10) ^ (10 < 20);
		// System.out.println(a1 + " " + a2 + " " + a3 + " " + a4);

		byte c1 = 6 & 8;
		byte c2 = 7 | 9;
		byte c3 = 5 ^ 4;
		System.out.println(c1 + "," + c2 + "," + c3);
	}

}
