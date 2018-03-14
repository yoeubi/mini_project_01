package join;

import domain.BitMessenger;
import util.Getter;

public class JoinSave {

	public static void saveMember(BitMessenger info) {
		Getter.getMapper().insertMember(info);
		
	}
	
}
