package privateInfo.Update;

import domain.BitMessenger;
import util.Getter;

public class UpdatePhonNo {
	public UpdatePhonNo(BitMessenger info) {
		Getter.getMapper().updatePhonNo(info);
	}
}
