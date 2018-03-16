package chatting;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import common.db.MyAppSqlConfig;
import kr.co.mini.message.domain.ChattingRoom;
import kr.co.mini.message.mapper.ChattingRoomMapper;

public class Chatting_UI extends Common_fuc {
public ChattingRoomMapper mapper;
	
	public Chatting_UI() {
		SqlSession session = MyAppSqlConfig.getSqlSession();
		mapper = session.getMapper(ChattingRoomMapper.class);
	}	
	public void ui() {
		System.out.println("\t\t\t대화목록");
		List<ChattingRoom> rooms = mapper.loadChattingList();
		for(int i = 0; i < rooms.size() ; i++) {
			ChattingRoom room = rooms.get(i);
			System.out.println((i + 1) +". "+ room.getName());
		}
		System.out.println("번호누르면 대화방 입장");
		System.out.println("0번 누르면 뒤로가기 ");
		int menu = getInt("명령어를 입력하세요 : ");
		if(rooms.size() == 0) {
			create(menu);
			enter(menu);
		}else {
			switch(menu) {
			case 0: break;
			case 1: 
				default: enter(menu); 
			}
		}
		
	}
	// 뒤로가기
	public void back() {
		
	}
	public void enter(int no) {
		Chatting_list list = new Chatting_list();
		int i = 0;
		while(i <10) {
			list.insertMessage(no);
			list.selectMessage(no);
			i++;
		}
	}
	public void create(int no) {
		ChattingRoom room = new ChattingRoom();
		room.setNo(no);
		room.setName(getStr("방 이름을 설정하세요 : "));
		mapper.insertChatting(room);
	}
}
