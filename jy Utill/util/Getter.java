package util;

import java.util.Scanner;


import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import domain.BitMessenger;
import mapper.BitMessengerMapper;

public class Getter {
	private static BitMessengerMapper mapper;
	private static Scanner sc = new Scanner(System.in);
	public static BitMessenger info;
	
	
	static {
		SqlSession session = MyAppSqlConfig.getSqlSession();
		mapper = session.getMapper(BitMessengerMapper.class);
	}
	
	public static BitMessengerMapper getMapper() {
		return mapper;
	}
	
	
	public static String getStr(String str) {
		System.out.print(str);
		return sc.nextLine();
	}
	
	public static int getInt(String str) {
		System.out.print(str);
		return Integer.parseInt(sc.nextLine());
	}
	
	// 로그인된  user information -jy

	public static BitMessenger getLoginInfo( ) {
		return info;
		
	}
	
	
}
