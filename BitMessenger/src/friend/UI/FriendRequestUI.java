package friend.UI;

import friend.update.FriendRequest;
import util.Getter;

public class FriendRequestUI {
	public void requestUI(String inId, String outId) {
		System.out.println("---------------------------------");
		System.out.println("--------------친구신청--------------");
		System.out.println("---------------------------------");
		while(true) {
			System.out.println("1. 친구신청");
			System.out.println("0. 돌아가기");
			System.out.println("---------------------------------");
			switch(Getter.getStr("메뉴를 선택해주세요 : ")) {
			case "1" : new FriendRequest(inId,outId); break;		
			case "0" : return;
			default : System.out.println("잘못 입력하셨습니다."); continue;
			}
			
		}
	}
}
