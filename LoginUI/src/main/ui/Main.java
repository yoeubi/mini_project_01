package main.ui;

import java.util.Scanner;

import join.JoinUI;
import util.Getter;


public class Main {
	Scanner sc = new Scanner(System.in);
	Getter getter = new Getter();
	
	

	
	public void service()  {
		JoinUI join = new JoinUI();
		LoginUI login = new LoginUI();
		FindIDPwUI findIdPw = new FindIDPwUI();
		
		switch (menu()) {
			case 1: join.joinUI(); break;
			case 2: login.login(); break;
			case 3: findIdPw.findIdPw(); break;
			default :  worngNo(); break;		 
		}
			
	}
			
			
	private void worngNo() {
		System.out.println("처리할 항목이 아닙니다.");
	}
			
	
	private int menu() {
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 비밀번호, 아이디 찾기 ");
		System.out.println();
		System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
		return Integer.parseInt(sc.nextLine());
	}			

	
}
