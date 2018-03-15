package privateInfo.UI;

import checkObject.CheckPass;
import privateInfo.Update.UpdatePassword;
import util.Getter;

public class UpdatePasswordUI implements UpdateInfoBaseUI {
	private CheckPass cp = new CheckPass();

	public void service() {
		subUI.checkPassword(Getter.getMapper().selectPassword(info.getNo()),"기존",cp);
		while(true) {
			switch(subUI.ui("Password")) {
			case "1" : subUI.msg("Password",Getter.getMapper().selectPassword(info.getNo()));
				       info.setPass(checkPassUI());
					   System.out.println("변경이 완료되었습니다.");
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
				if(subUI.checkPassword(pass,"변경할",cp)) return pass; 
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
}
