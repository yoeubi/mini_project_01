package friend;

import java.util.Scanner;

public class Recommend {
	Scanner sc = new Scanner(System.in);
	
	public void recomdFr() {
		System.out.println("1." + "BBB\t" + "AAA님의 친구");
		System.out.println("2." + "CCC\t" + "AAA님의 친구");
		System.out.println("3." + "DDD\t" + "AAA님의 친구");
		System.out.println("4." + "EEE\t" + "AAA님의 친구");
		System.out.println("번호를 누르시면 프로필로 이동합니다.");
		System.out.println("0. 이전 메뉴로 돌아가기");
		int goToProfile = Integer.parseInt(sc.nextLine());
		switch(goToProfile) {
		case 1 : 
		case 2 : 
		case 3 : 
		case 4 : 
		case 0 : 
		}
		
	}
}
