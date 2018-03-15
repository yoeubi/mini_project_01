package main.ui;


import domain.BitMessenger;
import util.Getter;

public class FindIDUI  {

//	 ID찾기

	public void service() {
		BitMessenger info = new BitMessenger();

		info.setId(Getter.getStr(" 이름 : "));;
		info.setPhonNo(Getter.getStr("Phone o :"));
//		mapper.insertID(info);
	
		
		
		
	}
	
}	
	
	
	

