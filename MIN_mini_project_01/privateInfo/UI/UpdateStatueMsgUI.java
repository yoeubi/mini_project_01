package privateInfo.UI;


import privateInfo.UpdateStatueMsg;
import util.Getter;

public class UpdateStatueMsgUI implements UpdateInfoBaseUI {

	public void service() {
		while(true) {
			subUI.msg("메세지",Getter.getMapper().selectStatueMsg(info.getNo()));
			switch(subUI.ui("메세지")) {
			case "1" : info.setStatueMsg(subUI.updateInfo("메세지"));
					   new UpdateStatueMsg(info);
					   break;
			case "0" : return;
			default : System.out.println("잘못 입력하셨습니다."); continue;
			}
		}
	}

}
