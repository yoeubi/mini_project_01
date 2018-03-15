package privateInfo.UI;
/**
 * 
 * @author 진솔
 * 		회원정보 수정 UI 클래스
 * 
 */
import util.Getter;

public class UpdateInfoUI {

	public void updateInfoMainUI() {
		UpdateInfoBaseUI ui = null;
		while(true) {
			switch(subUI()) {
			case "1" : ui = new UpdateSelectInfo(); break;
			case "2" : ui = new UpdatePrivateInfoUI(); break;
			case "3" : ui = new UpdateStatueMsgUI(); break;
			case "4" : ui = new UpdateBlockUI(); break;
			case "5" : ui = new UpdateInvisibleUI(); break;			
			case "0" : return;
			case "9" : System.out.println("종료합니다."); System.exit(0);
			default : System.out.println("잘못 입력하셨습니다."); continue;
			
			}
			ui.service();
		}
	}
	
	private String subUI() {
		System.out.println("1. 가입정보");
		System.out.println("2. 개인정보수정");
		System.out.println("3. 상태메세지");
		System.out.println("4. 검색차단관리");
		System.out.println("5. 회원탈퇴");
		System.out.println("0. 돌아가기");
		System.out.println("9. 종료");
		System.out.println("---------------------------------");
		return Getter.getStr("메뉴를 선택하세요 : ");
	}
	
}
