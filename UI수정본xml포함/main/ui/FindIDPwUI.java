package main.ui;


import util.Getter;

public class FindIDPwUI {
	public void findIdPw() {
	
		System.out.println("1. ID 찾기 ");
		System.out.println("2. PassWord 찾기 ");
		String result = Getter.getStr("원하시는 항목을 선택 해주세요 : ");
		
		if(result.equals("1")) {
			new FindIDUI().service();
		}else if(result.equals("2")) {
			new FindPwUI().findPwUI();
		}else {
			System.out.println("번호를 잘못 누르셨습니다.");
			new FindIDPwUI().findIdPw();
		}
		
		
		
		
	}
	
}

