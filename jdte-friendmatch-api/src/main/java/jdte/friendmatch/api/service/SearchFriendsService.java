package jdte.friendmatch.api.service;

import jdte.friendmatch.api.domain.MatchResult;

import java.util.List;



/**
 * 
* @ClassName: SearchFriendService
* @Description:根据姓名查询匹配数据Service
* @author weizhirong
* @date 2017年12月4日 下午11:00:59
* @version V1.0 
 */

public interface SearchFriendsService {

	/**
	 * 
	* @Title: SearchFriendsData
	* @Description: 根据姓名查询匹配数据
	* @param  username  输入姓名
	* @return List    返回查询数据
	* @throws
	 */
	List<MatchResult> SearchFriendsData(String username) throws Exception;
}
