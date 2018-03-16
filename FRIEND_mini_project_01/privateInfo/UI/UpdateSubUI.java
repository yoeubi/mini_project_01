package privateInfo.UI;

import util.Getter;

public class UpdateSubUI {
	String ui(String item) {
		System.out.println("---------------------------------");
		System.out.printf("1. %s 변경\n",item);
		System.out.println("0. 돌아가기");
		System.out.println("---------------------------------");
		return Getter.getStr("메뉴를 선택하세요 : ");
	}
	String ui(String item1, String item2) {
		System.out.println("---------------------------------");
		System.out.printf("1. %s 변경\n",item1);
		System.out.printf("2. %s 변경\n",item2);
		System.out.println("0. 돌아가기");
		System.out.println("---------------------------------");
		return Getter.getStr("메뉴를 선택하세요 : ");
	}
	
	String updateInfo(String info) {
		System.out.println("---------------------------------");
		String data = Getter.getStr(info+" 입력 : ");
		System.out.println("변경이 완료되었습니다.");
		System.out.println("---------------------------------");
		return data;
	}
	
	void msg(String msg, String data) {
		System.out.println("---------------------------------");
		System.out.printf("현재 %s : %s\n", msg ,
				(data != null)? data : "설정된 "+msg+" 가 없습니다.");
	}
	
}
