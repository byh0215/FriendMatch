package jdte.friendmatch.api.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jdte.friendmatch.api.pojo.UserPO;
import jdte.friendmatch.api.service.impl.SearchFriendsServiceImpl;
/**
 * 
* @ClassName: SearchFriendsController
* @Description: 根据姓名查询数据Controller
* @author weizhirong
* @date 2017年12月6日 上午10:05:59
* @version V1.0 
 */
@Controller
@RequestMapping("/search")
public class SearchFriendsController {
	/**
	 * 
	* @ClassName: SearchFriendService
	* @Description:根据手机号查询数据
	* @author weizhirong
	* @date 2017年12月6日 上午10:05:59
	* @version V1.0 
	 * @throws IOException 
	 */
	//返回参数统一为jsonresponse，需要自己实现
	@RequestMapping(value="/searchfriends", method = RequestMethod.GET)
	public  @ResponseBody UserPO searchFriendService(@RequestParam(value="telphone") String telphone) throws IOException {
		SearchFriendsServiceImpl sfs=new SearchFriendsServiceImpl();
		UserPO userpo=null;
		try {
			userpo= sfs.SearchFriendsData(telphone);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userpo;
	}
	
}
