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

    /**
     * 根据手机号匹配朋友
     * @param telphone
     * @return
     */
	@Override
	public List<MatchResult> SearchFriendsData(String telphone){
        return userPOMapper.selectByTelphone(telphone);
	}
}
