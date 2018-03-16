package friend;

import java.util.Scanner;

/**
 * @author mook2
 * 추천 친구 프로필
 */
public class RecommendFriendProfile {
	Scanner sc = new Scanner(System.in);
	
	public void reFrPr() {
		System.out.println("BBB" + "���� �������Դϴ�.");
		System.out.println("���� �޼���");
		System.out.println("1. ģ�� ��û�ϱ�");
		System.out.println("0. ���� �޴��� ���ư���");
		int menu = Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		case 1 :  Request req = new Request();
				  req.request(); 
				  break;
		case 0 : Recommend recmd = new Recommend(); 
				 recmd.recomdFr();
				 break;
		}
		
	}
}
