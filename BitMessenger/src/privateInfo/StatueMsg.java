package privateInfo;

import domain.BitMessenger;
import util.Getter;

public class StatueMsg {
	BitMessenger info;
	public StatueMsg(BitMessenger info) {
		this.info = info;
		Getter.getMapper().updateStatueMsg(info);
	}

}
