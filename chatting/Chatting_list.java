package chatting;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import kr.co.mini.message.domain.Message;
import kr.co.mini.message.mapper.MessageMapper;

public class Chatting_list extends Common_fuc{
public MessageMapper mapper;
public Chatting_UI ui = new Chatting_UI();
	
	public Chatting_list() {
		SqlSession session = MyAppSqlConfig.getSqlSession();
		mapper = session.getMapper(MessageMapper.class);
	}
private String name = "홍길동"; 
	
	public void insertMessage(int no) {
		StringBuffer sb = new StringBuffer();
		Message msg = new Message();
		msg.setNo(no);
		msg.setMyID(name);
		msg.setYourID("아이유");
		sb.append(getStr("메세지 작성 : "));
		for(int i = 1; i < sb.length() ; i++) {
			if(i%20 == 0) {
				if(msg.getMyID().equals(name)){
					sb.insert(i, "\r\n\t\t\t\t  ");
				}else {
					sb.insert(i, "\r\n");
				}
			}
		}
		msg.setMsg(sb.toString());
		mapper.updateMessageViewCnt();
    	mapper.insertMessage(msg);
		System.out.println("--------------------------------------");
	}
	public void selectMessage(int no) {
		List<Message> msg = mapper.selectMessage(no);
		StringBuffer sb = new StringBuffer();
		SaveConversasion scv = new SaveConversasion();
		for(Message m : msg) {
			if(m.getMyID().equals(name)) {
				sb.append(saveStr("\t\t\t\t\t\t" + m.getMyID()+"\r\n"));
				sb.append(saveStr("\t\t\t" +  m.getMyViewCnt() +"  " + sdf.format(m.getRegDate()) +"  " + m.getMsg()+"\r\n"));
				sb.append(saveStr("\r\n"));
				sb.append(saveStr("\r\n"));
			}else {
				sb.append(saveStr(m.getYourID()+"\r\n"));
				sb.append(saveStr(m.getMsg() + "  " + sdf.format(m.getRegDate())+"  " + m.getYourViewCnt() +"\r\n"));
				sb.append(saveStr("\r\n"));
				sb.append(saveStr("\r\n"));
			}
		}
		scv.save(sb.toString());
	}
	
}
