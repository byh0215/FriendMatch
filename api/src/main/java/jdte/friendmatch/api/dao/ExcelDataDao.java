package jdte.friendmatch.api.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import jdte.friendmatch.api.pojo.UserPO;

/**
 * 
* @ClassName: ExcelDataDao
* @Description: 操作excel数据的Dao
* @author zhangmeng
* @date 2017年12月3日 下午5:07:19
* @version V1.0 
 */
@Repository("excelDataDao")
public interface ExcelDataDao {

	boolean setUserData(List<UserPO> userPOList);
}
