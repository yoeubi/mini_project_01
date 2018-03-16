package main.ui;

import java.util.Scanner;

import join.JoinUI;


		// 메인

public class Main {
	Scanner sc = new Scanner(System.in);

	
	public void service()  {
		
		switch (menu()) {
			case "1": new JoinUI().joinUI(); break;
			case "2": new LoginUI().login(); break;
			case "3": new FindIDPwUI().findIdPw(); break;
			default : worngNo(); 		 
		}
	}
			
	private void worngNo() {
		System.out.println("처리할 항목이 아닙니다.");
		service();
	}
	
	private String menu() {
		System.out.println("================================");
		System.out.println();
		System.out.println("	Hello BIT Messemger	:D ");
		System.out.println();
		System.out.println("================================");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 비밀번호, 아이디 찾기 ");
		System.out.println();
		System.out.println("================================");
		System.out.println();
		System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
		return sc.nextLine();
	}			

	
}
