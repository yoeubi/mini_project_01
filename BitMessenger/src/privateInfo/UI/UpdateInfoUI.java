package privateInfo.UI;
/**
 * 
 * @author 진솔
 * 		회원정보 수정 UI 클래스
 * 
 */
import util.Getter;

public class UpdateInfoUI {
	private int no;
	public UpdateInfoUI(/**회원 고유번호*/int no) {
		this.no = no;
	}
	
	public void updateInfoMainUI() {
		
		while(true) {
			switch(subUI()) {
			case 1 : break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 0 : return;
			default : System.out.println("잘못 입력하셨습니다."); continue;
			
			}
		}
	}
	
	private int subUI() {
		System.out.println("1. 정보수정");
		System.out.println("2. 상태메세지");
		System.out.println("3. 차단관리");
		System.out.println("4. 회원탈퇴");
		System.out.println("0. 돌아가기");
		System.out.println("---------------------------------");
		return Getter.getInt("메뉴를 선택하세요 : ");
	}
	
}
