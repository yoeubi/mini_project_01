package privateInfo.UI;

import domain.BitMessenger;
import util.Getter;

interface UpdateInfoBaseUI {
	BitMessenger info = Getter.getLoginInfo();
	UpdateSubUI subUI = new UpdateSubUI();
	abstract void service();
}
