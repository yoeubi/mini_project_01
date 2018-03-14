package mapper;

import domain.BitMessenger;

public interface BitMessengerMapper {
	//진솔
	void insertMember(BitMessenger info); // 회원가입
	String selectMemberByNoGetID(String id); // 중복id 확인
	void updateStatueMsg(BitMessenger info); // 상태메세지 설정
	String selectStatueMsg(int no);
}
