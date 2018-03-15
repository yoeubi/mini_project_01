package main.ui;


import domain.BitMessenger;
import mapper.BitMessengerMapper;
import util.Getter;

public class FindIDUI  {


//	 ID찾기

	public void service() {
		BitMessenger info = new BitMessenger();

		info.setName(Getter.getStr(" 이름 : "));
		info.setPhonNo(Getter.getStr("Phone No :"));
		BitMessengerMapper mapper = Getter.getMapper();
		BitMessenger result = mapper.selectUserIdPhoneNo(info);
		
		if(result.getPhonNo().equals(info.getPhonNo())) {
			System.out.println(result.getName() + "님의 ID : " + result.getId());
			System.out.println();
			System.out.println();
			new LoginUI().login();
		}else  {
			System.out.println("존재하는 ID가 없습니다.");
			new Main().service();
		}
		

		
	}
	
}	
	
	
	

