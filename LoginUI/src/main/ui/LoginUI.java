package main.ui;



import domain.BitMessenger;
import util.Getter;

public class LoginUI {
	Getter getter = new Getter(); 
	BitMessenger info = new BitMessenger();
	
	
	public void login() {
		
	info.setId(Getter.getStr("ID : "));
	info.setPass(Getter.getStr("PassWord : "));
	int result = Getter.getMapper().selectUserIdPass(info);
	
	if(result == 0) {
		System.out.println("ID or PassWord가 일치하지 않습니다.");
	}else {
		
		SignInUI sign = new SignInUI(result);
		sign.signService();
	}
	
	
	
	
	
	
	}

	
	
	
	
	
}