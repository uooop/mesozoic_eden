package week4;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int safetyRating = 9;
		int safetyThreshold = 7;
		
		if (safetyRating > safetyThreshold) {
            System.out.println("안전 등급이 우수합니다. 공원 운영이 계속됩니다.");
        } else {
            System.out.println("주의! 안전 등급이 임계값 이하로 떨어졌습니다. 안전 조치가 필요합니다.");
        }
	}

}
