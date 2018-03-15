package privateInfo.UI;


import privateInfo.Update.UpdateStatueMsg;
import util.Getter;

public class UpdateStatueMsgUI implements UpdateInfoBaseUI {
	public void service() {
		while(true) {
			subUI.msg("메세지",Getter.getMapper().selectStatueMsg(info.getNo()));
			switch(subUI.ui("메세지")) {
			case "1" : info.setStatueMsg(updateSubStatueMsgUI());
					   new UpdateStatueMsg(info);
					   break;
			case "0" : return;
			default : System.out.println("잘못 입력하셨습니다."); continue;
			}
		}
	}
	
	String updateSubStatueMsgUI() {
		System.out.println("---------------------------------");
		String data = Getter.getStr("메세지 입력 : ");
		System.out.println("변경이 완료되었습니다.");
		System.out.println("---------------------------------");
		return data;
	}
	
}
