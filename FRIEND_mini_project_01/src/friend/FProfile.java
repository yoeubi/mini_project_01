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
 * @author mook2 친구의 프로필
 */
public class FProfile {
	Scanner sc = new Scanner(System.in);
	BitMessengerMapper mapper = Getter.getMapper();
	FriendMapper mapper2 = Getter.getMapper2();
	
	public FProfile(BitMessengerMapper mapper) {
		this.mapper = mapper;
	}

	public FProfile(FriendMapper mapper2) {
		this.mapper2 = mapper2;
	}
	
	public FProfile() {
		SqlSession session = MyAppSqlConfig.getSqlSession();
		mapper = session.getMapper(BitMessengerMapper.class);
	}
	
	public void fProView(List<FriendVO> list) {
		BitMessenger bm = Getter.getLoginInfo();
		
		bm.setId("minhee");
		
		String getFId = null;
		
		// 친구 아이디 검색
		for (FriendVO fvo : list) {
		getFId = fvo.getfId();
		System.out.println("친구 아이디 :"+getFId);
		}
		
		// 로그인 연동 시 하단 주석

//		String f_stm = mapper.selectStatueMsg2(getFId);

//		if (bmg.getfId() != fv.getfId()) {
//			System.out.println("등록된 친구가 아닙니다.");
//			return;
//		}
		System.out.println(getFId + "님의 프로필입니다.");

//		if (f_stm == null ) {
//			System.out.println("");
//		} else {
//		System.out.println("[" +  f_stm + "]" );
//		}
		
		System.out.println("1. 대화하기");
		System.out.println("2. 친구삭제");
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.print("메뉴를 선택해주세요 : ");
		int menu = Integer.parseInt(sc.nextLine());
		switch (menu) {
		case 1:
		case 2:
		case 3:
		case 0:
		}
	}

}
