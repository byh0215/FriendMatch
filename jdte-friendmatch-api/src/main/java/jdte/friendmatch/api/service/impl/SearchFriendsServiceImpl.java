package jdte.friendmatch.api.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jdte.friendmatch.api.dao.SearchFriendsDao;
import jdte.friendmatch.api.pojo.UserPO;
import jdte.friendmatch.api.service.SearchFriendsService;
@Service("searchFriendService")
public class SearchFriendsServiceImpl implements SearchFriendsService{
	@Autowired
	private SearchFriendsDao searchFriendsDao;
	@Override
	public UserPO SearchFriendsData(String telphone) throws IOException {
		UserPO searchList = searchFriendsDao.selectByTelphone(telphone);
		return searchList;
	}
}
