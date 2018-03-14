package main.ui;

import java.util.Scanner;

import chatting.CList;
import domain.BitMessenger;
import friend.Add;
import friend.FList;
import friend.Request;
import privateInfo.UI.UpdateInfoUI;

public class SignInUI {
	Scanner sc = new Scanner(System.in);
	private int no;
	public SignInUI(/**회원 고유번호*/int no) {
		this.no = no;
	}
	
	
	
	public void signService() {
		
		while (true) {
			switch (menu()) {
			case 1: FList flist = new FList(no); 
					flist.list(); break;
			case 2: CList clist = new CList(no);
					clist.clist(); break;
			case 3: Add add = new Add(no);    //알람떠야됨
					add.fadd();
			case 4: UpdateInfoUI update =  new UpdateInfoUI(no);
					update.updateInfoMainUI();
			case 5: Request request = new Request(no);  
					request.frequest(); break;
			case 9: mainUI();
			case 0: quit();
			}
			
		}
	}	
	
	
	private void mainUI() {
		
		Main main = new Main();
		main.service();
		
	}
	
	private void quit() {
		System.out.println("메신저 종료합니다.");
		System.exit(0);
	}

	private int menu() {
	
		BitMessenger board = new BitMessenger();
		
		System.out.println(board.getName()+ "님 안녕하세요 :')  ");
		System.out.println("1. 친구목록");
		System.out.println("2. 대화목록");  //안읽은 대화 알람(1 숫자로 표시)
		System.out.println("3. 친구추가 ");
		System.out.println("4. 정보수정");
		System.out.println("5. 친구요청");  //친구요청 알람(친구id)
		System.out.println("9. 기초화면 ");
		System.out.println("0. 로그아웃");
		System.out.println();
		System.out.print("원하시는 항목을 선택하세요  : ");
		return Integer.parseInt(sc.nextLine());
}			

	
	
}
