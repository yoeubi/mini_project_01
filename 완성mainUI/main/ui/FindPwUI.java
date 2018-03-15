package main.ui;

import domain.BitMessenger;
import mapper.BitMessengerMapper;
import util.Getter;

public class FindPwUI  {
		
	public void findPass() {
		
		
		BitMessenger info = new BitMessenger();
		
		info.setName(Getter.getStr(" 이름 : "));
		info.setPhonNo(Getter.getStr("Phone No :"));
		BitMessengerMapper mapper = Getter.getMapper();
		BitMessenger result = mapper.selectUserIdPhoneNo(info);
	
		if(result.getPhonNo().equals(info.getPhonNo())) {
			System.out.println(result.getName() + "의  PassWord Hint : "+ result.getPassHint().toString());
			System.out.println();
			System.out.println();
			String key = Getter.getStr("질문의 답을 작성하세요 : ");
			System.out.println();
			System.out.println();
			
			if(key.toString().equals(result.getPassKey())) {
				System.out.println(result.getName() + "님의  PassWord : " + result.getPass().toString());
				System.out.println();
				System.out.println();
				new LoginUI().login();
			}else {
				System.out.println("질문의 답이 틀렸습니다.");
				System.out.println();
				System.out.println();
				new FindIDPwUI().findIdPw();
			}
		}else {
			System.out.println("존재하지 않는 회원 입니다.");
			System.out.println();
			new Main().service();
		}
	
		
	}

		

		
		
	
}
	
	
		
		

//		 
	
	
