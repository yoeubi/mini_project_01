package privateInfo.UI;

import java.text.SimpleDateFormat;

import domain.BitMessenger;
import util.Getter;

public class UpdateSelectInfo implements UpdateInfoBaseUI {
	public void service() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		BitMessenger info = Getter.getMapper().selectSearchAll(Getter.getLoginInfo());
		System.out.println("---------------------------------");
		System.out.println("ID                : " + info.getId());
		System.out.println("Name              : " + info.getName());
		System.out.println("Phon number       : " + info.getPhonNo());
		System.out.printf("Statue message    : %s\n", (info.getStatueMsg() != null)? info.getStatueMsg() : "설정된 메세지가 없습니다.");
		System.out.println("Registration date : " + sdf.format(info.getJoinDate()));
		System.out.println("---------------------------------");
		
	}
}
