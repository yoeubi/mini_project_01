package privateInfo.UI;

import privateInfo.Update.UpdateBlock;
import util.Getter;

public class UpdateBlockUI implements UpdateInfoBaseUI  {
	public void service() {
		while(true) {
		int block = Getter.getMapper().selectBlockSearch(Getter.getLoginInfo().getNo());
		System.out.println("---------------------------------");
		System.out.print("지금 상태는 ");
		System.out.print((block == 1) ? "     [ 전체공개 ] " : "     [ 검색차단 ] ");
		System.out.print("     입니다.\n");
		System.out.println("---------------------------------");
		if(block == 1) { System.out.println("9. 검색 차단하기"); }
		else { System.out.println("9. 검색 차단해제"); }
		System.out.println("0. 돌아가기");
		System.out.println("---------------------------------");
			switch(Getter.getStr("메뉴를 선택해주세요 : ")) {
			case "9" : updateBlockMsg(block);
					   if(Getter.getInt("Yes : 9      No : 아무키나 입력\n메뉴를 선택해주세요 : ") == 9) {
						   new UpdateBlock(info,block);
					   }else return;
				       break;		
			case "0" : return;
			default : System.out.println("잘못 입력하셨습니다."); continue;
			}
		}
	}
	
	public void updateBlockMsg(int block) {
		if(block == 1) {
			System.out.println("---------------------------------");
			System.out.println("검색 차단하기 기능을 사용하시면");
			System.out.println("새로운 친구가 회원님을 더이상 검색할 수 없습니다.");
			System.out.println("하지만 언제든지 차단을 해제할 수 있습니다.");
			System.out.println("정말 검색을 차단하시겠습니까?");
			System.out.println("---------------------------------");
		}
		else {
			System.out.println("---------------------------------");
			System.out.println("새로운 친구들이 회원님을 찾고있을지 모릅니다!");
			System.out.println("지금 바로 검색 차단을 해제하시겠습니까?");
			System.out.println("---------------------------------");
		}
		
	}
	
}
