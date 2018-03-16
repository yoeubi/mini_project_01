package mapper;

import domain.BitMessenger;

public interface BitMessengerMapper {
	//진솔
	void insertMember(BitMessenger info); // 회원가입
	String selectMemberByNoGetID(String id); // 중복id 확인
	String selectStatueMsg(int no); // 현재 상태 메세지 확인
	void updateStatueMsg(BitMessenger info); // 상태메세지 설정
	String selectPassword(int no); // 현재 비밀번호 확인
	void updatePassword(BitMessenger info); // 비밀번호 설정
	String selectPhonNo(int no); // 현재 핸드폰 번호 확인
	void updatePhonNo(BitMessenger info); // 핸드폰 번호 설정
	void updateinvisibleMember(int no); // 회원탈퇴
	void updateBlockSearch(BitMessenger info); // 검색차단 설정
	int selectBlockSearch(int no); // 현재 검색차단 상태 확인
	BitMessenger selectSearchAll(BitMessenger info); // 회원 가입정보 확인
	String selectPhonNoOverlap(String phonNo); // 핸드폰 번호 중복테스트
	String selectSetPhonNoGetId(String phonNo); // 핸드폰 번호 입력 id반환
	BitMessenger selectSearchInfo(String id); // 친구추가 검색시 id 입력으로 해당 회원 정보 뽑아내기

	
}
