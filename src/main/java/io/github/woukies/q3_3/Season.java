package io.github.woukies.q3_3;

public class Season {
	public void rsltSeason(int month) {
		System.out.print("�Էµ� ������ " + month + "�� ������ ");
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ�");
			break;
		default:
			System.out.println("�����ϴ�");
		}
	}
}