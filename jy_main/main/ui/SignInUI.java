package main.ui;

import java.util.Scanner;

import chatting.CList;
import friend.Add;
import friend.FList;
import friend.Request;
import privateInfo.UI.UpdateInfoUI;
import util.Getter;


		// 로그인 된 화면 

public class SignInUI {
	Scanner sc = new Scanner(System.in);
	public void signService() {
		
		while (true) {
			switch (menu()) {
			case "1": new FList().list(); break; 
			case "2": new CList().clist(); break;
			case "3": new Add().fadd();    
			case "4": new UpdateInfoUI().updateInfoMainUI();
			case "5": new Request().frequest(); break;
			case "9": mainUI();
			case "0": quit();
			}
		}
	}	
	
	
	private void mainUI() {
		
		Main main = new Main();
		main.service();
		Getter.info = null;
	}
	
	private void quit() {
		System.out.println("메신저 종료합니다.");
		System.exit(0);
	}

	private String menu() {
		
		
		System.out.println(Getter.getLoginInfo().getName()+ "님 안녕하세요 :')  ");
		System.out.println("1. 친구목록");
		System.out.println("2. 대화목록");  
		System.out.println("3. 친구추가 ");
		System.out.println("4. 정보수정");
		System.out.println("5. 친구요청	"  ); 
		System.out.println("9. 기초화면 ");
		System.out.println("0. 로그아웃");
		System.out.println();
		System.out.print("원하시는 항목을 선택하세요  : ");
		return sc.nextLine();
		
	}			

	
}
