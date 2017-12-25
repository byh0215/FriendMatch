package jdte.friendmatch.api.mapper;

import jdte.friendmatch.api.domain.MatchResult;
import jdte.friendmatch.api.pojo.UserPO;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 *
 * @ClassName: UserPOMapper
 * @Description: 合并为usermappper
 * @author baiyuehui
 * @date 2017年12月6日 下午3:49:19
 * @version V1.0 
 */
//@Repository("userPOMapper")
public interface UserPOMapper {

    /**
     * 批量插入UserPO表
     * @param userPOList
     * @return
     */
    boolean setUserData(List<UserPO> userPOList);

    /**
     * 根据手机号查询个人习惯表
     * @param telphone
     * @return
     */
    UserPO selectByTelphone(String telphone);
    List<UserPO> selectAll();

    /**
     * 查询个人习惯表中ph_id最大的值
     * @return
     */
    Integer selectMaxId();
}
