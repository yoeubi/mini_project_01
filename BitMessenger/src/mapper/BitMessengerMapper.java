package mapper;

import domain.BitMessenger;

public interface BitMessengerMapper {
	void insertMember(BitMessenger info);
	String selectMemberByNoGetID(String id);
}
