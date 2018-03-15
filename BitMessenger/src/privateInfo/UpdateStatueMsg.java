package privateInfo;

import domain.BitMessenger;
import util.Getter;

public class UpdateStatueMsg {
	public UpdateStatueMsg(BitMessenger info) {
		Getter.getMapper().updateStatueMsg(info);
	}
}
