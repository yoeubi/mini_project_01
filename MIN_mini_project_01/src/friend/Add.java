package friend;
import java.util.Scanner;

/**
 * @author mook2
 * 친구 추가
 */
public class Add {
	FSearch search = new FSearch();
	Recommend recommend = new Recommend();
	Scanner sc = new Scanner (System.in);
	
	public void frAdd() {
		System.out.println("1. ID 검색 : ");
		System.out.println("2. 핸드폰번호 검색: ");
		System.out.println("3. 친구 추천 ");
		System.out.println("0. 이전 메뉴로 돌아가기");
		int menu = Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		case 1: search.frSearchId(); break;
		case 2: search.frSearchPN(); break;
		case 3: break;
		case 0: break;
		}
	}
}

