package join;
/**
 * 
 * @author 진솔
 *		
 *		회원가입시 무결성 PhonNo체크 UI 클래스
 *
 */

import checkObject.CheckPhonNo;
import util.Getter;

public class JoinPhon {
	private CheckPhonNo cpn = new CheckPhonNo();
	public String checkPhonNo(String phon) {
		while(true) {
			switch(cpn.CheckPhonNo(phon)) {
			case 0 : return phon;
			case 1 : System.out.println("---------------------------------");
					 System.out.println("핸드폰 번호는 \"-\" 를 제외한 숫자만 입력해주세요");
					 System.out.println("---------------------------------");
					 break;
			case 2 : System.out.println("---------------------------------");
					 System.out.println("- 핸드폰 번호는 10또는 11자리로 입력해주세요 -");
					 System.out.println("---------------------------------");
					 break;
			}
		phon = Getter.getStr("Phon number   : ");
		}// end while
	}// end method
}
