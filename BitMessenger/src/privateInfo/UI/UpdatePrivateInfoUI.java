package privateInfo.UI;


public class UpdatePrivateInfoUI implements UpdateInfoBaseUI {
	
	public void service() {
		UpdateInfoBaseUI ui = null;
		while(true) {
			switch(subUI.ui("Password","Phon number")) {
			case "1" : ui = new UpdatePasswordUI(); break;
			case "2" : ui = new UpdatePhonNoUI(); break;		
			case "0" : return;
			default : System.out.println("잘못 입력하셨습니다."); continue;
			}
			ui.service();
		}
	}
}
