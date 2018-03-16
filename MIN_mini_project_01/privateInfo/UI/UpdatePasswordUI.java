package privateInfo.UI;

import checkObject.CheckPass;
import privateInfo.UpdatePassword;
import util.Getter;

public class UpdatePasswordUI implements UpdateInfoBaseUI {
	private CheckPass cp = new CheckPass();

	public void service() {
		confirmPassUI(Getter.getMapper().selectPassword(info.getNo()),"기존");
		while(true) {
			switch(subUI.ui("Password")) {
			case "1" : subUI.msg("Password",Getter.getMapper().selectPassword(info.getNo()));
				       info.setPass(checkPassUI());
				       new UpdatePassword(info);
				       break;		
			case "0" : return;
			default : System.out.println("잘못 입력하셨습니다."); continue;
			}
		}
	}
	
	private String checkPassUI() {
		String pass = Getter.getStr("변경할 Password 입력 : ");
		while(true) {
			if(cp.spellCheckPass(pass)) {
				if(confirmPassUI(pass,"변경할")) return pass; 
			}
			else {
				System.out.println("---------------------------------");
				System.out.println("--Password 에는 한글을 사용할 수 없습니다--");
				System.out.println("------Password를 다시 입력해주세요------");
				System.out.println("---------------------------------");
				pass = Getter.getStr("변경할 Password 입력 : ");
			}
		}
	}
	
	private boolean confirmPassUI(String orgPass, String msg) {
		String confirmPass = Getter.getStr(msg+" Password 확인 : ");
		while(true) {
			if(cp.checkConfirmPass(orgPass, confirmPass)) return true;
			else {
				System.out.println("---------------------------------");
				System.out.println("--입력하신 Password 와 일치하지 않습니다--");
				System.out.println("---------------------------------");
				confirmPass = Getter.getStr(msg+" Password 확인 : ");
			}
		}
	}
	
}
