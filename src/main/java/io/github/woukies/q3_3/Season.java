package io.github.woukies.q3_3;

public class Season {
	public void rsltSeason(int month) {
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("�Էµ� ������ " + month + "�� ������ ��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�Էµ� ������ " + month + "�� ������ ����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�Էµ� ������ " + month + "�� ������ ����");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("�Էµ� ������ " + month + "�� ������ �ܿ�");
			break;
		default:
			System.out.println("�߸��� �����Դϴ�.");
		}
	}
}
