package join;
/**
 * 
 * @author 진솔
 * 		회원가입 정보를 DB에 저장하는 클래스
 * 
 */
import domain.BitMessenger;
import util.Getter;

public class JoinSave {

	public static void saveMember(BitMessenger info) {
		Getter.getMapper().insertMember(info);
	}
	
}
