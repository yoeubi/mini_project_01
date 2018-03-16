package mapper;

import java.util.List;

import domain.BitMessenger;
import domain.FriendVO;

public interface FriendMapper {
	List<FriendVO> frList(String id); // 친구 목록
	List<FriendVO> fProView(List<FriendVO> list);  // 친구 프로필
}
