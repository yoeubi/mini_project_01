package chatting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveConversasion {
	
	public void save(String conversation) {
		try (FileWriter fw = new FileWriter(new File("src/chatting/test.txt"));
				PrintWriter pw = new PrintWriter(fw);){
			pw.print(conversation);
			System.out.println("파일저장");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
