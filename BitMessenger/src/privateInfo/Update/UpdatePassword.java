package privateInfo.Update;

import domain.BitMessenger;
import util.Getter;

public class UpdatePassword {
	public UpdatePassword(BitMessenger info) {
		Getter.getMapper().updatePassword(info);
	}
}
