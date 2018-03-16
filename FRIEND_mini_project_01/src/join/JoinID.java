package join;

import checkObject.CheckID;
import util.Getter;

/**
 * 
 * @author 진솔
 *		
 *		회원가입시 무결성 ID체크 UI 클래스
 *
 */


public class JoinID {
	private CheckID cid = new CheckID();
	public String checkID(String id) {
		while(true) {
			if(cid.spellCheckID(id)) {
				String err = cid.overlapCheckID(id);
				if(err != null) {
					System.out.println("---------------------------------");
					System.out.println("----------이미 있는 ID입니다----------");
					System.out.println("--------id를 다시 입력해주세요----------");
					System.out.println("---------------------------------");
					id = Getter.getStr("ID            : ");
					} // end if
					else {
						System.out.println("---------------------------------");
						System.out.println("----------사용 가능한 ID입니다---------");
						System.out.println("---------------------------------");
						return id;
					} // end else
			} // end if
			else {
				System.out.println("---------------------------------");
				System.out.println("-ID에는 한글이나 특수문자를 사용할 수 없습니다-");
				System.out.println("--------id를 다시 입력해주세요----------");
				System.out.println("---------------------------------");
				id = Getter.getStr("ID            : ");
			} // end else
		} // end while
	} // end checkID
}
