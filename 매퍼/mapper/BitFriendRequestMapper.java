package mapper;

import java.util.List;

import domain.BitFriendRequest;
public interface BitFriendRequestMapper {
	void insertOutRequestFriend(BitFriendRequest info);
	List<BitFriendRequest> selectRequestFriend(BitFriendRequest info); // 친구요청 중복 테스트
}
