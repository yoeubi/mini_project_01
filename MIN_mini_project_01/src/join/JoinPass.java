package join;

/**
 * 
 * @author 진솔
 *		
 *		회원가입시 무결성 Password체크 UI 클래스
 *
 */

import checkObject.CheckPass;
import util.Getter;

public class JoinPass {
	private CheckPass cp = new CheckPass();
	public String checkPass(String pass) {
		while(true) {
			if(cp.spellCheckPass(pass)) {
			return pass;
			} // end if
			else {
				System.out.println("---------------------------------");
				System.out.println("--Password 에는 한글을 사용할 수 없습니다--");
				System.out.println("------Password를 다시 입력해주세요------");
				System.out.println("---------------------------------");
				pass = Getter.getStr("Password      : ");
			} //end else
		} //end while
	} //end checkPass
	
	
	public void confirmPass(String pass, String confirmPass) {
		
		while(true) {
			if(cp.checkConfirmPass(pass, confirmPass)) {
				System.out.println("---------------------------------");
				System.out.println("------사용 가능한 Password 입니다------");
				System.out.println("---------------------------------");
				return;
			} //end if
			else {
				System.out.println("---------------------------------");
				System.out.println("--입력하신 Password 와 일치하지 않습니다--");
				System.out.println("---------------------------------");
				confirmPass = Getter.getStr("Password 확인   : ");
			} //end else
		} //end while
	} //end confirmPass
	
}
