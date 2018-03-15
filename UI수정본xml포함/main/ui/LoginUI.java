package main.ui;



import java.util.Scanner;

import domain.BitMessenger;
import util.Getter;

public class LoginUI {
	Scanner sc = new Scanner(System.in);
	Getter getter = new Getter(); 
	BitMessenger info = new BitMessenger();
	
	
	public void login() {
	LoginUI login = new LoginUI();
		
	info.setId(Getter.getStr("ID : "));
	info.setPass(Getter.getStr("PassWord : "));
	String result = Getter.getMapper().selectUserIdPass(info);
	
	if(result == null) {
		System.out.println("ID or PassWord가 일치하지 않습니다.");
		System.out.println();
		System.out.println("1 . ID and PassWord를 찾기   2 . 메인 화면으로 이동  ");
		String para = sc.nextLine();
		
		login.choose(para);
		
	}else {
		new SignInUI().signService();
		Getter.Loginuserinfo(info);		
	}
	
	}

	public void choose(String para) {
	
		
		
		if(para == "1") {
			FindIDPwUI find = new FindIDPwUI();
			find.findIdPw();
		}else if(para == "2"){
			Main main = new Main();
			main.service();
		}else {
			System.out.println("입력하신 번호는 항목에 없습니다. ");
		}
		
		
		
	}
	
	
	
	
}