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

            UserPO mUser= new UserPO();
            //0.id
            mUser.setPhId(1);
            //1、姓名
            mUser.setPhName("asdasd");
            //2、性别
            mUser.setPhSex(1);
            //3、电话号码
            mUser.setPhTelphone("5445545");
            //4、工作地点
            mUser.setPhArea(1);
            //45入职时间
            mUser.setPhTimetag(1);
            //6、接受异性混住
            mUser.setPhDiffsex(2);
            //7、接受合租者有对象
            mUser.setPhSingle(2);
            mUser.setPhSameroom(1);
            //8、接受地铁15分钟内
            mUser.setPhSubway(1);
            //9、接受步行/骑行15分钟内
            mUser.setPhRide(1);
            //10、预期房租
            mUser.setPhPrice(3);
            //11、距离市区距离
            mUser.setPhCenter(1);
            //12、岗位
            mUser.setPhStation(1);
            //13、喜欢宠物
            mUser.setPhAnimal(2);
            //14、喜欢音乐
            mUser.setPhMusic(4);
            //15、游戏爱好者
            mUser.setPhGame(4);
            //16、桌游爱好者（狼人杀，三国杀等）
            mUser.setPhTablegame(4);
            //17、是否喜爱旅游/摄影？
            mUser.setPhTourism(3);
            //18、是否喜欢健身
            mUser.setPhHealth(3);
            mUser.setPhFood(3);
            //19、喜欢安静
            mUser.setPhQuiet(2);
            //20、个人技能（使用,隔开）
            mUser.setPhSkill("dasdasd");
            //21、个人QQ/微信
            mUser.setPhQQWechar("dasdasd");
            //22、是否公开自己的合租信息给18的其他京东小伙伴
            mUser.setPhOpen(1);
            List<UserPO> userPOList = searchFriendsService.selectAllUser();
            ansList= MatchUtils.getFriend(mUser,userPOList);
            for (MatchResult mr:ansList) {
                System.out.println(mr.toString());
            }
//			UserPO mUser = searchFriendsService.SearchFriendsData(telphone);
//			List<UserPO> userPOList = searchFriendsService.selectAllUser();
//			ansList=MatchUtils.getFriend(mUser,userPOList);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("匹配出错, 错误信息为: {}", e.toString());
		}
		return ansList;
	}
	
}
