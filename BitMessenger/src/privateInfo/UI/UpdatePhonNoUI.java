package privateInfo.UI;

import checkObject.CheckPhonNo;
import privateInfo.Update.UpdatePhonNo;
import util.Getter;

public class UpdatePhonNoUI implements UpdateInfoBaseUI {
	CheckPhonNo cpn = new CheckPhonNo();
	public void service() {
		while(true) {
			subUI.msg("Phon Number",Getter.getMapper().selectPhonNo(info.getNo()));
			switch(subUI.ui("Phon Number")) {
			case "1" : info.setPhonNo(checkPhonNoUI(Getter.getStr("Phon Number 입력 : ")));
					   new UpdatePhonNo(info);
					   break;
			case "0" : return;
			default : System.out.println("잘못 입력하셨습니다."); continue;
			}
		}
	}
	
	public String checkPhonNoUI(String phon) {
		while(true) {
			switch(cpn.CheckPhonNo(phon)) {
			case 0 : return phon;
			case 1 : System.out.println("---------------------------------");
					 System.out.println("핸드폰 번호는 \"-\" 를 제외한 숫자만 입력해주세요");
					 System.out.println("---------------------------------");
					 break;
			case 2 : System.out.println("---------------------------------");
					 System.out.println("- 핸드폰 번호는 10또는 11자리로 입력해주세요 -");
					 System.out.println("---------------------------------");
					 break;
			}
		phon = Getter.getStr("Phon Number 입력 : ");
		}// end while

	}
	
}
