package jdte.friendmatch.api.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import jdte.friendmatch.api.pojo.UserPO;

/**
 * 
* @ClassName: SearchFriendsDao
* @Description: 查询匹配数据的Dao
* @author weizhirong
* @date 2017年12月6日 下午3:49:19
* @version V1.0 
 */
@Repository("searchFriendsDao")
public interface SearchFriendsDao {

	 UserPO selectByTelphone(String telphone);
}
