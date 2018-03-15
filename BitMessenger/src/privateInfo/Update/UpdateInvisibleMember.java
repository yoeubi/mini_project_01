package privateInfo.Update;

import domain.BitMessenger;
import util.Getter;

public class UpdateInvisibleMember {
	public UpdateInvisibleMember(BitMessenger info) {
		Getter.getMapper().updateinvisibleMember(info.getNo());
	}
}
