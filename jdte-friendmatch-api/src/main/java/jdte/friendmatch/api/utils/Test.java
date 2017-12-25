package jdte.friendmatch.api.utils;

import jdte.friendmatch.api.domain.MatchResult;
import jdte.friendmatch.api.pojo.UserPO;
import jdte.friendmatch.api.service.SearchFriendsService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    @Autowired
    private static SearchFriendsService searchFriendsService;
    public static void main(String[] args) throws IOException {

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
        List<MatchResult> ansList= MatchUtils.getFriend(mUser,userPOList);
        System.out.println(userPOList.size());
        System.out.println(ansList.size());
        for (MatchResult mr:ansList) {
            System.out.println(mr.toString());
        }
    }
}
