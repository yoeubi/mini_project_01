package join;

import domain.BitMessenger;
import util.Getter;

public class JoinUI {
	BitMessenger info = new BitMessenger();
	
	
	public void joinUI() {
		System.out.println("-------------회원가입-------------");
		info.setId(checkID(Getter.getStr("ID                 : ")));
		info.setPass(Getter.getStr("Password      : "));
		info.setName(Getter.getStr("Name          : "));
		info.setPhonNo(Getter.getStr("Phon number   : "));
		System.out.println("-------------------------------");
		info.setPassHint(Getter.getStr("비밀번호 찾기 힌트   : "));
		info.setPassKey(Getter.getStr("비밀번호 찾기 답안   : "));
		JoinSave.saveMember(info);
		System.out.println("-----------회원가입 완료-----------");
		System.out.println("---BitMessenger에 오신걸 환영합니다---");
		System.out.println("-------------------------------");
	}
	
	public String checkID(String id) {
		JoinCheckID jci = new JoinCheckID();
		try {
		while(true) {
			String err = jci.overlapCheckID(id);
			System.out.println(err);
			if(err != null) {
			System.out.println("-------------------------------");
			System.out.println("---------이미 있는 ID입니다---------");
			System.out.println("-------id를 다시 입력해주세요---------");
			System.out.println("-------------------------------");
			id = Getter.getStr("ID            : ");
			}
			else {
				System.out.println("-------------------------------");
				System.out.println("---------사용 가능한 ID입니다--------");
				System.out.println("-------------------------------");
				return id;
			}
		}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "WQfdwq";
	}

	
	
}
