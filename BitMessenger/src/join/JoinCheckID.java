package join;

import util.Getter;

public class JoinCheckID {
	public String overlapCheckID(String id) {
		return Getter.getMapper().selectMemberByNoGetID(id);
	}
}
