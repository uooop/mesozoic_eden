package week4;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int currentYear = 2024;
		boolean isLeapYear = currentYear % 4 == 0 && (currentYear % 100 != 0 || currentYear % 400 == 0);
		System.out.println("올해는 윤년이다."+isLeapYear);
		}
	}

