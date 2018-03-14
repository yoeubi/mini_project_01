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
import mapper.BitMessengerMapper;

public class Getter {
	private static BitMessengerMapper mapper;
	private static Scanner sc = new Scanner(System.in);
	
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
	
	
	
	
}
