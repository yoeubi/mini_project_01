package chatting;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Common_fuc {
	
	public Scanner sc = new Scanner(System.in);
	public SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	
	public String getStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	public int getInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}
	public String saveStr(String msg) {
		System.out.print(msg);   
		return msg;
	}
}
