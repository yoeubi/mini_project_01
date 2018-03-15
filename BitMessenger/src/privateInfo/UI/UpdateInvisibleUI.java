package privateInfo.UI;

import checkObject.CheckPass;
import util.Getter;

public class UpdateInvisibleUI implements UpdateInfoBaseUI {
	private CheckPass cp = new CheckPass();
	
	public void service() {
		subUI.checkPassword(Getter.getMapper().selectPassword(info.getNo()),"[탈퇴하기]",cp);
		System.out.println("정말 탈퇴하시겠습니까?");
		System.out.println("---------------------------------");
		System.out.println("9. YES");
		System.out.println("0. NO");
		System.out.println("---------------------------------");
		while(true) {
			switch(Getter.getStr("메뉴를 선택해주세요 : ")) {
			case "9" : System.out.println("이용해주셔서 감사합니다.");
					   System.out.println("자동으로 메신저가 종료됩니다.");
					   Getter.getMapper().updateinvisibleMember(info.getNo());
					   System.exit(0);
				       break;		
			case "0" : return;
			default : System.out.println("잘못 입력하셨습니다."); continue;
			}
		}
	}
	
	
	
}
