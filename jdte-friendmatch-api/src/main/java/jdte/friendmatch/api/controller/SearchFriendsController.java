package jdte.friendmatch.api.controller;

import jdte.friendmatch.api.domain.MatchResult;
import jdte.friendmatch.api.pojo.UserPO;
import jdte.friendmatch.api.service.ExcelDataService;
import jdte.friendmatch.api.service.SearchFriendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
	@Autowired
	private SearchFriendsService searchFriendsService;
	@Autowired
	private ExcelDataService excelDataService;

	@RequestMapping(value="/searchfriends", method = RequestMethod.GET)
	public  @ResponseBody List<MatchResult> searchFriendService(@RequestParam(value="telphone") String telphone) throws IOException {
		List<MatchResult> ansList= new ArrayList<MatchResult>();
		try {
			Integer idIndex = excelDataService.getMaxId();
			excelDataService.setUserData("C://aaa.xls",7,idIndex);
			ansList= searchFriendsService.SearchFriendsData(telphone);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ansList;
	}
	
}
