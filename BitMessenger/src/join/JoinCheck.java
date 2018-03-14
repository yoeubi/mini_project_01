package join;

import util.Getter;

public class JoinCheck {
	public String overlapCheckID(String id) {
		return Getter.getMapper().selectMemberByNoGetID(id);
	}
	
	public boolean spellCheckID(String id) {
		for(int i = 0 ; i < id.length() ; i++) {
			if(id.charAt(i) >= 'A' && id.charAt(i) <='Z') {
				continue;
			}
			else if(id.charAt(i) >= 'a' && id.charAt(i) <='z'){
				continue;
			}
			else if(id.charAt(i) >= '0' && id.charAt(i) <='9'){
				continue;
			}
			else return false;
		}
		return true;
	}
	
	public boolean spellCheckPass(String pass) {
		for(int i = 0 ; i < pass.length() ; i++) {
			if(pass.charAt(i) >= 33 && pass.charAt(i) <=126) {
				continue;
			}
			else return false;
		}
		return true;
	}
	
	
	
	
}
