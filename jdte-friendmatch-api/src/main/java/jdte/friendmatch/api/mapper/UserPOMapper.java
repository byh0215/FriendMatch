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
@Repository("userPOMapper")
public interface UserPOMapper {
        boolean setUserData(List<UserPO> userPOList);
        List<MatchResult> selectByTelphone(String telphone);
        Integer selectMaxId();
}
