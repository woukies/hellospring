package io.github.woukies.q3_3;

public class Season {
	public void rsltSeason(int month) {
		System.out.print("입력된 정수가 " + month + "은 계절이 ");
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("없습니다");
		}
	}
}
