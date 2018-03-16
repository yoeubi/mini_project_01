package checkObject;
/**
 * 
 * @author 진솔
 *		
 *		Password 무결성 체크 클래스
 *
 */

public class CheckPass {

	public boolean spellCheckPass(String pass) {
		for(int i = 0 ; i < pass.length() ; i++) {
			if(pass.charAt(i) >= 33 && pass.charAt(i) <=126) { continue; }
			else return false;
		}
		return true;
	}
	
	public boolean checkConfirmPass(String pass, String confirmPass) {
			if(confirmPass.equals(pass)) { return true; }
			else { return false; }
	}
}