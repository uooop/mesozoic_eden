package week4;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 12;
		// char c2 = 90_000;
		short s = 12;
		// s = c;
		s = (short) c;
		// c = s;
		c = (char) s;

		final char c1 = 12;
		short s1 = 12;
		s1 = c1;

		System.out.println("c= " + c + ", s= " + s + ", s1= " + s1 + ", c1= " + c1);
	}

}
