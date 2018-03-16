package friend;

import java.util.Scanner;

/**
 * @author mook2
 * 친구 검색
 */
public class FSearch {
	Scanner sc = new Scanner(System.in);
	Add add = new Add();
	
	public void frSearchId() {
		System.out.println("ID 검색: ");
		
		String scId = sc.nextLine();
		if (scId != null) {
			System.out.println("" + "가 검색되었습니다.");
			System.out.println("1. ģ�� ��û�ϱ�");
			System.out.println("2. �ٽ� �˻��ϱ�");
			System.out.println("0. ���� �޴��� ���ư���");
			int menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1 : 
			case 2 : frSearchId(); break;
			case 0 : add.frAdd(); break;
			}
			
			
		} else {
			System.out.println("�������� �ʴ� ID�Դϴ�.");
			System.out.println("�ٽ� �˻��Ͻðڽ��ϱ�?");
			System.out.println("1.��	/	0. ���� �޴��� ���ư���");
			int menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1 : frSearchId(); break;
			case 2 : add.frAdd(); break;
			}
		}
	}
	
	public void frSearchPN() {
		System.out.println("�ڵ�����ȣ �˻� : ");
		
		String scPN = sc.nextLine();
		if (scPN != null) {
			System.out.println("BBB" + "�� �˻��Ǿ����ϴ�");
			System.out.println("1. ģ�� ��û�ϱ�");
			System.out.println("2. �ٽ� �˻��ϱ�");
			System.out.println("0. ���� �޴��� ���ư���");
			int menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1 : 
			case 2 : frSearchPN(); break;
			case 0 : add.frAdd(); break;
			}
		} else {
			System.out.println("�������� �ʴ� ID�Դϴ�.");
			System.out.println("�ٽ� �˻��Ͻðڽ��ϱ�?");
			System.out.println("1.��	/	0. ���� �޴��� ���ư���");
			int menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1 : frSearchPN(); break;
			case 2 : add.frAdd(); break;
			}
		}
	}
	
}
