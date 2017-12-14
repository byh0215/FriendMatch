package jdte.friendmatch.api.impl;

import jdte.friendmatch.api.mapper.UserPOMapper;
import jdte.friendmatch.api.pojo.UserPO;
import jdte.friendmatch.api.service.ExcelDataService;
import jdte.friendmatch.api.utils.ReadExcelData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.List;
@Service("excelDataService")
public class ExcelDataServiceImpl implements ExcelDataService{

	@Autowired
	private UserPOMapper userPOMapper;

	private static final Logger logger = LoggerFactory.getLogger(ExcelDataServiceImpl.class);

	@Override
	public boolean setUserData(String excelPath,int excelStartCol,int idIndex)
			throws IOException {
		List<UserPO> userPOList = null;
		try {
			userPOList = ReadExcelData.readExcelData(excelPath,excelStartCol,idIndex);
		} catch (IOException e) {
			logger.error("ExcelDataServiceImpl.setUserData导入出错, 错误信息为: {}",
					e.toString());
		}
		if(userPOList == null || userPOList.size() == 0)
		{
			return false;
		}
		return userPOMapper.setUserData(userPOList);
	}

	@Override
	public Integer getMaxId() throws Exception {
		Integer result = 0;
		try {
			result = userPOMapper.selectMaxId();
		} catch (Exception e) {
			logger.error("ExcelDataServiceImpl.getMaxId查询出错, 错误信息为: {}",
					e.toString());
		}
		return result;
	}

}
