package join;

import domain.BitMessenger;
import util.Getter;

public class JoinUI {
	BitMessenger info = new BitMessenger();
	private JoinCheck jc = new JoinCheck();
	public void joinUI() {
		System.out.println("---------------회원가입-------------");
		info.setId(checkID(Getter.getStr("ID            : ")));
		info.setPass(checkPass(Getter.getStr("Password      : ")));
		confirmPass(Getter.getStr("Password 확인   : "));
		info.setName(Getter.getStr("Name          : "));
		info.setPhonNo(Getter.getStr("Phon number   : "));
		System.out.println("---------------------------------");
		info.setPassHint(Getter.getStr("비밀번호 찾기 힌트   : "));
		info.setPassKey(Getter.getStr("비밀번호 찾기 답안   : "));
		JoinSave.saveMember(info);
		System.out.println("------------회원가입 완료------------");
		System.out.println("----BitMessenger에 오신걸 환영합니다----");
		System.out.println("---------------------------------");
	}
	
	public String checkID(String id) {
		

		while(true) {
			if(jc.spellCheckID(id)) {
				String err = jc.overlapCheckID(id);
				if(err != null) {
					System.out.println("---------------------------------");
					System.out.println("----------이미 있는 ID입니다----------");
					System.out.println("--------id를 다시 입력해주세요----------");
					System.out.println("---------------------------------");
					id = Getter.getStr("ID            : ");
					}
					else {
						System.out.println("---------------------------------");
						System.out.println("----------사용 가능한 ID입니다---------");
						System.out.println("---------------------------------");
						return id;
					}
			}
			else {
				System.out.println("---------------------------------");
				System.out.println("-ID에는 한글이나 특수문자를 사용할 수 없습니다-");
				System.out.println("--------id를 다시 입력해주세요----------");
				System.out.println("---------------------------------");
				id = Getter.getStr("ID            : ");
			}
		
		}
	}
	
	public String checkPass(String pass) {
		while(true) {
			if(jc.spellCheckPass(pass)) {
			return pass;
			}
			else {
				System.out.println("---------------------------------");
				System.out.println("--Password 에는 한글을 사용할 수 없습니다--");
				System.out.println("------Password를 다시 입력해주세요------");
				System.out.println("---------------------------------");
				pass = Getter.getStr("Password      : ");
			}
		}
	}
	
	public void confirmPass(String confirmPass) {
		while(true) {
			if(confirmPass.equals(info.getPass())) {
				System.out.println("---------------------------------");
				System.out.println("------사용 가능한 Password 입니다------");
				System.out.println("---------------------------------");
				return;
			}
			else {
				System.out.println("---------------------------------");
				System.out.println("--입력하신 Password 와 일치하지 않습니다--");
				System.out.println("---------------------------------");
				confirmPass = Getter.getStr("Password 확인   : ");
			}
		}
		
	}
	
	
}
