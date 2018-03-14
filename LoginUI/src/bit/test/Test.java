package bit.test;

import main.ui.Main;

public class Test {


	public static void main(String[] args) {
		try {
			Main ui = new Main();
			ui.service();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	
	
}
