package privateInfo.Update;

import domain.BitMessenger;
import util.Getter;

public class UpdateBlock {
	public UpdateBlock(BitMessenger info, int block) {
		if(block == 1) { info.setBlockSearch(0); }
		else info.setBlockSearch(1);
		Getter.getMapper().updateBlockSearch(info);
	}
}
