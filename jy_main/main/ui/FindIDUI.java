package main.ui;


import domain.BitMessenger;

import util.Getter;

public class FindIDUI  {


	//	 ID찾기

	public void service() {
		BitMessenger info = new BitMessenger();

		info.setName(Getter.getStr(" 이름 : "));
		info.setPhonNo(Getter.getStr("Phone No :"));
		
		BitMessenger result = Getter.getMapper().selectUserIdPhoneNo(info);
		
		if(result.getPhonNo().equals(info.getPhonNo())) {
			System.out.println(result.getName() + "님의 ID : " + result.getId());
			new Main().service();
		}else  {
			System.out.println("존재하는 ID가 없습니다.");
			new Main().service();
		}
		
	}
	
}	
	
	
	

