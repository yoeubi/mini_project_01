package join;
/**
 * 
 * @author 진솔
 * 		회원가입 UI 클래스
 * 
 */
import domain.BitMessenger;
import util.Getter;

public class JoinUI {
	private BitMessenger info = new BitMessenger();
	private JoinPass pass = new JoinPass();
	private JoinID id = new JoinID();
	private JoinPhon phon = new JoinPhon();
	
	public void joinUI() {
		System.out.println("---------------회원가입-------------");
		info.setId(id.checkID(Getter.getStr("ID            : ")));
		info.setPass(pass.checkPass(Getter.getStr("Password      : ")));
		pass.confirmPass(info.getPass(),Getter.getStr("Password 확인   : "));
		info.setName(Getter.getStr("Name          : "));
		info.setPhonNo(phon.checkPhonNo(Getter.getStr("Phon number   : ")));
		System.out.println("---------------------------------");
		info.setPassHint(Getter.getStr("비밀번호 찾기 힌트   : "));
		info.setPassKey(Getter.getStr("비밀번호 찾기 답안   : "));
		JoinSave.saveMember(info);
		System.out.println("------------회원가입 완료------------");
		System.out.println("----BitMessenger에 오신걸 환영합니다----");
		System.out.println("---------------------------------");
	}

}
