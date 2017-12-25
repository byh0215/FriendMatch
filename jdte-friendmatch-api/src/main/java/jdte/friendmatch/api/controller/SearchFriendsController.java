package jdte.friendmatch.api.controller;

import jdte.friendmatch.api.domain.MatchResult;
import jdte.friendmatch.api.pojo.UserPO;
import jdte.friendmatch.api.service.ExcelDataService;
import jdte.friendmatch.api.service.SearchFriendsService;
import jdte.friendmatch.api.utils.MatchUtils;
import org.apache.poi.util.SystemOutLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

	private static final Logger logger = LoggerFactory.getLogger(SearchFriendsController.class);

	/**
	 * 搜索匹配
	 * @param telphone
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value="/searchfriends", method = RequestMethod.GET)
    @ResponseBody
	public List<MatchResult> searchFriend(@RequestParam(value="telphone") String telphone)
			throws IOException {
		List<MatchResult> ansList = new ArrayList<MatchResult>();
		try {
			Integer idIndex = excelDataService.getMaxId();
			System.out.println("idIndex"+idIndex);
			if(idIndex==null){
				idIndex=1;
			}
			//上线前修改此处
			Boolean aaa=excelDataService.setUserData("/aaaa.xls",6,idIndex);
			System.out.println("3"+aaa.toString());
			UserPO mUser = searchFriendsService.SearchFriendsData(telphone);
			List<UserPO> userPOList = searchFriendsService.selectAllUser();
			ansList=MatchUtils.getFriend(mUser,userPOList);
			Collections.sort(ansList, new Comparator(){
				@Override
				public int compare(Object o1, Object o2) {
					MatchResult stu1=(MatchResult)o1;
					MatchResult stu2=(MatchResult)o2;
					if(stu1.getValue()<stu2.getValue()){
						return 1;
					}else if(stu1.getValue()==stu2.getValue()){
						return 0;
					}else{
						return -1;
					}
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("匹配出错, 错误信息为: {}", e.toString());
		}
		return ansList;
	}

}
