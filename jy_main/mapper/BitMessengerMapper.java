package mapper;




import domain.BitMessenger;

public interface BitMessengerMapper {
	void insertMember(BitMessenger info);
	String selectMemberByNoGetID(String id);
	
	BitMessenger selectUserIdPass(BitMessenger info); // 로그인 아이디와 비번이 매치되는지 
	
	BitMessenger selectUserIdPhoneNo (BitMessenger info); //id 와 phone 매치 되는지
	
	
	
}
