package util;
/**
 * 
 * @author 진솔
 * 		mapper 객체를 호출,
 * 		Scanner 를 이용하여 문자열과 정수를 받기 위한
 * 		Getter 클래스
 * 
 */
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import domain.BitFriendRequest;
import domain.BitMessenger;
import mapper.BitFriendRequestMapper;
import mapper.BitMessengerMapper;

public class Getter {
	private static BitMessengerMapper mapper;
	private static BitFriendRequestMapper frMapper;
	private static Scanner sc = new Scanner(System.in);
	private static BitMessenger info = new BitMessenger();
	private static BitFriendRequest fr = new BitFriendRequest();
	
	static {
		SqlSession session = MyAppSqlConfig.getSqlSession();
		mapper = session.getMapper(BitMessengerMapper.class);
		frMapper = session.getMapper(BitFriendRequestMapper.class);
	}
	
	public static BitMessengerMapper getMapper() {
		return mapper;
	}
	
	public static BitFriendRequestMapper getFrMapper() {
		return frMapper;
	}
	
	
	public static String getStr(String str) {
		System.out.print(str);
		String item = sc.nextLine();
		while(true) {
			if(item.equals("")) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.print(str);
				item = sc.nextLine();
			}
			else break;
		}
		return item;
	}
	
	public static int getInt(String str) {
		System.out.print(str);
		String item = sc.nextLine();
		while(true) {
			if(item.equals("")) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.print(str);
				item = sc.nextLine();
			}
			else break;
		}
		return Integer.parseInt(item);
	}
	
	public static BitMessenger getLoginInfo() {
		info.setNo(82);
		info.setId("1235");
		return info;
	}
	
	public static BitFriendRequest getFriendRequest() {
		return fr;
	}
	
	
	
}
