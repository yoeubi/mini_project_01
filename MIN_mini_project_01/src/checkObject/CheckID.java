package checkObject;
/**
 * 
 * @author 진솔
 * 		
 * 		ID 무결성 체크 클래스
 * 
 */
import util.Getter;

public class CheckID {
	public String overlapCheckID(String id) {
		return Getter.getMapper().selectMemberByNoGetID(id);
	}
	
	public boolean spellCheckID(String id) {
		for(int i = 0 ; i < id.length() ; i++) {
			if(id.charAt(i) >= 'A' && id.charAt(i) <='Z') { continue; }
			else if(id.charAt(i) >= 'a' && id.charAt(i) <='z'){ continue; }
			else if(id.charAt(i) >= '0' && id.charAt(i) <='9'){ continue; }
			else return false;
		}
		return true;
	}
}
