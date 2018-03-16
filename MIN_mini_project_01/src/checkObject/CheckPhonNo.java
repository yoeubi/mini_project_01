package checkObject;
/**
 * 
 * @author 진솔
 *		
 *		PhonNo 무결성 체크 클래스
 *		리턴값  0 : 무결성
 *           1 : 숫자가 아닌 값이 들어가있음 "-" 허용 안함
 *			 2 : 핸드폰 자리수가 10 또는 11자리가 아닐경우
 */
public class CheckPhonNo {
	
	
	public int CheckPhonNo(String phon) {
		return checkOnlyNumber(phon);
	}
	
	public int checkOnlyNumber(String phon) {
		for(int i = 0 ; i < phon.length() ; i++) {
			if(phon.charAt(i) >= 48 && phon.charAt(i) <=57) { continue; }
			else return 1;
		}
		return checkLength(phon);
	}
	
	
	private int checkLength(String phon) {
			if(phon.length() == 11 || phon.length() == 10) { return 0; }
			else { return 2; }
	}
	
	
}
