package friend;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import domain.BitMessenger;
import domain.FriendVO;
import mapper.BitMessengerMapper;
import mapper.FriendMapper;
import util.Getter;

/**
 * @author mook2 친구목록
 */
public class FList {
	Scanner sc = new Scanner(System.in);

	BitMessengerMapper mapper = Getter.getMapper();
	FriendMapper mapper2 = Getter.getMapper2();
	
	public FList(BitMessengerMapper mapper) {
		this.mapper = mapper;
	}
	public FList(FriendMapper mapper2) {
		this.mapper2 = mapper2;
	}

	public FList() {
		SqlSession session = MyAppSqlConfig.getSqlSession();
		mapper = session.getMapper(BitMessengerMapper.class);
	}

	public void frList() {
		BitMessenger bm = Getter.getLoginInfo();
		// 로그인 연동 시 하단 주석
		bm.setId("1111");
		String getUserId = bm.getId();
		
		List<FriendVO> list = mapper2.frList(getUserId);
		if (list.size() == 0) {
			System.out.println("등록된 친구가 없습니다.");
			System.out.println("0. 이전 메뉴로 돌아가기");
			int menu = Integer.parseInt(sc.nextLine());
			if (menu == 0) {
				//이전 페이지
			}
			
		} else {
			int index = 0;
			
			for (FriendVO b : list) {
				index++;
				System.out.printf("%d.%s\t\n",index, b.getfId());
			}

			while (true) {
				System.out.println("0. 이전 메뉴로 돌아가기");
				System.out.println("닉네임을 기재하시면 프로필로 이동됩니다.");
				System.out.print("입력해주세요 : ");
				String getFId = sc.nextLine();
				FriendVO fv = new FriendVO();
				fv.setfId(getFId);
					
				FProfile fpf = new FProfile();
				fpf.fProView(fv);
			
				
			}
		}

	}

}
