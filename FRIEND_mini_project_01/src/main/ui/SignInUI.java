//package main.ui;
//
//import java.util.Scanner;
//
//import chatting.CList;
//import domain.BitMessenger;
//import friend.Add;
//import friend.FList;
//import friend.Request;
//import privateInfo.UI.UpdateInfoUI;
//import util.Getter;
//
//public class SignInUI {
//	Scanner sc = new Scanner(System.in);
//
//
//
//	public void signService() {
//		
//		while (true) {
//			switch (menu()) {
////			case "1": FList flist = new FList(); 
////					flist.frList(); break;
////			case "2": CList clist = new CList();
////					clist.clist(); break;
////			case "3": Add add = new Add();    //알람떠야됨
////					add.fadd();
////			case "4": UpdateInfoUI update =  new UpdateInfoUI();
////					update.updateInfoMainUI();
////			case "5": Request request = new Request();  
////					request.frequest(); break;
//			case "9": mainUI();
//			case "0": quit();
//			}
//			
//		}
//	}	
//	
//	
//	private void mainUI() {
//		
//		Main main = new Main();
//		main.service();
//		Getter.info = null;
//		
//	}
//	
//	private void quit() {
//		System.out.println("메신저 종료합니다.");
//		System.exit(0);
//		Getter.info = null;
//	}
//
//	private String menu() {
//	
//		BitMessenger board = new BitMessenger();
//		
//		System.out.println(board.getName()+ "님 안녕하세요 :')  ");
//		System.out.println("1. 친구목록");
//		System.out.println("2. 대화목록");  //안읽은 대화 알람(1 숫자로 표시)
//		System.out.println("3. 친구추가 ");
//		System.out.println("4. 정보수정");
//		System.out.println("5. 친구요청");  //친구요청 알람(친구id)
//		System.out.println("9. 기초화면 ");
//		System.out.println("0. 로그아웃");
//		System.out.println();
//		System.out.print("원하시는 항목을 선택하세요  : ");
//		return sc.nextLine();
//		
//}			
//
//	
//	
//}
