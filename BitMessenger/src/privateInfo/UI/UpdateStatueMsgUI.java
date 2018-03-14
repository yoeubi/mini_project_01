package privateInfo.UI;

import domain.BitMessenger;
import privateInfo.StatueMsg;
import util.Getter;

public class UpdateStatueMsgUI extends UpdateInfoBaseUI {
	BitMessenger info;
	
	public UpdateStatueMsgUI(BitMessenger info) {
		this.info = info;
	}

	public void service() {
		while(true) {
			String msg = Getter.getMapper().selectStatueMsg(info.getNo());
			System.out.printf("현재 메세지 : %s\n",
					(msg != null)? msg : "설정된 메세지가 없습니다.");
			switch(subUI()) {
			case "1" : updateMsg(); new StatueMsg(info);
			case "2" : return;
			default : System.out.println("잘못 입력하셨습니다."); continue;
			}
		}
	}
	
	private String subUI() {
		System.out.println("1. 메세지 변경");
		System.out.println("2. 돌아가기");
		return Getter.getStr("메뉴를 선택하세요 : ");
	}
	
	private void updateMsg() {
		System.out.println("---------------------------------");
		info.setStatueMsg(Getter.getStr("메세지 입력 : "));
		System.out.println("변경이 완료되었습니다.");
		System.out.println("---------------------------------");
	}
	
	
}
