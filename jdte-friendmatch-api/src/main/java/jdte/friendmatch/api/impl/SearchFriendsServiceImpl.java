package jdte.friendmatch.api.impl;

import jdte.friendmatch.api.domain.MatchResult;
import jdte.friendmatch.api.mapper.UserPOMapper;
import jdte.friendmatch.api.pojo.UserPO;
import jdte.friendmatch.api.service.SearchFriendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service("searchFriendService")
public class SearchFriendsServiceImpl implements SearchFriendsService{
	@Autowired
	private UserPOMapper userPOMapper;
	@Override
	public List<MatchResult> SearchFriendsData(String telphone){
		List<MatchResult> searchList = userPOMapper.selectByTelphone(telphone);
		return searchList;
	}
}
