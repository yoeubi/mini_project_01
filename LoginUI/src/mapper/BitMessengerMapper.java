package mapper;

import domain.BitMessenger;

public interface BitMessengerMapper {
	void insertMember(BitMessenger info);
	String selectMemberByNoGetID(String id);
	
	int selectUserIdPass(BitMessenger info); // 로그인 아이디와 비번이 매치되는지 
	
	
	
	
}
